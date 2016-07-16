package org.abhijeet.project.messenger.service;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Map;

import org.abhijeet.project.messenger.database.DatabaseClass;
import org.abhijeet.project.messenger.model.Device;

public class DeviceService {

	private Map <Long,Device> Devices=DatabaseClass.getDevice();
	
	
	public DeviceService() {	
		
		
		Devices.put(1L, new Device(1,"Proximity Sensor","abhijeet1403","938461834601g130847130847134v1304813041v34"));
		Devices.put(2L, new Device(2,"Image Sensor","abhijeet1403","001386081368153hf0138741837hf1347-1937hd13-94"));
		
	}
		
	public List<Device> getallDevice(){
		return new ArrayList<Device>(Devices.values());

}
	public Device getDevice(long id){
		return Devices.get(id);
	}
	
	public Device addDevice(String profileName,Device Device){
		Device.setAuthor(profileName);
		Device.setCreated(new Date());
		Device.setId(Devices.size()+1);
		Devices.put(Device.getId(), Device);
		return Device;
		
	}
	
	public Device updateDevice(Device Device){
		if(Device.getId()<=0)
		{
			return null;
		}
		Devices.put(Device.getId(), Device);
		return Device;
	}
	
	public Device removeDevice(long id){
		return Devices.remove(id);
	}
	
	
	
}
