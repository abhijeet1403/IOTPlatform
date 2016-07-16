package org.abhijeet.project.messenger.resources;

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

import org.abhijeet.project.messenger.model.Profile;
import org.abhijeet.project.messenger.service.ProfileService;
	
@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResources {
	private ProfileService profileservice=new ProfileService();
	
	@GET
	public List<Profile> getProfile(){
	
	return	profileservice.getAllProfile();
		
	}
	
	
	@POST
		public Profile addProfile(Profile profile){
		return profileservice.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileName}")
	public Profile updatemessage(@PathParam ("profileName") String profileName,Profile profile){
		profile.setProfilename(profileName);
		return profileservice.updateProfile(profile);
	}
	
	
	@DELETE
	@Path("/{profileName}")
	public void deletemessage(@PathParam ("profileName") String profileName){
		profileservice.removeProfile(profileName);
	}
	
	@Path("/{profileName}/devices")
	public DeviceResource	getDeviceResource() {
		return new DeviceResource();
	}
	
	@GET
	@Path("/{profileName}")
	public Profile getProfile (@PathParam ("profileName") String profileName){
			return  profileservice.getProfile(profileName);
	}
	
	
	
	
}
