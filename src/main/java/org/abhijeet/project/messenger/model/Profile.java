package org.abhijeet.project.messenger.model;

import java.util.Date;



public class Profile {
	

	private long id;
	private String Profilename;
	private String Firstname;
	private String LastName;
	private Date created;
	
	public Profile(){
		
	}
	public Profile(long id,String Profilename,String Firstname,String Lastname){
		this.id=id;
		this.Profilename=Profilename;
		this.Firstname=Firstname;
		this.LastName=Lastname;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfilename() {
		return Profilename;
	}
	public void setProfilename(String profilename) {
		Profilename = profilename;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	

}
