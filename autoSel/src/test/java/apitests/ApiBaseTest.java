package apitests;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.BeforeClass;

import com.jayway.jsonpath.JsonPath;

import api.constants.FileConstants;
import api.utils.CommonUtilities;
import apireusableutils.RestUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiBaseTest {
	
	public static String token;
	
	public static void setToken() throws IOException {
		
		String uri=CommonUtilities.readFileAndReturnString(FileConstants.URI_FILE_PATH);
		RestAssured.baseURI=JsonPath.read(uri,"$.login.prod");
		//RestAssured.baseURI=JsonPath.read(FileConstants.URI_FILE_PATH, "$.login.prod");
		
		//String uri=CommonUtilities.readFileAndReturnString(FileConstants.USER_CONFIG_FILE_PATH);
		String un=JsonPath.read(uri,"$.prod.username");
		String pw=JsonPath.read(uri,"$.prod.password");
	
	

	HashMap<String, String> payload = new HashMap<>();
	payload.put("username", un);
	payload.put("password",pw);
	
	

	HashMap<String, String> headers = new HashMap<>();
	headers.put("Content-Type", "appplicaton/json");
	
	Response res=RestUtils.postReq(payload, headers, "/login");
	
	//token=res.jsonPath().getString("token").replace("[","").replace("]", "");
	
	token=JsonPath.read(res.asString(),"$.[0].token");

}
	@BeforeClass
	public void setUp() throws IOException {
		ApiBaseTest.setToken();
		
		
	}
}