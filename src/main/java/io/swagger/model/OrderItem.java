package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderItem
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-10-23T09:58:42.026149969Z[GMT]")

@Embeddable
public class OrderItem   {
  @JsonProperty("productId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String productId = null;

  @JsonProperty("productName")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String productName = null;

  @JsonProperty("type")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String type = null;

  @JsonProperty("quantity")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer quantity = null;

  @JsonProperty("unitPrice")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private BigDecimal unitPrice = null;


  public OrderItem productId(String productId) { 

    this.productId = productId;
    return this;
  }

  /**
   * ID del producto
   * @return productId
   **/
  
  @Schema(example = "item001", description = "ID del producto")
  
  public String getProductId() {  
    return productId;
  }



  public void setProductId(String productId) { 
    this.productId = productId;
  }

  public OrderItem productName(String productName) { 

    this.productName = productName;
    return this;
  }

  /**
   * El nombre del producto
   * @return productName
   **/
  
  @Schema(example = "Camiseta", description = "El nombre del producto")
  
  public String getProductName() {  
    return productName;
  }



  public void setProductName(String productName) { 
    this.productName = productName;
  }

  public OrderItem type(String type) { 

    this.type = type;
    return this;
  }

  /**
   * El tipo de producto
   * @return type
   **/
  
  @Schema(example = "album", description = "El tipo de producto")
  
  public String getType() {  
    return type;
  }



  public void setType(String type) { 
    this.type = type;
  }

  public OrderItem quantity(Integer quantity) { 

    this.quantity = quantity;
    return this;
  }

  /**
   * La cantidad de items comprados
   * @return quantity
   **/
  
  @Schema(example = "2", description = "La cantidad de items comprados")
  
  public Integer getQuantity() {  
    return quantity;
  }



  public void setQuantity(Integer quantity) { 
    this.quantity = quantity;
  }

  public OrderItem unitPrice(BigDecimal unitPrice) { 

    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * El precio unitario del item
   * @return unitPrice
   **/
  
  @Schema(example = "20", description = "El precio unitario del item")
  
@Valid
  public BigDecimal getUnitPrice() {  
    return unitPrice;
  }



  public void setUnitPrice(BigDecimal unitPrice) { 
    this.unitPrice = unitPrice;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.productId, orderItem.productId) &&
        Objects.equals(this.productName, orderItem.productName) &&
        Objects.equals(this.type, orderItem.type) &&
        Objects.equals(this.quantity, orderItem.quantity) &&
        Objects.equals(this.unitPrice, orderItem.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productName, type, quantity, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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
