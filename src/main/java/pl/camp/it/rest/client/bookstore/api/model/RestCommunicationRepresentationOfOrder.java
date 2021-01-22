package pl.camp.it.rest.client.bookstore.api.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RestCommunicationRepresentationOfOrder  {
  
  @ApiModelProperty(value = "order unique id")
 /**
   * order unique id  
  **/
  private Integer id = null;

  @ApiModelProperty(value = "")
  private List<String> positions = null;

  @ApiModelProperty(value = "")
  private Double price = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("ORDERED") ORDERED(String.valueOf("ORDERED")), @XmlEnumValue("ACCEPTED") ACCEPTED(String.valueOf("ACCEPTED")), @XmlEnumValue("SENT") SENT(String.valueOf("SENT")), @XmlEnumValue("ENDED") ENDED(String.valueOf("ENDED"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private StatusEnum status = null;

  @ApiModelProperty(value = "")
  private String user = null;
 /**
   * order unique id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RestCommunicationRepresentationOfOrder id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get positions
   * @return positions
  **/
  @JsonProperty("positions")
  public List<String> getPositions() {
    return positions;
  }

  public void setPositions(List<String> positions) {
    this.positions = positions;
  }

  public RestCommunicationRepresentationOfOrder positions(List<String> positions) {
    this.positions = positions;
    return this;
  }

  public RestCommunicationRepresentationOfOrder addPositionsItem(String positionsItem) {
    this.positions.add(positionsItem);
    return this;
  }

 /**
   * Get price
   * @return price
  **/
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public RestCommunicationRepresentationOfOrder price(Double price) {
    this.price = price;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RestCommunicationRepresentationOfOrder status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get user
   * @return user
  **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public RestCommunicationRepresentationOfOrder user(String user) {
    this.user = user;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestCommunicationRepresentationOfOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

