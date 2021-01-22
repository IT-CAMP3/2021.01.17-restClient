package pl.camp.it.rest.client.bookstore.api.model;

import java.util.ArrayList;
import java.util.List;
import pl.camp.it.rest.client.bookstore.api.model.AddOrderPositionModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddOrderRequest  {
  
  @ApiModelProperty(value = "")
  private List<AddOrderPositionModel> positions = null;

  @ApiModelProperty(value = "")
  private Double price = null;

  @ApiModelProperty(value = "")
  private Integer userId = null;
 /**
   * Get positions
   * @return positions
  **/
  @JsonProperty("positions")
  public List<AddOrderPositionModel> getPositions() {
    return positions;
  }

  public void setPositions(List<AddOrderPositionModel> positions) {
    this.positions = positions;
  }

  public AddOrderRequest positions(List<AddOrderPositionModel> positions) {
    this.positions = positions;
    return this;
  }

  public AddOrderRequest addPositionsItem(AddOrderPositionModel positionsItem) {
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

  public AddOrderRequest price(Double price) {
    this.price = price;
    return this;
  }

 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public AddOrderRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOrderRequest {\n");
    
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

