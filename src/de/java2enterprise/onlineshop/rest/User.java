package de.java2enterprise.onlineshop.rest;

import de.java2enterprise.onlineshop.model.Customer;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by cbokeloh on 18.02.16.
 */
@Path("/user")
public interface User {
    @GET
    @Produces("application/json")
    @Path("allUsers")
    public List<Customer> allUsers();

}
