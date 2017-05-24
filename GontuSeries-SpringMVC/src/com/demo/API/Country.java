package com.demo.API;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonIgnoreProperties({"Currency_Symbol"})

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name","Currency_Symbol","capital"})
public class Country {

	private String name;
	
	private String capital;
	
	@JsonProperty("Currency_Symbol")
	private String currency;

	public Country() {}
	
	public Country(String name, String capital) {
		super();
		this.name = name;
		this.capital = capital;
	}
	
	

	public Country(String name, String capital, String currency) {
		super();
		this.name = name;
		this.capital = capital;
		this.currency = currency;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + ", currency=" + currency + "]";
	}
	
	
}
