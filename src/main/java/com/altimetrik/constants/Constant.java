package com.altimetrik.constants;

import java.time.LocalDate;

import com.altimetrik.dto.SearchDto;

public class Constant {

	
	
	public static final SearchDto ALL_FLIGHTS [] ={
			                                        new SearchDto("Mumbai","Delhi", LocalDate.now()),
			                                        new SearchDto("Mumbai","Varanasi",LocalDate.now()),
			                                        new SearchDto("Mumbai","Jaipur",LocalDate.now()),
			                                        new SearchDto("Mumbai","Kolkata",LocalDate.now()),
			                                        new SearchDto("Delhi","Mumbai",LocalDate.now()),
			                                        new SearchDto("Delhi","Kolkata",LocalDate.now()),
			                                        new SearchDto("Delhi","Pune",LocalDate.now()),
			                                        new SearchDto("Delhi","Jaipur",LocalDate.now()),
			                                        new SearchDto("Jaipur","Pune",LocalDate.now()),
			                                        new SearchDto("Jaipur","Delhi",LocalDate.now()),
			                                        new SearchDto("Jaipur","Kolkata",LocalDate.now()),
			                                        new SearchDto("Kolkata","Delhi",LocalDate.now()),
			                                        new SearchDto("Kolkata","Pune",LocalDate.now()),
			                                        new SearchDto("Kolkata","Mumbai",LocalDate.now()),
			                                        new SearchDto("Pune","Mumbai",LocalDate.now()),
			                                        new SearchDto("Pune","Delhi",LocalDate.now()),
			                                        new SearchDto("Pune","Kolkata",LocalDate.now()),
			                                        new SearchDto("Pune","Jaipur",LocalDate.now())
			                                        
			                                        	                                        
			                                     };
	
	
}
