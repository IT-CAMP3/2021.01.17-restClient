package pl.camp.it.rest.client.bookstore.api.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RestOrderPosition  {
  
  @ApiModelProperty(value = "")
  private String book = null;

  @ApiModelProperty(value = "")
  private Integer id = null;

  @ApiModelProperty(value = "")
  private String order = null;

  @ApiModelProperty(value = "")
  private Integer pieces = null;
 /**
   * Get book
   * @return book
  **/
  @JsonProperty("book")
  public String getBook() {
    return book;
  }

  public void setBook(String book) {
    this.book = book;
  }

  public RestOrderPosition book(String book) {
    this.book = book;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RestOrderPosition id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get order
   * @return order
  **/
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public RestOrderPosition order(String order) {
    this.order = order;
    return this;
  }

 /**
   * Get pieces
   * @return pieces
  **/
  @JsonProperty("pieces")
  public Integer getPieces() {
    return pieces;
  }

  public void setPieces(Integer pieces) {
    this.pieces = pieces;
  }

  public RestOrderPosition pieces(Integer pieces) {
    this.pieces = pieces;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestOrderPosition {\n");
    
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pieces: ").append(toIndentedString(pieces)).append("\n");
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

