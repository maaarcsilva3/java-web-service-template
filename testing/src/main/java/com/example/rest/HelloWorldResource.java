package com.example.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.object.PojoObject;
import com.google.gson.Gson;

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
    
    @GET
    @Path("/getproduct")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getJson() {
    	
    	ArrayList <PojoObject> list = new ArrayList();
    	
    	PojoObject pojo = new PojoObject();
    	pojo.setLongName("Repsol Leader Super (Gas and Diesel) Semi Synthetic");
    	pojo.setShortName("Repsol Leader Super Semi Synthetic");
    	pojo.setViscosity("20W50 API SL/CF");
    	pojo.setPacking("1L");
    	pojo.setBoxContents("12X1L");
    	pojo.setWholesalerPrice("245");
    	pojo.setSrp("300/Liter");
    	
    	list.add(pojo);
    	
    	PojoObject pojo1 = new PojoObject();
    	pojo1.setLongName("Repsol Leader Super (Gas and Diesel) Semi Synthetic");
    	pojo1.setShortName("Repsol Leader Super Semi Synthetic");
    	pojo1.setViscosity("20W50 API SL/CF");
    	pojo1.setPacking("4L");
    	pojo1.setBoxContents("5X4L");
    	pojo1.setWholesalerPrice("945");
    	pojo1.setSrp("300/Liter");
    	
    	list.add(pojo1);
    	
    	   Gson gson = new Gson();
           
           // Convert ArrayList<PojoObject> to JSON string
           String json = gson.toJson(list);
            
        	return Response.ok(json)
        			.header("Access-Control-Allow-Origin", "*")
        			.header("Access-Control-Allow-Methods", "GET")
        			.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        			.build();
    }
    
      
}
