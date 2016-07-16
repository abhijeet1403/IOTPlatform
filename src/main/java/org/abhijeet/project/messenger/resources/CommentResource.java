package org.abhijeet.project.messenger.resources;


import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)

public class CommentResource {

	
	@GET
	public String getComment(@PathParam ("profileName") String pathparam ) {
		return "Comment space for"+pathparam;
	}

	
}

