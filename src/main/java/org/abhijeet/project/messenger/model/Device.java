package org.abhijeet.project.messenger.model;
import java.util.Date;




public class Device {
	private long id;
	private String Device;
	private Date created;
	private String author;
	private String devicedata;
	
	
	public Device(){
		
	}
	
	public Device (long id,String Device,String author, String devicedata){
		this.id=id;
		this.Device=Device;
		this.author=author;
		this.devicedata=devicedata;
		this.created=new Date();
		
	} 
	
	
	public String getDevicedata() {
		return devicedata;
	}

	public void setDevicedata(String devicedata) {
		this.devicedata = devicedata;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDevice() {
		return Device;
	}
	public void setDevice(String Device) {
		this.Device = Device;
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
