package org.abhijeet.project.messenger.service;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Map;

import org.abhijeet.project.messenger.database.DatabaseClass;
import org.abhijeet.project.messenger.model.Message;

public class MessageService {

	private Map <Long,Message> messages=DatabaseClass.getMessage();
	
	
	public MessageService() {	
		messages.put(1L, new Message(1,"Hello World","Ac"));
		messages.put(2L, new Message(2,"Hello Java","Ac"));
	}
	
	
	public List<Message> getAllMessagesByYear(int year){
		List <Message> messageForYear=new ArrayList<>();
		Calendar calendar=Calendar.getInstance();
		for(Message message : messages.values()){
			calendar.setTime(message.getCreated());
			if(calendar.get(Calendar.YEAR)==year){
				messageForYear.add(message);
			}
		}
		return messageForYear;
		
	}
	
	
	public List<Message> getAllMessagespaginated(int start,int size){
		ArrayList<Message> list=new ArrayList<Message>(messages.values());
		if(start + size >list.size()){
			return new ArrayList<Message>();
		}
		return list.subList(start, start+size);
		
	}
	
	
	
	
	
	public List<Message> getallMessage(){
		return new ArrayList<Message>(messages.values());

}
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
		
	}
	
	public Message updateMessage(Message message){
		if(message.getId()<=0)
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	
	
	
}
