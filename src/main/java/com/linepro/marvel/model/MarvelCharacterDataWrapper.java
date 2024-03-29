package com.linepro.marvel.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MarvelCharacterDataWrapper
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-26T22:04:28.241+01:00")

public class MarvelCharacterDataWrapper   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("copyright")
  private String copyright = null;

  @JsonProperty("attributionText")
  private String attributionText = null;

  @JsonProperty("attributionHTML")
  private String attributionHTML = null;

  @JsonProperty("data")
  private MarvelCharacterDataContainer data = null;

  @JsonProperty("etag")
  private String etag = null;

  public MarvelCharacterDataWrapper code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * The HTTP status code of the returned result.
   * @return code
  **/
  @ApiModelProperty(value = "The HTTP status code of the returned result.")


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public MarvelCharacterDataWrapper status(String status) {
    this.status = status;
    return this;
  }

  /**
   * A string description of the call status.
   * @return status
  **/
  @ApiModelProperty(value = "A string description of the call status.")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MarvelCharacterDataWrapper copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

  /**
   * The copyright notice for the returned result.
   * @return copyright
  **/
  @ApiModelProperty(value = "The copyright notice for the returned result.")


  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public MarvelCharacterDataWrapper attributionText(String attributionText) {
    this.attributionText = attributionText;
    return this;
  }

  /**
   * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
   * @return attributionText
  **/
  @ApiModelProperty(value = "The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.")


  public String getAttributionText() {
    return attributionText;
  }

  public void setAttributionText(String attributionText) {
    this.attributionText = attributionText;
  }

  public MarvelCharacterDataWrapper attributionHTML(String attributionHTML) {
    this.attributionHTML = attributionHTML;
    return this;
  }

  /**
   * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
   * @return attributionHTML
  **/
  @ApiModelProperty(value = "An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.")


  public String getAttributionHTML() {
    return attributionHTML;
  }

  public void setAttributionHTML(String attributionHTML) {
    this.attributionHTML = attributionHTML;
  }

  public MarvelCharacterDataWrapper data(MarvelCharacterDataContainer data) {
    this.data = data;
    return this;
  }

  /**
   * The results returned by the call.
   * @return data
  **/
  @ApiModelProperty(value = "The results returned by the call.")

  @Valid

  public MarvelCharacterDataContainer getData() {
    return data;
  }

  public void setData(MarvelCharacterDataContainer data) {
    this.data = data;
  }

  public MarvelCharacterDataWrapper etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A digest value of the content returned by the call.
   * @return etag
  **/
  @ApiModelProperty(value = "A digest value of the content returned by the call.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarvelCharacterDataWrapper characterDataWrapper = (MarvelCharacterDataWrapper) o;
    return Objects.equals(this.code, characterDataWrapper.code) &&
        Objects.equals(this.status, characterDataWrapper.status) &&
        Objects.equals(this.copyright, characterDataWrapper.copyright) &&
        Objects.equals(this.attributionText, characterDataWrapper.attributionText) &&
        Objects.equals(this.attributionHTML, characterDataWrapper.attributionHTML) &&
        Objects.equals(this.data, characterDataWrapper.data) &&
        Objects.equals(this.etag, characterDataWrapper.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status, copyright, attributionText, attributionHTML, data, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarvelCharacterDataWrapper {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    attributionText: ").append(toIndentedString(attributionText)).append("\n");
    sb.append("    attributionHTML: ").append(toIndentedString(attributionHTML)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

