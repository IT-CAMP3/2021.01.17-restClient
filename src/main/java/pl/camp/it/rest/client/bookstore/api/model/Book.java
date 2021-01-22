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

public class Book  {
  
  @ApiModelProperty(value = "")
  private String author = null;


@XmlType(name="CategoryEnum")
@XmlEnum(String.class)
public enum CategoryEnum {

@XmlEnumValue("JAVA") JAVA(String.valueOf("JAVA")), @XmlEnumValue("OTHER") OTHER(String.valueOf("OTHER"));


    private String value;

    CategoryEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String v) {
        for (CategoryEnum b : CategoryEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private CategoryEnum category = null;

  @ApiModelProperty(value = "")
  private Integer id = null;

  @ApiModelProperty(value = "")
  private String isbn = null;

  @ApiModelProperty(value = "")
  private Integer pieces = null;

  @ApiModelProperty(value = "")
  private Double price = null;

  @ApiModelProperty(value = "")
  private String title = null;
 /**
   * Get author
   * @return author
  **/
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Book author(String author) {
    this.author = author;
    return this;
  }

 /**
   * Get category
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    if (category == null) {
      return null;
    }
    return category.value();
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Book category(CategoryEnum category) {
    this.category = category;
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

  public Book id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get isbn
   * @return isbn
  **/
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Book isbn(String isbn) {
    this.isbn = isbn;
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

  public Book pieces(Integer pieces) {
    this.pieces = pieces;
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

  public Book price(Double price) {
    this.price = price;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Book title(String title) {
    this.title = title;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    pieces: ").append(toIndentedString(pieces)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

