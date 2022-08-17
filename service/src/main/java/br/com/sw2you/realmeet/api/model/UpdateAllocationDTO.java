package br.com.sw2you.realmeet.api.model;

import java.util.Objects;
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
 * UpdateAllocationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-10T23:24:27.171536500-03:00[America/Sao_Paulo]")

public class UpdateAllocationDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("subject")
  private String subject;

  @JsonProperty("startAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startAt;

  @JsonProperty("endAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endAt;

  public UpdateAllocationDTO subject(String subject) {
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

  public UpdateAllocationDTO startAt(OffsetDateTime startAt) {
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

  public UpdateAllocationDTO endAt(OffsetDateTime endAt) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAllocationDTO updateAllocationDTO = (UpdateAllocationDTO) o;
    return Objects.equals(this.subject, updateAllocationDTO.subject) &&
        Objects.equals(this.startAt, updateAllocationDTO.startAt) &&
        Objects.equals(this.endAt, updateAllocationDTO.endAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, startAt, endAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAllocationDTO {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
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

