package com.example.practice.service;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.practice.dto.Day;

@Service
public class YearDetailsService {

	
	
	public List<String> getYearDetails(Integer year){
		
		 List<String> months = new ArrayList<>();
	        
	        for (Month month : Month.values()) {
	            months.add(month.name());
	        }

	        return months;
		
	}
	
	 public static Map<String, List<Day>> generateCompleteDaysDetailsAsObjects(int year) {
	     System.out.println("service call generateCompleteDaysDetailsAsObjects ");   
		 
		 Map<String, List<Day>> completeDaysDetails = new LinkedHashMap<>();

	        for (int month = 1; month <= 12; month++) {
	            YearMonth yearMonth = YearMonth.of(year, month);
	            List<Day> daysInMonth = new ArrayList<>();

	            for (int day = 1; day <= yearMonth.lengthOfMonth(); day++) {
	                LocalDate date = LocalDate.of(year, month, day);
	                daysInMonth.add(new Day(day, date.getDayOfWeek().name()));
	            }

	            completeDaysDetails.put(yearMonth.getMonth().name(), daysInMonth);
	        }

	        return completeDaysDetails;
	    }

	
	
}
