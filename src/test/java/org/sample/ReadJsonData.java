package org.sample;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonData {
	
	public static void main(String[] args) throws IOException, ParseException
	{
		FileReader f = new FileReader("C:\\Users\\MADHAN\\eclipse-workspace\\ReadXMLData\\src\\test\\resources\\JSON\\config.json");
		
		JSONParser p = new JSONParser();
		
		Object object = p.parse(f);
		
		JSONObject j = (JSONObject)object;
		
		System.out.println(j.get("browser"));
		System.out.println(j.get("os"));
		System.out.println(j.get("Project"));
			
	}

}
