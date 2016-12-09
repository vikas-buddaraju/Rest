package org.vikas.webservices.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vikas.webservices.messenger.database.DatabaseClass;
import org.vikas.webservices.messenger.model.Profile;

public class ProfileSrvice {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileSrvice(){
		profiles.put("Vikas", new Profile(1L, "Vikas", "Vikas", "Buddaraju"));
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String ProfileName){
		return profiles.get(ProfileName);
		
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getProfileName().isEmpty()){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String ProfileName){
		return profiles.remove(ProfileName);
	}
}

