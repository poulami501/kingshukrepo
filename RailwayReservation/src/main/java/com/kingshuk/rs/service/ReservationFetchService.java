package com.kingshuk.rs.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kingshuk.rs.domain.Location;

@RestController
@RequestMapping(value="/fetch")
public class ReservationFetchService {
	
	@RequestMapping(value="/getLocationServiceByString/{key}")
	public Location getLocationServiceByString(@PathVariable("key")String keyWord){
		
		Location location=new Location(12,keyWord,keyWord,keyWord);
		return location;
		
	}
	
	public ArrayList<Train> searchTrain(String startPoint,String endPoint,Date journeyDate){
		
		Train train1=new Train(1213,"Coromondal Express",);
	}

}
