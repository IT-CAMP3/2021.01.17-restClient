package pl.camp.it.rest.client.bookstore.api;

import pl.camp.it.rest.client.bookstore.api.model.Book;
import pl.camp.it.rest.client.bookstore.api.model.ResponseEntity;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Book Store API
 *
 * <p>Piękne API księgarni
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface BookRestControllerApi  {

    /**
     * addBook
     *
     */
    @PUT
    @Path("/books")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "addBook", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class),
        @ApiResponse(code = 201, message = "Created", response = .class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public Book addBookUsingPUT(Book book);

    /**
     * deleteBook
     *
     */
    @DELETE
    @Path("/books/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "deleteBook", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class),
        @ApiResponse(code = 204, message = "No Content", response = .class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class) })
    public ResponseEntity deleteBookUsingDELETE(@PathParam("id") Integer id);

    /**
     * Get all books from BookStore
     *
     * Zwraca wszystkie książki znajdujące się w bazie danych
     *
     */
    @GET
    @Path("/books")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get all books from BookStore", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class, responseContainer = "array"),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public List<Book> getAllBooksUsingGET();

    /**
     * getBookById
     *
     */
    @GET
    @Path("/books/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getBookById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public Book getBookByIdUsingGET(@PathParam("id") Integer id);

    /**
     * getBooksWithFilter
     *
     */
    @GET
    @Path("/books/filter")
    @Produces({ "*/*" })
    @ApiOperation(value = "getBooksWithFilter", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class, responseContainer = "array"),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public List<Book> getBooksWithFilterUsingGET(@QueryParam("pattern")String pattern);

    /**
     * updateBook
     *
     */
    @POST
    @Path("/books")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "updateBook", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class),
        @ApiResponse(code = 201, message = "Created", response = .class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public Book updateBookUsingPOST(Book book);
}

