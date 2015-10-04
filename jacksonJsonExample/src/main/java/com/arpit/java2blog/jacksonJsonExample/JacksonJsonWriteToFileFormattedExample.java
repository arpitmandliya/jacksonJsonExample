package com.arpit.java2blog.jacksonJsonExample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * 
 * @author Arpit Mandliya
 *
 */
public class JacksonJsonWriteToFileFormattedExample 
{
    public static void main( String[] args )
    {
    	 Country countryObj=new Country();
    	  countryObj.setName("India");
    	  countryObj.setPopulation(1000000);
    	  List<String> listOfStates=new ArrayList<String>();
    	  listOfStates.add("Madhya Pradesh");
    	  listOfStates.add("Maharastra");
    	  listOfStates.add("Rajasthan");
    	  
    	  countryObj.setListOfStates(listOfStates);
    	  ObjectMapper mapper=new ObjectMapper();
    	  try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("//Users//Arpit//country.json"), countryObj);
			System.out.println("Json written to the file");
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
