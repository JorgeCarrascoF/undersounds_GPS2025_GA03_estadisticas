package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

/**
 * ArtistStats
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-10-23T09:58:42.026149969Z[GMT]")


public class ArtistStats   {
  @JsonProperty("totalSales")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer totalSales = null;

  @JsonProperty("totalPlays")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer totalPlays = null;

  @JsonProperty("totalFollowers")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer totalFollowers = null;


  public ArtistStats totalSales(Integer totalSales) { 

    this.totalSales = totalSales;
    return this;
  }

  /**
   * La cantidad de items vendidos (merch y albums)
   * @return totalSales
   **/
  
  @Schema(example = "300", description = "La cantidad de items vendidos (merch y albums)")
  
  public Integer getTotalSales() {  
    return totalSales;
  }



  public void setTotalSales(Integer totalSales) { 
    this.totalSales = totalSales;
  }

  public ArtistStats totalPlays(Integer totalPlays) { 

    this.totalPlays = totalPlays;
    return this;
  }

  /**
   * La cantidad de reproducciones de las canciones
   * @return totalPlays
   **/
  
  @Schema(example = "1000", description = "La cantidad de reproducciones de las canciones")
  
  public Integer getTotalPlays() {  
    return totalPlays;
  }



  public void setTotalPlays(Integer totalPlays) { 
    this.totalPlays = totalPlays;
  }

  public ArtistStats totalFollowers(Integer totalFollowers) { 

    this.totalFollowers = totalFollowers;
    return this;
  }

  /**
   * La cantidad de seguidores
   * @return totalFollowers
   **/
  
  @Schema(example = "100", description = "La cantidad de seguidores")
  
  public Integer getTotalFollowers() {  
    return totalFollowers;
  }



  public void setTotalFollowers(Integer totalFollowers) { 
    this.totalFollowers = totalFollowers;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtistStats artistStats = (ArtistStats) o;
    return Objects.equals(this.totalSales, artistStats.totalSales) &&
        Objects.equals(this.totalPlays, artistStats.totalPlays) &&
        Objects.equals(this.totalFollowers, artistStats.totalFollowers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSales, totalPlays, totalFollowers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistStats {\n");
    
    sb.append("    totalSales: ").append(toIndentedString(totalSales)).append("\n");
    sb.append("    totalPlays: ").append(toIndentedString(totalPlays)).append("\n");
    sb.append("    totalFollowers: ").append(toIndentedString(totalFollowers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
