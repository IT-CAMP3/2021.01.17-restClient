package pl.camp.it.rest.client.bookstore.api;

import pl.camp.it.rest.client.bookstore.api.model.User;

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
public interface UserRestControllerApi  {

    /**
     * addUser
     *
     */
    @PUT
    @Path("/users")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "addUser", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 201, message = "Created", response = .class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public User addUserUsingPUT(User user);

    /**
     * getAllUsers
     *
     */
    @GET
    @Path("/users")
    @Produces({ "*/*" })
    @ApiOperation(value = "getAllUsers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class, responseContainer = "array"),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public List<User> getAllUsersUsingGET();

    /**
     * getUserById
     *
     */
    @GET
    @Path("/users/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getUserById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public User getUserByIdUsingGET(@PathParam("id") Integer id);

    /**
     * updateUser
     *
     */
    @POST
    @Path("/users")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "updateUser", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 201, message = "Created", response = .class),
        @ApiResponse(code = 401, message = "Unauthorized", response = .class),
        @ApiResponse(code = 403, message = "Forbidden", response = .class),
        @ApiResponse(code = 404, message = "Not Found", response = .class) })
    public User updateUserUsingPOST(User user);
}

