package br.com.sw2you.realmeet.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateAllocationDTOAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-10T23:24:27.171536500-03:00[America/Sao_Paulo]")

public class CreateAllocationDTOAllOf  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("roomId")
  private Long roomId;

  @JsonProperty("employeeName")
  private String employeeName;

  @JsonProperty("employeeEmail")
  private String employeeEmail;

  public CreateAllocationDTOAllOf roomId(Long roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId
   * @return roomId
  */
  @ApiModelProperty(value = "")


  public Long getRoomId() {
    return roomId;
  }

  public void setRoomId(Long roomId) {
    this.roomId = roomId;
  }

  public CreateAllocationDTOAllOf employeeName(String employeeName) {
    this.employeeName = employeeName;
    return this;
  }

  /**
   * Get employeeName
   * @return employeeName
  */
  @ApiModelProperty(value = "")


  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public CreateAllocationDTOAllOf employeeEmail(String employeeEmail) {
    this.employeeEmail = employeeEmail;
    return this;
  }

  /**
   * Get employeeEmail
   * @return employeeEmail
  */
  @ApiModelProperty(value = "")


  public String getEmployeeEmail() {
    return employeeEmail;
  }

  public void setEmployeeEmail(String employeeEmail) {
    this.employeeEmail = employeeEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAllocationDTOAllOf createAllocationDTOAllOf = (CreateAllocationDTOAllOf) o;
    return Objects.equals(this.roomId, createAllocationDTOAllOf.roomId) &&
        Objects.equals(this.employeeName, createAllocationDTOAllOf.employeeName) &&
        Objects.equals(this.employeeEmail, createAllocationDTOAllOf.employeeEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, employeeName, employeeEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAllocationDTOAllOf {\n");
    
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    employeeEmail: ").append(toIndentedString(employeeEmail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

