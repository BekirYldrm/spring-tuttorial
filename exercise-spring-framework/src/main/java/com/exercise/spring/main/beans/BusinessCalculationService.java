package com.exercise.spring.main.beans;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class BusinessCalculationService {

	private DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		this.dataService = dataService;
	}

	public int findMax() {

		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}