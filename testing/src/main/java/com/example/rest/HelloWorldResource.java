package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldResource {

    @GET
    @Path("/welcome")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello, World!";
    }
      
    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String testPath() {
        return "Test path is working";
    }
      
}
