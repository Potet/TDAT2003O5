package services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author nilstes
 */
@Path("/thepath/")
public class AService {
    private static String message = "Dette er en beskjed";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getSomething() {
        return message;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void setMessage(String m){
        message = m;
    }
}