package com.linepro.marvel.model;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Swagger generated MarvelCharacter generated and modified for typesafe lists
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-26T22:04:28.241+01:00")
@JsonIgnoreProperties(ignoreUnknown=true)
public class MarvelCharacter   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("modified")
  private java.util.Date modified = null;

  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("urls")
  private List<MarvelUrl> urls = null;

  @JsonProperty("thumbnail")
  private MarvelImage thumbnail = null;

  public MarvelCharacter id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the character resource.
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MarvelCharacter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the character.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MarvelCharacter description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short bio or description of the character.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MarvelCharacter modified(java.util.Date modified) {
    this.modified = modified;
    return this;
  }

  /**
   * The date the resource was most recently modified.
   * @return modified
  **/
  public java.util.Date getModified() {
    return modified;
  }

  public void setModified(java.util.Date modified) {
    this.modified = modified;
  }

  public MarvelCharacter resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

  /**
   * The canonical URL identifier for this resource.
   * @return resourceURI
  **/
  public String getResourceURI() {
    return resourceURI;
  }

  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public MarvelCharacter urls(List<MarvelUrl> urls) {
    this.urls = urls;
    return this;
  }

  /**
   * A set of public web site URLs for the resource.
   * @return urls
  **/
  public List<MarvelUrl> getUrls() {
    return urls;
  }

  public void setUrls(List<MarvelUrl> urls) {
    this.urls = urls;
  }

  public MarvelCharacter thumbnail(MarvelImage thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * The representative image for this character.
   * @return thumbnail
  **/
  public MarvelImage getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(MarvelImage thumbnail) {
    this.thumbnail = thumbnail;
  }
}
