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

import org.abhijeet.project.messenger.model.Device;
import org.abhijeet.project.messenger.service.DeviceService;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class DeviceResource {

	DeviceService deviceservice=new DeviceService();
	
	@GET
	public List<Device> getDevice(){
		
	return	deviceservice.getallDevice();
		
	}
	
	
	@POST
		public Device addDevice(@PathParam ("profileName") String Author,Device Device){
		return deviceservice.addDevice(Author,Device);
	}
	
	@PUT
	@Path("/{DeviceID}")
	public Device updateDevice(@PathParam ("DeviceID") long id,Device Device){
		Device.setId(id);
		return deviceservice.updateDevice(Device);
	}
	
	
	@DELETE
	@Path("/{DeviceID}")
	public void deleteDevice(@PathParam ("DeviceID") long id){
		deviceservice.removeDevice(id);
	}
	
	
	@Path("/{DeviceId}/comments")
	public CommentResource getCommentResource() {
		return new CommentResource();
	}
	
	@GET
	@Path("/{DeviceID}")
	public Device getDevice (@PathParam ("DeviceID") long id,@PathParam ("profileName") String Author){
			return  deviceservice.getDevice(id);
	}
	
}
