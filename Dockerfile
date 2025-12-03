# Etapa 1: Compilación con Maven
FROM maven:3.8.8-eclipse-temurin-8 AS build

WORKDIR /app

# Copiar archivos de configuración de Maven primero (para aprovechar caché de Docker)
COPY pom.xml .

# Descargar dependencias (esto se cachea si pom.xml no cambia)
RUN mvn dependency:go-offline -B

# Copiar todo el código fuente
COPY src ./src

# Compilar el proyecto
RUN mvn clean package -DskipTests

# Etapa 2: Imagen final ligera
FROM eclipse-temurin:8-jre-ubi9-minimal

WORKDIR /app

# Copiar el JAR compilado de la etapa anterior
COPY --from=build /app/target/swagger-spring-1.0.0.jar app.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "app.jar" ]