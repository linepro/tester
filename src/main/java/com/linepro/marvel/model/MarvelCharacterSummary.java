package com.linepro.marvel.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MarvelCharacterSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-26T22:04:28.241+01:00")

public class MarvelCharacterSummary   {
  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("role")
  private String role = null;

  public MarvelCharacterSummary resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

  /**
   * The path to the individual character resource.
   * @return resourceURI
  **/
  @ApiModelProperty(value = "The path to the individual character resource.")


  public String getResourceURI() {
    return resourceURI;
  }

  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public MarvelCharacterSummary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The full name of the character.
   * @return name
  **/
  @ApiModelProperty(value = "The full name of the character.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MarvelCharacterSummary role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the creator in the parent entity.
   * @return role
  **/
  @ApiModelProperty(value = "The role of the creator in the parent entity.")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarvelCharacterSummary characterSummary = (MarvelCharacterSummary) o;
    return Objects.equals(this.resourceURI, characterSummary.resourceURI) &&
        Objects.equals(this.name, characterSummary.name) &&
        Objects.equals(this.role, characterSummary.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceURI, name, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarvelCharacterSummary {\n");
    
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

