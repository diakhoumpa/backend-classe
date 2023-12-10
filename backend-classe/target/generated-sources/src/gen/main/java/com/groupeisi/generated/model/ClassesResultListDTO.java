package com.groupeisi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.groupeisi.generated.model.ClasseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClassesResultListDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-12-08T19:12:25.595791300Z[Atlantic/Reykjavik]")

public class ClassesResultListDTO   {
  @JsonProperty("classeList")
  @Valid
  private List<ClasseDTO> classeList = null;

  public ClassesResultListDTO classeList(List<ClasseDTO> classeList) {
    this.classeList = classeList;
    return this;
  }

  public ClassesResultListDTO addClasseListItem(ClasseDTO classeListItem) {
    if (this.classeList == null) {
      this.classeList = new ArrayList<>();
    }
    this.classeList.add(classeListItem);
    return this;
  }

  /**
   * The List of the ClasseDTO
   * @return classeList
  */
  @ApiModelProperty(value = "The List of the ClasseDTO")

  @Valid

  public List<ClasseDTO> getClasseList() {
    return classeList;
  }

  public void setClasseList(List<ClasseDTO> classeList) {
    this.classeList = classeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassesResultListDTO classesResultListDTO = (ClassesResultListDTO) o;
    return Objects.equals(this.classeList, classesResultListDTO.classeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassesResultListDTO {\n");
    
    sb.append("    classeList: ").append(toIndentedString(classeList)).append("\n");
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

