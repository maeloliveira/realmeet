package br.com.sw2you.realmeet.api.model;

import java.util.Objects;
import br.com.sw2you.realmeet.api.model.CreateAllocationDTOAllOf;
import br.com.sw2you.realmeet.api.model.UpdateAllocationDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateAllocationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-10T23:24:27.171536500-03:00[America/Sao_Paulo]")

public class CreateAllocationDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("subject")
  private String subject;

  @JsonProperty("startAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startAt;

  @JsonProperty("endAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endAt;

  @JsonProperty("roomId")
  private Long roomId;

  @JsonProperty("employeeName")
  private String employeeName;

  @JsonProperty("employeeEmail")
  private String employeeEmail;

  public CreateAllocationDTO subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  @ApiModelProperty(value = "")


  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public CreateAllocationDTO startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * Get startAt
   * @return startAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartAt() {
    return startAt;
  }

  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }

  public CreateAllocationDTO endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  /**
   * Get endAt
   * @return endAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndAt() {
    return endAt;
  }

  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }

  public CreateAllocationDTO roomId(Long roomId) {
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

  public CreateAllocationDTO employeeName(String employeeName) {
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

  public CreateAllocationDTO employeeEmail(String employeeEmail) {
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
    CreateAllocationDTO createAllocationDTO = (CreateAllocationDTO) o;
    return Objects.equals(this.subject, createAllocationDTO.subject) &&
        Objects.equals(this.startAt, createAllocationDTO.startAt) &&
        Objects.equals(this.endAt, createAllocationDTO.endAt) &&
        Objects.equals(this.roomId, createAllocationDTO.roomId) &&
        Objects.equals(this.employeeName, createAllocationDTO.employeeName) &&
        Objects.equals(this.employeeEmail, createAllocationDTO.employeeEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, startAt, endAt, roomId, employeeName, employeeEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAllocationDTO {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
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

