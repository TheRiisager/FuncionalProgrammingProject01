/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facades.EmlpoyeeFacade;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import utils.EMF_Creator;

/**
 * REST Web Service
 *
 * @author Nicol
 */
@Path("employee")
public class EmployeeResource {
    @Context
    private UriInfo context;
    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    
    private static final EmlpoyeeFacade FACADE = EmlpoyeeFacade.getEmlpoyeeFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    

    /**
     * Creates a new instance of EmployeeResource
     */
    public EmployeeResource() {
    }

    /**
     * Retrieves representation of an instance of rest.EmployeeResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
   @GET
    @Path("/employees")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEventsByCalendar() {
        return Response.ok().entity(GSON.toJson(FACADE.getEmployees())).build();
    }
    /**
     * PUT method for updating or creating an instance of EmployeeResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
