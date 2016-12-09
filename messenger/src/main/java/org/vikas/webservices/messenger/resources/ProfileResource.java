package org.vikas.webservices.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vikas.webservices.messenger.model.Profile;
import org.vikas.webservices.messenger.service.ProfileSrvice;


@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	
	  ProfileSrvice ps = new ProfileSrvice();
	  
	  
	  @GET
	  public List<Profile> getProfiles(){
		 return ps.getAllProfiles();
		  
	  }
	  
	  @POST
	  public Profile addProfiel(Profile profile){
			return ps.addProfile(profile);
		}
	  
	  @GET
	  @Path("/{profileName}")
	  public Profile getProfile(@PathParam("profileName") String ProfileName){
			return ps.getProfile(ProfileName);
		}
	  
	  @PUT
	  @Path("/{profileName}")
	  public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile){
			profile.setProfileName(profileName);
			return ps.updateProfile(profile);
		}
	  
	  @DELETE
	  @Path("/{profileName}")
	  public Profile deleteMessage(@PathParam("profileName") String profileName){
			return ps.removeProfile(profileName);
		}

}
