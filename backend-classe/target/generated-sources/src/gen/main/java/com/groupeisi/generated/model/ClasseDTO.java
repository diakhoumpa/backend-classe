package com.groupeisi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClasseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-12-08T19:12:25.595791300Z[Atlantic/Reykjavik]")

public class ClasseDTO   {
  @JsonProperty("idClasse")
  private Long idClasse;

  @JsonProperty("name")
  private String name;

  public ClasseDTO idClasse(Long idClasse) {
    this.idClasse = idClasse;
    return this;
  }

  /**
   * Fonctionnel id of the classe
   * @return idClasse
  */
  @ApiModelProperty(value = "Fonctionnel id of the classe")


  public Long getIdClasse() {
    return idClasse;
  }

  public void setIdClasse(Long idClasse) {
    this.idClasse = idClasse;
  }

  public ClasseDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of the classe
   * @return name
  */
  @ApiModelProperty(value = "name of the classe")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClasseDTO classeDTO = (ClasseDTO) o;
    return Objects.equals(this.idClasse, classeDTO.idClasse) &&
        Objects.equals(this.name, classeDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idClasse, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClasseDTO {\n");
    
    sb.append("    idClasse: ").append(toIndentedString(idClasse)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

