package com.cp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherReportApplication.class, args);
		 String apiKey = "5ef1cc56c60718cf9aa33ba12d243509";
	        String city = "gaya";
	        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;
	        
	        try {
	            URL obj = new URL(url);
	            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	            con.setRequestMethod("GET");
	            
	            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	            String inputLine;
	            StringBuffer response = new StringBuffer();
	            
	            while ((inputLine = in.readLine()) != null) {
	                response.append(inputLine);
	            }
	            in.close();
	            
	            JSONObject jsonObject = new JSONObject(response.toString());
	            JSONObject main = jsonObject.getJSONObject("main");
	            double temp = main.getDouble("temp");
	              final DecimalFormat decfor = new DecimalFormat("0.00"); 
	            System.out.println("Temperature in  " + city + " is "+ temp + " kelvin \n");
	          
	            System.out.printf("Temperature in  " + city + " is "+ decfor.format(temp-273.15) + "celsius");
	            
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }}

}
