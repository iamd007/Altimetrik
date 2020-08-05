package com.altimetrik.dto;

import java.sql.Date;
import java.time.LocalDate;

public class SearchDto {

	private String source;
	private String destination;
	private LocalDate travelDate;
	public SearchDto() {
		super();
		this.source = "";
		this.destination = "";
		this.travelDate = LocalDate.now();
	}
	
	
	public SearchDto(String source, String destination, LocalDate travelDate) {
		super();
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
	}
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	
	
}
