package com.kingshuk.rs.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kingshuk.rs.domain.Location;
import com.kingshuk.rs.domain.Train;
import com.kingshuk.rs.utility.GlobalConstants;

@RestController
@RequestMapping(value="/fetch")
public class ReservationFetchService {
	
	@RequestMapping(value="/getLocationServiceByString/{key}")
	public Location getLocationServiceByString(@PathVariable("key")String keyWord){
		
		Location location=new Location(12,keyWord,keyWord,keyWord);
		return location;
		
	}
	@RequestMapping(value="/searchTrain/{startPoint}/{endPoint}/{date}")
	public ArrayList<Train> searchTrain(@PathVariable("startPoint")String startPoint,@PathVariable String endPoint,@PathVariable("date")Date journeyDate){
		GlobalConstants.Classes[] classes={GlobalConstants.Classes.AC1,GlobalConstants.Classes.AC2};
		GlobalConstants.Days[] days={GlobalConstants.Days.DAILY};
		Train train1=new Train("1213","Coromondal Express",days,"17:30","21:00","Howrah","Chennai",classes);
		Train train2=new Train("1101","Purba",days,"17:30","21:00","Howrah","Chennai",classes);
		ArrayList<Train> trainList=new ArrayList<Train>();
		trainList.add(train1);
		trainList.add(train2);
		return trainList;
	}

}
