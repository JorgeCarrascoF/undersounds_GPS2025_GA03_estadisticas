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
 * AlbumStats
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-10-23T09:58:42.026149969Z[GMT]")


public class AlbumStats   {
  @JsonProperty("albumPlays")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer albumPlays = null;

  @JsonProperty("albumSales")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer albumSales = null;

  @JsonProperty("albumRate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private BigDecimal albumRate = null;


  public AlbumStats albumPlays(Integer albumPlays) { 

    this.albumPlays = albumPlays;
    return this;
  }

  /**
   * La cantidad de escuchas a un album
   * @return albumPlays
   **/
  
  @Schema(example = "100", description = "La cantidad de escuchas a un album")
  
  public Integer getAlbumPlays() {  
    return albumPlays;
  }



  public void setAlbumPlays(Integer albumPlays) { 
    this.albumPlays = albumPlays;
  }

  public AlbumStats albumSales(Integer albumSales) { 

    this.albumSales = albumSales;
    return this;
  }

  /**
   * La cantidad de ventas de un album
   * @return albumSales
   **/
  
  @Schema(example = "100", description = "La cantidad de ventas de un album")
  
  public Integer getAlbumSales() {  
    return albumSales;
  }



  public void setAlbumSales(Integer albumSales) { 
    this.albumSales = albumSales;
  }

  public AlbumStats albumRate(BigDecimal albumRate) { 

    this.albumRate = albumRate;
    return this;
  }

  /**
   * La nota de un álbum (escala 0-5).
   * @return albumRate
   **/
  
  @Schema(example = "2.8", description = "La nota de un álbum (escala 0-5).")
  
@Valid
  public BigDecimal getAlbumRate() {  
    return albumRate;
  }



  public void setAlbumRate(BigDecimal albumRate) { 
    this.albumRate = albumRate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlbumStats albumStats = (AlbumStats) o;
    return Objects.equals(this.albumPlays, albumStats.albumPlays) &&
        Objects.equals(this.albumSales, albumStats.albumSales) &&
        Objects.equals(this.albumRate, albumStats.albumRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(albumPlays, albumSales, albumRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlbumStats {\n");
    
    sb.append("    albumPlays: ").append(toIndentedString(albumPlays)).append("\n");
    sb.append("    albumSales: ").append(toIndentedString(albumSales)).append("\n");
    sb.append("    albumRate: ").append(toIndentedString(albumRate)).append("\n");
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
