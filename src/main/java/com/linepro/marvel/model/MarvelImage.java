package com.linepro.marvel.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MarvelImage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-26T22:04:28.241+01:00")

public class MarvelImage   {
  @JsonProperty("path")
  private String path = null;

  @JsonProperty("extension")
  private String extension = null;

  public MarvelImage path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The directory path of to the image.
   * @return path
  **/
  @ApiModelProperty(value = "The directory path of to the image.")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public MarvelImage extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The file extension for the image.
   * @return extension
  **/
  @ApiModelProperty(value = "The file extension for the image.")


  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarvelImage image = (MarvelImage) o;
    return Objects.equals(this.path, image.path) &&
        Objects.equals(this.extension, image.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarvelImage {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

