package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;

/**
 * MerchStats
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-10-23T09:58:42.026149969Z[GMT]")


public class MerchStats   {
  @JsonProperty("merchSales")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer merchSales = null;

  @JsonProperty("merchRate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private BigDecimal merchRate = null;


  public MerchStats merchSales(Integer merchSales) { 

    this.merchSales = merchSales;
    return this;
  }

  /**
   * La cantidad de ventas de un artículo
   * @return merchSales
   **/
  
  @Schema(example = "100", description = "La cantidad de ventas de un artículo")
  
  public Integer getMerchSales() {  
    return merchSales;
  }



  public void setMerchSales(Integer merchSales) { 
    this.merchSales = merchSales;
  }

  public MerchStats merchRate(BigDecimal merchRate) { 

    this.merchRate = merchRate;
    return this;
  }

  /**
   * La nota de un artículo (escala 0-5).
   * @return merchRate
   **/
  
  @Schema(example = "2.8", description = "La nota de un artículo (escala 0-5).")
  
@Valid
  public BigDecimal getMerchRate() {  
    return merchRate;
  }



  public void setMerchRate(BigDecimal merchRate) { 
    this.merchRate = merchRate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchStats merchStats = (MerchStats) o;
    return Objects.equals(this.merchSales, merchStats.merchSales) &&
        Objects.equals(this.merchRate, merchStats.merchRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchSales, merchRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchStats {\n");
    
    sb.append("    merchSales: ").append(toIndentedString(merchSales)).append("\n");
    sb.append("    merchRate: ").append(toIndentedString(merchRate)).append("\n");
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
