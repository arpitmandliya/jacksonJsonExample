package com.arpit.java2blog.jacksonJsonExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class JacksonJsonReadFromFileExample {

	public static void main(String[] args)
	{
		ObjectMapper mapper =new ObjectMapper();
		try{
			System.out.println("Reading JSON from a file");
			System.out.println("----------------------------");

			BufferedReader br = new BufferedReader(
					new FileReader("//Users//Arpit//country.json"));

			//convert the json string back to object
			Country countryObj = mapper.readValue(br, Country.class);

			System.out.println("Name Of Country: "+countryObj.getName());


			System.out.println("Population: "+countryObj.getPopulation());

			System.out.println("States are :");

			List<String> listOfStates = countryObj.getListOfStates();
			for (int i = 0; i < listOfStates.size(); i++) {
				System.out.println(listOfStates.get(i));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}



	}
}
