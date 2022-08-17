package br.com.sw2you.realmeet.api.model;

import java.util.Objects;
import br.com.sw2you.realmeet.api.model.CreateRoomDTO;
import br.com.sw2you.realmeet.api.model.RoomDTOAllOf;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoomDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-10T23:24:27.171536500-03:00[America/Sao_Paulo]")

public class RoomDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("seats")
  private Integer seats;

  @JsonProperty("id")
  private Long id;

  public RoomDTO name(String name) {
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

  public RoomDTO seats(Integer seats) {
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

  public RoomDTO id(Long id) {
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
    RoomDTO roomDTO = (RoomDTO) o;
    return Objects.equals(this.name, roomDTO.name) &&
        Objects.equals(this.seats, roomDTO.seats) &&
        Objects.equals(this.id, roomDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seats, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
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

