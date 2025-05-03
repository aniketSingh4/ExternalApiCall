package org.external.call.service;

import org.external.call.response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService 
{
	private static final String apiKey  = "99d4d25b62a0c55d579bf9619f3146be";
	
	private static final String api = "https://api.weatherstack.com/current?access_key=99d4d25b62a0c55d579bf9619f3146be&query=BENGALURU";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public WeatherResponse getWeather(String city)
	{
		String finalApi = api.replace("CITY",city).replace("API_KEY", apiKey);
		ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalApi,HttpMethod.GET,null, WeatherResponse.class);
		
		WeatherResponse body = response.getBody();
		return body;
		
	}

}
