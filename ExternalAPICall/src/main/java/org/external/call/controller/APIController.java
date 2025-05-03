package org.external.call.controller;

import org.external.call.response.WeatherResponse;
import org.external.call.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController 
{
	@Autowired
	private WeatherService weatherService;
	
	
	@GetMapping("/weather")
	public ResponseEntity<?> greeting()
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		WeatherResponse weatherResponse = weatherService.getWeather("Mumbai");
		
		String greeting = "";
		if(weatherResponse != null)
		{
			greeting = ", Weather feels like " + weatherResponse.getCurrent().getFeelslike();
		}
		return new ResponseEntity<>("Hi " + auth.getName() + greeting, HttpStatus.OK);
	}

}
