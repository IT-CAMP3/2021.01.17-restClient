package pl.camp.it.rest.client.bookstore.api;

import pl.camp.it.rest.client.bookstore.api.model.AddOrderPositionModel;
import pl.camp.it.rest.client.bookstore.api.model.ResponseEntity;
import pl.camp.it.rest.client.bookstore.api.model.RestOrderPosition;

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
public interface OrderPositionRestControllerApi  {

    /**
     * addOrderPositionToOrder
     *
     */
    @PUT
    @Path("/api/orderpositions/{orderId}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "addOrderPositionToOrder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestOrderPosition.class),
        @ApiResponse(code = 201, message = "Created", response = .class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public RestOrderPosition addOrderPositionToOrderUsingPUT(@PathParam("orderId") Integer orderId, AddOrderPositionModel orderPositionModel);

    /**
     * deleteOrderPosition
     *
     */
    @DELETE
    @Path("/api/orderpositions/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "deleteOrderPosition", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class),
        @ApiResponse(code = 204, message = "No Content", response = .class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class) })
    public ResponseEntity deleteOrderPositionUsingDELETE(@PathParam("id") Integer id);

    /**
     * getAllOrderPositions
     *
     */
    @GET
    @Path("/api/orderpositions")
    @Produces({ "*/*" })
    @ApiOperation(value = "getAllOrderPositions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestOrderPosition.class, responseContainer = "array"),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public List<RestOrderPosition> getAllOrderPositionsUsingGET();

    /**
     * getOrderPositionById
     *
     */
    @GET
    @Path("/api/orderpositions/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrderPositionById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestOrderPosition.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public RestOrderPosition getOrderPositionByIdUsingGET(@PathParam("id") Integer id);

    /**
     * getOrderPositionsForOrderById
     *
     */
    @GET
    @Path("/api/orderpositions/order/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrderPositionsForOrderById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestOrderPosition.class, responseContainer = "array"),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public List<RestOrderPosition> getOrderPositionsForOrderByIdUsingGET(@PathParam("id") Integer id);
}

