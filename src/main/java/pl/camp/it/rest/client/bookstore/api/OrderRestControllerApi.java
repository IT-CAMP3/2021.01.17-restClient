package pl.camp.it.rest.client.bookstore.api;

import pl.camp.it.rest.client.bookstore.api.model.AddOrderRequest;
import pl.camp.it.rest.client.bookstore.api.model.ResponseEntity;
import pl.camp.it.rest.client.bookstore.api.model.RestCommunicationRepresentationOfOrder;

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
public interface OrderRestControllerApi  {

    /**
     * addOrder
     *
     */
    @PUT
    @Path("/api/orders")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "addOrder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestCommunicationRepresentationOfOrder.class),
        @ApiResponse(code = 201, message = "Created", response = .class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public RestCommunicationRepresentationOfOrder addOrderUsingPUT(AddOrderRequest orderRequest);

    /**
     * deleteOrder
     *
     */
    @DELETE
    @Path("/api/orders/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "deleteOrder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class),
        @ApiResponse(code = 204, message = "No Content", response = .class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class) })
    public ResponseEntity deleteOrderUsingDELETE(@PathParam("id") Integer id);

    /**
     * getAllOrders
     *
     */
    @GET
    @Path("/api/orders")
    @Produces({ "*/*" })
    @ApiOperation(value = "getAllOrders", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestCommunicationRepresentationOfOrder.class, responseContainer = "array"),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public List<RestCommunicationRepresentationOfOrder> getAllOrdersUsingGET();

    /**
     * getOrderById
     *
     */
    @GET
    @Path("/api/orders/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrderById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestCommunicationRepresentationOfOrder.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public RestCommunicationRepresentationOfOrder getOrderByIdUsingGET(@PathParam("id") Integer id);

    /**
     * getOrdersForUser
     *
     */
    @GET
    @Path("/api/orders/user/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrdersForUser", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestCommunicationRepresentationOfOrder.class, responseContainer = "array"),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public List<RestCommunicationRepresentationOfOrder> getOrdersForUserUsingGET(@PathParam("id") Integer id);
}

