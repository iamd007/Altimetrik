package com.altimetrik.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.altimetrik.constants.Constant;
import com.altimetrik.dto.SearchDto;

@Service
public class SearchService {
	
	public List<SearchDto> getFlightsBy(String searchBy,String key)
	{
		List<SearchDto> flightList = Arrays.asList(Constant.ALL_FLIGHTS);
		List<SearchDto> filteredFlights = new ArrayList<SearchDto>();
		switch(searchBy.toLowerCase()) {
			case  "source" :
				flightList.forEach((value) -> {
					if(value.getSource().toLowerCase().equals(key.toLowerCase())) {
						filteredFlights.add(value);
					}
				});
				break;
			case  "destination" :
				flightList.forEach((value) -> {
					if(value.getDestination().toLowerCase().equals(key.toLowerCase())) {
						filteredFlights.add(value);
					} 
				});
				break;
			case  "date" :
				flightList.forEach((value) -> {
					if(value.getTravelDate().toString().equals(key.toLowerCase())) {
						filteredFlights.add(value);
					}
				});
				break;
		   default :
			System.out.println("No result found");		
			
		}
		
		return filteredFlights;
	}

}
