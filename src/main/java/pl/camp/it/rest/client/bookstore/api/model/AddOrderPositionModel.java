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

public class AddOrderPositionModel  {
  
  @ApiModelProperty(value = "")
  private Integer bookId = null;

  @ApiModelProperty(value = "")
  private Integer pieces = null;
 /**
   * Get bookId
   * @return bookId
  **/
  @JsonProperty("bookId")
  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  public AddOrderPositionModel bookId(Integer bookId) {
    this.bookId = bookId;
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

  public AddOrderPositionModel pieces(Integer pieces) {
    this.pieces = pieces;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOrderPositionModel {\n");
    
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
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

