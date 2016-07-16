package org.abhijeet.project.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.abhijeet.project.messenger.database.DatabaseClass;
import org.abhijeet.project.messenger.model.Profile;

public class ProfileService {
	
private Map <String , Profile> profiles = DatabaseClass.getProfiles();


public ProfileService(){
	profiles.put("abhijeet1403",new Profile(1L,"abhijeet1403","Abhijeet","chakraborty"));
	
}


public List<Profile> getAllProfile(){
	return new ArrayList<Profile>(profiles.values());
}

public Profile getProfile(String profileName){
	return profiles.get(profileName);
}
public Profile addProfile(Profile profile){
	profile.setId(profiles.size()+1);
	profiles.put(profile.getProfilename(),profile);
	DatabaseClass.setProfiles(profiles);
	return profile;
}

public Profile updateProfile(Profile profile){
	if(profile.getProfilename().isEmpty()){
		return null;
	}
	profiles.put(profile.getProfilename(), profile);
	return profile;
}

public Profile removeProfile(String profileName){
	return profiles.remove(profileName);
	
}


}
