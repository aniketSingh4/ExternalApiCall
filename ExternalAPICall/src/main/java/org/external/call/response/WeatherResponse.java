package org.external.call.response;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse
{
    private Request request;
    private Location location;
    private Current current;
    
    //getter and setter of current
    
    
    @Getter
    @Setter
    public class Request
    {
    	private String type;
    	private String query;
    	private String language;
    	private String unit;
    }
    
    @Getter
    @Setter
    public class Location
    {
    	private String name;
    	private String country;
    	private String region;
    	private String lat;
    	private String lon;
    	private String timezone_id;
    	private String localtime;
    	private int localtime_epoch;
    	private String utc_offset;
    }
    
    @Getter
    @Setter
    public class Current
    {
    	private String observation_time;
    	private int temperature;
    	private int weather_code;
    	private ArrayList<String> weather_icons;
    	private ArrayList<String> weather_descriptions;
    	private Astro astro;
    	private AirQuality air_quality;
    	private int wind_speed;
    	private int wind_degree;
    	private String wind_dir;
    	private int pressure;
    	private int precip;
    	private int humidity;
    	private int cloudcover;
    	private int feelslike;
    	private int uv_index;
    	private int visibility;
    	private String is_day;
    	
		public int getFeelslike() {
			return feelslike;
		}
		public void setFeelslike(int feelslike) {
			this.feelslike = feelslike;
		}
    	
    	
    }

    @Getter
    @Setter
    public class Astro
    {
    	private String sunrise;
    	private String sunset;
    	private String moonrise;
    	private String moonset;
    	private String moon_phase;
    	private int moon_illumination;
    }
    
    @Getter
    @Setter
    public class AirQuality
    {
    	private String co;
    	private String no2;
    	private String o3;
    	private String so2;
    	private String pm2_5;
    	private String pm10;
    }

	public Current getCurrent() {
		return current;
	}

	public void setCurrent(Current current) {
		this.current = current;
	}
    
    

    
}

