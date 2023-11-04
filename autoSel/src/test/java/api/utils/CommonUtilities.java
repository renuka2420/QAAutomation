package api.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

import api.testdata.AddUser;



public class CommonUtilities {
	
	
	public static String readFileAndReturnString(String filepath) throws IOException {
		
		byte[] fileContents=Files.readAllBytes(Paths.get(filepath));
		return new String(fileContents, StandardCharsets.UTF_8);
	}
	
	//to convert object to string
	public static String SerializeObject(Object user)   {
		
		ObjectMapper om=new ObjectMapper();
		om.setPropertyNamingStrategy(PropertyNamingStrategies.LOWER_CASE);
		String JsonPayload =om.writeValueAsString(user);
		System.out.println(JsonPayload);
		return JsonPayload;	
		
	}
	
	public static Object deSerializeJSON(String sJson) {
		ObjectMapper om=new ObjectMapper();
		AddUser au=om.readValue(sJson,AddUser.class);
		
		return au;
		
	}

}
