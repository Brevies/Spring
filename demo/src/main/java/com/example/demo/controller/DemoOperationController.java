package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Details;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;



@RequestMapping("/operation")
@RestController
public class DemoOperationController {

	@Autowired
	ObjectMapper obj;
	
	@Value("${com.details}")
	String details;
	@GetMapping("/details")
	public ResponseEntity<Details> getAllDetails() throws JsonMappingException, JsonProcessingException{
		Details d= obj.readValue(details, Details.class);
		ObjectWriter writer=new ObjectMapper().writer().withDefaultPrettyPrinter();
		String s1=writer.writeValueAsString(d);
		System.out.println(s1);
	  return new ResponseEntity<>(d,HttpStatus.ACCEPTED);	
	}
	
	@Value("${com.details}")
	String saveDetails;
	@PostMapping("/details")
	public ResponseEntity<String> saveDetails() throws JsonMappingException, JsonProcessingException{
		Details d= obj.readValue(saveDetails, Details.class);
		ObjectWriter writer= new ObjectMapper().writer().withDefaultPrettyPrinter();
		String s1=writer.writeValueAsString(d);
		System.out.println(s1);
	  return new ResponseEntity<>("Successfull",HttpStatus.ACCEPTED);	
	}
	
	@Value("${com.details}")
	String updateDetails;
	@PutMapping("/details")
	public ResponseEntity<Details> updateDatails() throws JsonProcessingException{
		Details d =obj.readValue(updateDetails, Details.class);
		d.setName("Sumit");
		d.setBalance(d.getBalance()+1000);
		//d.setName(d.getName()+"Brevies");
		d.setNum(d.getNum()+799240899);
		ObjectWriter writer=new ObjectMapper().writer().withDefaultPrettyPrinter();
		String s1=writer.writeValueAsString(d);
		System.out.println(s1);
		return new ResponseEntity<>(d,HttpStatus.OK);
	}
	
	@Value("${com.details}")
	String deleteDetails;
	@DeleteMapping("/details")
	public ResponseEntity<String> deleteDetails(Details details) throws JsonProcessingException{
		String responseMessage = "Product " + details + " Succesfully Deleted";
		ObjectWriter writer= new ObjectMapper().writer().withDefaultPrettyPrinter();
		String s1= writer.writeValueAsString(responseMessage);
		System.out.println(s1);
		return new ResponseEntity<>(responseMessage, HttpStatus.OK);
	}
}
