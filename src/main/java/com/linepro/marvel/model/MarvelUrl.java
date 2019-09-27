package com.linepro.marvel.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MarvelUrl
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-26T22:04:28.241+01:00")

public class MarvelUrl   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  public MarvelUrl type(String type) {
    this.type = type;
    return this;
  }

  /**
   * A text identifier for the URL.
   * @return type
  **/
  @ApiModelProperty(value = "A text identifier for the URL.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MarvelUrl url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A full URL (including scheme, domain, and path).
   * @return url
  **/
  @ApiModelProperty(value = "A full URL (including scheme, domain, and path).")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarvelUrl url = (MarvelUrl) o;
    return Objects.equals(this.type, url.type) &&
        Objects.equals(this.url, url.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarvelUrl {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

