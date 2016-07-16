package org.abhijeet.project.messenger.model;
import java.util.Date;

public class Comment {
	

	private long id;
    private String profileName;
    private Date created;
    private String author;
    
    public Comment() {
    	
    }
    
    public Comment(long id, String profileName, String author) {
    	this.id = id;
    	this.profileName = profileName;
    	this.author = author;
    	this.created = new Date();
    }
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getprofileName() {
		return profileName;
	}
	public void setprofileName(String profileName) {
		this.profileName = profileName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
    
    

}

