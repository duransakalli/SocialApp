package com.duran.social.location;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	public List<Location> getAllLocations(){
		List<Location> locations = new ArrayList<>();
		
		locationRepository.findAll().forEach(locations::add);
		
		return locations;
	}
	
	public Optional<Location> getLocation(String id){
		return locationRepository.findById(id);
	}
	
	public void addLocation(Location location) {
		locationRepository.save(location);
	}
	
	public void deleteLocation(String id) {
		locationRepository.deleteById(id);
	}
	
 	public void updateLocation(String id, Location location) {
 		locationRepository.save(location);
 	}
	
}
