package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;

/**
 * Song
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-10-23T09:58:42.026149969Z[GMT]")


public class Song   {
  @JsonProperty("id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private UUID id = null;

  @JsonProperty("title")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String title = null;

  @JsonProperty("durationSec")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer durationSec = null;

  @JsonProperty("trackNumber")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer trackNumber = null;

  @JsonProperty("artist")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private ArtistRef artist = null;

  @JsonProperty("album")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private AlbumRef album = null;

  @JsonProperty("label")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private LabelRef label = null;

  @JsonProperty("audio")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private SongAudio audio = null;


  public Song id(UUID id) { 

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  
  @Schema(description = "")
  
@Valid
  public UUID getId() {  
    return id;
  }



  public void setId(UUID id) { 
    this.id = id;
  }

  public Song title(String title) { 

    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  
  @Schema(description = "")
  
  public String getTitle() {  
    return title;
  }



  public void setTitle(String title) { 
    this.title = title;
  }

  public Song durationSec(Integer durationSec) { 

    this.durationSec = durationSec;
    return this;
  }

  /**
   * Get durationSec
   * @return durationSec
   **/
  
  @Schema(description = "")
  
  public Integer getDurationSec() {  
    return durationSec;
  }



  public void setDurationSec(Integer durationSec) { 
    this.durationSec = durationSec;
  }

  public Song trackNumber(Integer trackNumber) { 

    this.trackNumber = trackNumber;
    return this;
  }

  /**
   * Get trackNumber
   * @return trackNumber
   **/
  
  @Schema(description = "")
  
  public Integer getTrackNumber() {  
    return trackNumber;
  }



  public void setTrackNumber(Integer trackNumber) { 
    this.trackNumber = trackNumber;
  }

  public Song artist(ArtistRef artist) { 

    this.artist = artist;
    return this;
  }

  /**
   * Get artist
   * @return artist
   **/
  
  @Schema(description = "")
  
@Valid
  public ArtistRef getArtist() {  
    return artist;
  }



  public void setArtist(ArtistRef artist) { 
    this.artist = artist;
  }

  public Song album(AlbumRef album) { 

    this.album = album;
    return this;
  }

  /**
   * Get album
   * @return album
   **/
  
  @Schema(description = "")
  
@Valid
  public AlbumRef getAlbum() {  
    return album;
  }



  public void setAlbum(AlbumRef album) { 
    this.album = album;
  }

  public Song label(LabelRef label) { 

    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   **/
  
  @Schema(description = "")
  
@Valid
  public LabelRef getLabel() {  
    return label;
  }



  public void setLabel(LabelRef label) { 
    this.label = label;
  }

  public Song audio(SongAudio audio) { 

    this.audio = audio;
    return this;
  }

  /**
   * Get audio
   * @return audio
   **/
  
  @Schema(description = "")
  
@Valid
  public SongAudio getAudio() {  
    return audio;
  }



  public void setAudio(SongAudio audio) { 
    this.audio = audio;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Song song = (Song) o;
    return Objects.equals(this.id, song.id) &&
        Objects.equals(this.title, song.title) &&
        Objects.equals(this.durationSec, song.durationSec) &&
        Objects.equals(this.trackNumber, song.trackNumber) &&
        Objects.equals(this.artist, song.artist) &&
        Objects.equals(this.album, song.album) &&
        Objects.equals(this.label, song.label) &&
        Objects.equals(this.audio, song.audio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, durationSec, trackNumber, artist, album, label, audio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Song {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    durationSec: ").append(toIndentedString(durationSec)).append("\n");
    sb.append("    trackNumber: ").append(toIndentedString(trackNumber)).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    album: ").append(toIndentedString(album)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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
