package org.abhijeet.project.messenger.database;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abhijeet.project.messenger.model.Device;
import org.abhijeet.project.messenger.model.Message;
import org.abhijeet.project.messenger.model.Profile; 
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class DatabaseClass {
	private static Map <Long,Message> messages=new HashMap<>();
	private static Map<String ,Profile> profiles= new HashMap<>();
	private static Map<Long,Device>devices=new HashMap<>();
	
	public static MongoClient mongoClient = null;	 
	
	public static Map<Long, Message> getMessage () {
		return messages;
	}
	public static void setProfiles(Map<String, Profile> profiles) {
		DatabaseClass.profiles = profiles;
	}
	public static void setMessages(Map<Long, Message> messages) {
		DatabaseClass.messages = messages;
	}
//	public static void setProfiles(String string,Profile profile) {
//		
//		try {
//			  mongoClient = new MongoClient("localhost", 27017);
//			   
//			  MongoDatabase db = mongoClient.getDatabase("IOTmessenger");
//			   
//			  MongoCollection<Document> collection = db.getCollection("profiles");
//			
//			  final Map<String, Object> empMap1 = new HashMap<String, Object>();
//			  
//			  empMap1.put(string, profile);
//			  
//			  Document document=new Document(empMap1);
//			  
//			  System.out.println("Employee: 101" + empMap1);
//			  collection.insertOne( document);  
//			  showAllDocuments(collection);
//			  
//			} catch (Exception e) {
//			  e.printStackTrace();
//			} finally{
//			  mongoClient.close();
//			}
//		
//		DatabaseClass.profiles = profiles;
//	}
	public static void setDevices(Map<Long, Device> devices) {
		DatabaseClass.devices = devices;
	}
	public static Map<String, Profile> getProfiles() {
		
		
		return profiles;
	}
	public static Map<Long, Device> getDevice() {
		// TODO Auto-generated method stub
		return devices;
	}
	
	public static void Mongoinit(){
		    
		try {
		  mongoClient = new MongoClient("localhost", 27017);
		   
		  MongoDatabase db = mongoClient.getDatabase("IOTmessenger");
		   
		  MongoCollection<Document> collection = db.getCollection("profiles");
		
		  final Map<String,Object> empMap1 = new HashMap<String, Object>();
		  
		  empMap1.put("type", "map");
		  empMap1.put("first-name", "Stephen");
		  empMap1.put("last-name", "Murphy");
		   
		  System.out.println("Employee: 101" + empMap1);
		  collection.insertOne(new Document(empMap1));
		   
		  //---Insert using Map Employee #2---
		  final Map<String,Object> empMap2 = new HashMap<String, Object>();
		  empMap2.put("type", "map");
		  empMap2.put("first-name", "Harold");
		  empMap2.put("last-name", "Jansen");
		   
		  System.out.println("Employee: 102" + empMap2);
		  collection.insertOne(new Document(empMap2));
		  
		  
		  
		  showAllDocuments(collection);
		  
		} catch (Exception e) {
		  e.printStackTrace();
		} finally{
		  mongoClient.close();
		}	
		
		
	}
	
 public static void showAllDocuments( 
             final MongoCollection<Document> collection) {
                
System.out.println("----[Retrieve All Documents in Collection]----");

//List <Document>lprofiles=collection.find().into(new ArrayList<Document>());

for (Document doc: collection.find()) {
System.out.println(doc.toJson());
}
}

 
 public static List<Device> showdevices(){
	return null;
	 
 }
 
public static Device createdevice(Device device) {
	// TODO Auto-generated method stub
	return null;
}

public static Device createprofile(Profile profile) {
	// TODO Auto-generated method stub
	return null;
}

public static Device updatedevice(Device device) {
	// TODO Auto-generated method stub
	return null;
}

public static Device updateprofile(Profile profile) {
	// TODO Auto-generated method stub
	return null;
}
public static Device readdevice(String profile,Long id) {
	// TODO Auto-generated method stub
	return null;
}

public static Device readprofile(String profile) {
	// TODO Auto-generated method stub
	return null;
}

public static Device deletedevice(String profile,Long id) {
	// TODO Auto-generated method stub
	return null;
}

public static Device deleteprofile(String profilename) {
	// TODO Auto-generated method stub
	return null;
}




}
	
	


