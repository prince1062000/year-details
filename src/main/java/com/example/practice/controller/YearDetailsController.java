package com.example.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.service.YearDetailsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/year")
public class YearDetailsController {

	
	@Autowired
	private YearDetailsService yearDetailsService;
	
	
	
	@GetMapping("/getdata")
	public String getData() {
		return "this is get data";
	}
	
	
	
	@GetMapping("/months")
	public ResponseEntity<?> getYearDetails(@RequestParam("year") Integer year){
		System.out.println("controller call");
		return new ResponseEntity<>(yearDetailsService.generateCompleteDaysDetailsAsObjects(year),new HttpHeaders(),HttpStatus.OK);
		
	}
	
}
