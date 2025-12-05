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
 * SongAudio
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-10-23T09:58:42.026149969Z[GMT]")


public class SongAudio   {
  @JsonProperty("url")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String url = null;

  @JsonProperty("bitrate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer bitrate = null;

  @JsonProperty("codec")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String codec = null;


  public SongAudio url(String url) { 

    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   **/
  
  @Schema(description = "")
  
  public String getUrl() {  
    return url;
  }



  public void setUrl(String url) { 
    this.url = url;
  }

  public SongAudio bitrate(Integer bitrate) { 

    this.bitrate = bitrate;
    return this;
  }

  /**
   * Get bitrate
   * @return bitrate
   **/
  
  @Schema(description = "")
  
  public Integer getBitrate() {  
    return bitrate;
  }



  public void setBitrate(Integer bitrate) { 
    this.bitrate = bitrate;
  }

  public SongAudio codec(String codec) { 

    this.codec = codec;
    return this;
  }

  /**
   * Get codec
   * @return codec
   **/
  
  @Schema(description = "")
  
  public String getCodec() {  
    return codec;
  }



  public void setCodec(String codec) { 
    this.codec = codec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SongAudio songAudio = (SongAudio) o;
    return Objects.equals(this.url, songAudio.url) &&
        Objects.equals(this.bitrate, songAudio.bitrate) &&
        Objects.equals(this.codec, songAudio.codec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, bitrate, codec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SongAudio {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
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
