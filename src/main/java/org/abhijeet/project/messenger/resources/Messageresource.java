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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.abhijeet.project.messenger.model.Message;
import org.abhijeet.project.messenger.service.MessageService;


@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class Messageresource {

	MessageService messageservice=new MessageService();
	
	@GET
	public List<Message> getMessage(@QueryParam("year") int year,
									@QueryParam ("start") int start,
									@QueryParam ("size") int size){
		
		
		if (year >0){
			return messageservice.getAllMessagesByYear(year);
		}
		
		if (start>=0 && size>0 ){
			return messageservice.getAllMessagespaginated(start, size);
		}
	return	messageservice.getallMessage();
		
	}
	
	
	@POST
		public Message addMessage(Message message){
		return messageservice.addMessage(message);
	}
	
	@PUT
	@Path("/{messageID}")
	public Message updatemessage(@PathParam ("messageID") long id,Message message){
		message.setId(id);
		return messageservice.updateMessage(message);
	}
	
	
	@DELETE
	@Path("/{messageID}")
	public void deletemessage(@PathParam ("messageID") long id){
		messageservice.removeMessage(id);
	}
	
	
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource() {
		return new CommentResource();
	}
	
	@GET
	@Path("/{messageID}")
	public Message getMessage (@PathParam ("messageID") long id){
			return  messageservice.getMessage(id);
	}
	
	
}
