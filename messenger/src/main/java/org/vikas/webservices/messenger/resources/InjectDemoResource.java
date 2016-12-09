package org.vikas.webservices.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.vikas.webservices.messenger.model.Message;
import org.vikas.webservices.messenger.service.MessageService;

@Path("/injectdemo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InjectDemoResource {
	
	@GET
	@Path("annotations")
	public String getParamAnnotation(@MatrixParam("param") String matrixParam, 
									 @HeaderParam("customHeader") int value,
									 @CookieParam("name") String cookieParam){
		return "Matrix param: "+matrixParam+ " Header param: "+value+" Cookie Param: "+cookieParam;
	}
	
	@GET
	@Path("context")
	public String getParamContext(@Context UriInfo uriInfo, @Context HttpHeaders headers){
		String path = uriInfo.getAbsolutePath().toString();
		String cookie = headers.getCookies().toString();
		return "path: "+path+" Headers: "+cookie; 
		
	}

}
