package com.luv2code.springdemo.rest;

import java.io.File;  
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.Response;  
import javax.ws.rs.core.Response.ResponseBuilder;

import org.springframework.web.bind.annotation.RestController;  

@RestController
@Path("/files")  
public class FileDownloadService {
	
	 private static final String FILE_PATH = "/root/Downloads/chau.png";  
	    @GET  
	    @Path("/image")  
	    @Produces("image/png")
	    public Response getFile() {  
	        File file = new File(FILE_PATH);  
	        ResponseBuilder response = Response.ok((Object) file);  
	        response.header("Content-Disposition","attachment; filename=\"javatpoint_image.png\"");  
	        return response.build();  
	    }  
}
