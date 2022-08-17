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
 * UpdateRoomDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-10T23:24:27.171536500-03:00[America/Sao_Paulo]")

public class UpdateRoomDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("seats")
  private Integer seats;

  public UpdateRoomDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateRoomDTO seats(Integer seats) {
    this.seats = seats;
    return this;
  }

  /**
   * Get seats
   * @return seats
  */
  @ApiModelProperty(value = "")


  public Integer getSeats() {
    return seats;
  }

  public void setSeats(Integer seats) {
    this.seats = seats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRoomDTO updateRoomDTO = (UpdateRoomDTO) o;
    return Objects.equals(this.name, updateRoomDTO.name) &&
        Objects.equals(this.seats, updateRoomDTO.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRoomDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
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

