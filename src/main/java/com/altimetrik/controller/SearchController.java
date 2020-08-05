package com.altimetrik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.altimetrik.dto.SearchDto;
import com.altimetrik.service.SearchService;

@RestController
public class SearchController {
	
	@Autowired
	SearchService service;

	@GetMapping("/source/{key}")
	public ResponseEntity<List<SearchDto>> searchBySource(@PathVariable String key) {
		List<SearchDto> result = service.getFlightsBy("source", key);
		return new ResponseEntity<List<SearchDto>>(result, HttpStatus.OK);
	}
	
	@GetMapping("/destination/{key}")
	public ResponseEntity<List<SearchDto>> searchByDestination(@PathVariable String key) {
		List<SearchDto> result = service.getFlightsBy("destination", key);
		return new ResponseEntity<List<SearchDto>>(result, HttpStatus.OK);
	}
	
	@GetMapping("/date/{key}")
	public ResponseEntity<List<SearchDto>> searchByDate(@PathVariable String key) {
		List<SearchDto> result = service.getFlightsBy("date", key);
		return new ResponseEntity<List<SearchDto>>(result, HttpStatus.OK);
	}
}
