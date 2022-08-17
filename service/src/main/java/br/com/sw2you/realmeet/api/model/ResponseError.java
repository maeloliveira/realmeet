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
 * ResponseError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-10T23:24:27.171536500-03:00[America/Sao_Paulo]")

public class ResponseError  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("field")
  private String field;

  @JsonProperty("errorCode")
  private String errorCode;

  public ResponseError field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ResponseError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseError responseError = (ResponseError) o;
    return Objects.equals(this.field, responseError.field) &&
        Objects.equals(this.errorCode, responseError.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseError {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

