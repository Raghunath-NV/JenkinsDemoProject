package com.demo.API;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
//@Controller
public class CountryRESTAPI {

	//@ResponseBody   //no need when we use @RestController
	@RequestMapping(value = "/countryList", method = RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public ArrayList<Country> CountryList()
	{
	Country c1 = new Country("India","Delhi","INR");    
	Country c2 = new Country("Australia","Canberra");
	Country c3 = new Country("China","Beijing");
	Country c4 = new Country("Srilanka","Colombo","LKR");
	
	ArrayList<Country> Clist = new ArrayList<Country> ();
	Clist.add(c1);
	Clist.add(c2);
	Clist.add(c3);
	Clist.add(c4);			//Instead of all these we should write a db query which fetches from DB
	
	return Clist;
	}
	
//	@ResponseBody
	@RequestMapping(value ="/country/{name}" , method = RequestMethod.GET)
	public Country getCountry(@PathVariable ("name") String countryName)
	{
		//Actually we need to fetch the details from DB for the countryName. SInce we dont have DB lets cretae dummy obj
		
		Country c = new Country();
		c.setName(countryName);
		return c;
	}
	
	
	@RequestMapping(value ="/countryUpdate/{name}" , method = RequestMethod.PUT , consumes = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Boolean> updateCountry(@PathVariable ("name") String countryName, @RequestBody Country country)
	{
		//Actually we need to write a sql query which updates this data in the db
		System.out.println("Country name received from the URL is "+countryName);
		System.out.println("Country details received from the body is "+country);
		
		HttpHeaders hd = new HttpHeaders();
		hd.add("name", "raghunath");
		hd.add("school", "UNCC");
		
		return new ResponseEntity<Boolean>(true,hd,HttpStatus.ACCEPTED);
	}
	
	
	@RequestMapping(value ="/countryPost" , method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> postCountry(@RequestBody Country country)
	{
		//Actually we need to write a sql query which updates this data in the db
		System.out.println("Country details received from the body is "+country);
		
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value ="/countryDelete/{name}" , method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteCountry(@PathVariable("name") String countryName)
	{
		//Actually we need to write a sql query which updates this data in the db
		System.out.println("Country to be deleted is "+countryName);
		
		return new ResponseEntity<Boolean>(true,HttpStatus.ACCEPTED);
	}
	
	
	
	
	
	
}
