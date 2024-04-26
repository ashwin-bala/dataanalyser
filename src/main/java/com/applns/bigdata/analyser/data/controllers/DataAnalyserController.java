package com.applns.bigdata.analyser.data.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applns.bigdata.analyser.data.service.DataAnalyserService;

@RestController
public class DataAnalyserController {
	
	@Autowired
	private DataAnalyserService analyserService;

	@GetMapping("/earliestArtDatesByPlaceOfOrigin")
	public  Map<String, List<Map<String, String>>> getEarliestArtDatesByPlaceOfOrigin() {
		Map<String,List<Map<String, String>>> response = new HashMap<String, List<Map<String,String>>>();
		response.put("response", analyserService.getEarliestArtDatesByPlaceOfOrigin());
		return response;
	}

	@GetMapping("/mostPopularStyleTitles")
	public  Map<String, List<Map<String, String>>> getMostPopularStyleTitles() {
		Map<String,List<Map<String, String>>> response = new HashMap<String, List<Map<String,String>>>();
		response.put("response", analyserService.getMostPopularStyleTitles());
		return response;
	}

	@GetMapping("/getAllArtWorkTypeTitles")
	public  Map<String, List<Map<String, String>>> getAllArtWorkTypeTitles() {
		Map<String,List<Map<String, String>>> response = new HashMap<String, List<Map<String,String>>>();
		response.put("response", analyserService.getAllArtWorkTypeTitles());
		return response;
	}

}
