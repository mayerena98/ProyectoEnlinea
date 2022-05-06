package com.example.demo;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController 
public class PokebolasController {
	
	private final RestTemplate restTemplate;
	private final String SitioWeb = "https://pokeapi.co/api/v2/pokemon/";
	
	@Autowired
	public PokebolasController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	
	@GetMapping("/Pokemon/{pokemon}")
public ResponseEntity<String> pokemon(@PathVariable String pokemon){
		HttpEntity<String> entity = getStringHttpEntity();
		RestTemplate template = new RestTemplate();
		return template.exchange(SitioWeb + pokemon, HttpMethod.GET, entity, String.class);
		
	}
	
	@GetMapping("/Pokemon/abilities/{pokemon}")
	public ResponseEntity<String> Abilities(@PathVariable String pokemon){
		HttpEntity<String> entity = getStringHttpEntity();
		ResponseEntity<String> response;
		String jsonResponse = "";
		try {
			RestTemplate template = new RestTemplate();
			jsonResponse = template.exchange(SitioWeb + pokemon, HttpMethod.GET, entity, String.class).getBody();
			JSONObject json = new JSONObject(jsonResponse);
			jsonResponse = json.optString("abilities");
			response = new ResponseEntity<>(jsonResponse,HttpStatus.OK);
		}catch (Exception err) {
			response = new ResponseEntity<>(jsonResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@GetMapping("/Pokemon/base-experience/{pokemon}")
	public ResponseEntity<String> experience(@PathVariable String pokemon){
		HttpEntity<String> entity = getStringHttpEntity();
		ResponseEntity<String> response;
		String jsonResponse = "";
		try {
			RestTemplate template = new RestTemplate();
			jsonResponse = template.exchange(SitioWeb + pokemon, HttpMethod.GET, entity, String.class).getBody();
			JSONObject json = new JSONObject(jsonResponse);
			jsonResponse = json.optString("base_experience");
			response = new ResponseEntity<>(jsonResponse,HttpStatus.OK);
		}catch (Exception err) {
			response = new ResponseEntity<>(jsonResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@GetMapping("/Pokemon/held-items/{pokemon}")
	public ResponseEntity<String> helditems(@PathVariable String pokemon){
		HttpEntity<String> entity = getStringHttpEntity();
		ResponseEntity<String> response;
		String jsonResponse = "";
		try {
			RestTemplate template = new RestTemplate();
			jsonResponse = template.exchange(SitioWeb + pokemon, HttpMethod.GET, entity, String.class).getBody();
			JSONObject json = new JSONObject(jsonResponse);
			jsonResponse = json.optString("held_items");
			response = new ResponseEntity<>(jsonResponse,HttpStatus.OK);
		}catch (Exception err) {
			response = new ResponseEntity<>(jsonResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@GetMapping("/Pokemon/id/{pokemon}")
	public ResponseEntity<String> id(@PathVariable String pokemon){
		HttpEntity<String> entity = getStringHttpEntity();
		ResponseEntity<String> response;
		String jsonResponse = "";
		try {
			RestTemplate template = new RestTemplate();
			jsonResponse = template.exchange(SitioWeb + pokemon, HttpMethod.GET, entity, String.class).getBody();
			JSONObject json = new JSONObject(jsonResponse);
			jsonResponse = json.optString("id");
			response = new ResponseEntity<>(jsonResponse,HttpStatus.OK);
		}catch (Exception err) {
			response = new ResponseEntity<>(jsonResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@GetMapping("/Pokemon/name/{pokemon}")
	public ResponseEntity<String> name(@PathVariable String pokemon){
		HttpEntity<String> entity = getStringHttpEntity();
		ResponseEntity<String> response;
		String jsonResponse = "";
		try {
			RestTemplate template = new RestTemplate();
			jsonResponse = template.exchange(SitioWeb + pokemon, HttpMethod.GET, entity, String.class).getBody();
			JSONObject json = new JSONObject(jsonResponse);
			jsonResponse = json.optString("name");
			response = new ResponseEntity<>(jsonResponse,HttpStatus.OK);
		}catch (Exception err) {
			response = new ResponseEntity<>(jsonResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@GetMapping("/Pokemon/location-area-encounters/{pokemon}")
	public ResponseEntity<String> encounters(@PathVariable String pokemon){
		HttpEntity<String> entity = getStringHttpEntity();
		ResponseEntity<String> response;
		String jsonResponse = "";
		try {
			RestTemplate template = new RestTemplate();
			jsonResponse = template.exchange(SitioWeb + pokemon, HttpMethod.GET, entity, String.class).getBody();
			JSONObject json = new JSONObject(jsonResponse);
			jsonResponse = json.optString("location_area_encounters");
			response = new ResponseEntity<>(jsonResponse,HttpStatus.OK);
		}catch (Exception err) {
			response = new ResponseEntity<>(jsonResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}



	private HttpEntity<String> getStringHttpEntity() {
		// TODO Auto-generated method stub
		return null;
	}

}
