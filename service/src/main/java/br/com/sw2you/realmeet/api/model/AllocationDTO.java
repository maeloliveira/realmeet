package br.com.sw2you.realmeet.api.model;

import java.util.Objects;
import br.com.sw2you.realmeet.api.model.CreateAllocationDTO;
import br.com.sw2you.realmeet.api.model.RoomDTOAllOf;
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
 * AllocationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-10T23:24:27.171536500-03:00[America/Sao_Paulo]")

public class AllocationDTO  implements Serializable {
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

  @JsonProperty("id")
  private Long id;

  public AllocationDTO subject(String subject) {
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

  public AllocationDTO startAt(OffsetDateTime startAt) {
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

  public AllocationDTO endAt(OffsetDateTime endAt) {
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

  public AllocationDTO roomId(Long roomId) {
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

  public AllocationDTO employeeName(String employeeName) {
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

  public AllocationDTO employeeEmail(String employeeEmail) {
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

  public AllocationDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationDTO allocationDTO = (AllocationDTO) o;
    return Objects.equals(this.subject, allocationDTO.subject) &&
        Objects.equals(this.startAt, allocationDTO.startAt) &&
        Objects.equals(this.endAt, allocationDTO.endAt) &&
        Objects.equals(this.roomId, allocationDTO.roomId) &&
        Objects.equals(this.employeeName, allocationDTO.employeeName) &&
        Objects.equals(this.employeeEmail, allocationDTO.employeeEmail) &&
        Objects.equals(this.id, allocationDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, startAt, endAt, roomId, employeeName, employeeEmail, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationDTO {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    employeeEmail: ").append(toIndentedString(employeeEmail)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

