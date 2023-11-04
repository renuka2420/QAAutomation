package apitests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
//import org.apache.commons.collections4.map.HashedMap;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import api.constants.FileConstants;
import api.testdata.AddUser;
import api.utils.CommonUtilities;
import apireusableutils.RestUtils;
import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.MatcherAssert.*;

public class LoginTest extends ApiBaseTest {
	String token;
	
	@BeforeClass
	public void setURI() throws IOException {
		String uri=CommonUtilities.readFileAndReturnString(FileConstants.URI_FILE_PATH);
		RestAssured.baseURI=JsonPath.read(uri,"$.login.prod");
		System.out.println(RestAssured.baseURI);
	}

	@Test
	public void login_TC_01() {

		//RestAssured.baseURI = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
		// Response res=RestAssured.given().headers("Content-Type",
		// "appplicaton/json").when()
		// .body("{\"username\": \"thotarenukadevi@tekarch.com\", \"password\":
		// \"Admin123\"}").post("/login");
		
		HashMap<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "appplicaton/json");
		

		HashMap<String, String> loginCreds = new HashMap<>();
		loginCreds.put("username", "thotarenukadevi@tekarch.com");
		loginCreds.put("password", "Admin123");

		//Response res = RestAssured.given().contentType(ContentType.JSON).when().body(loginCreds).post("/login");
		
		Response res=RestUtils.postReq(loginCreds, headers, "/login");
		
		res.then().assertThat().body(matchesJsonSchema(new File(FileConstants.LOGIN_SCHEMA)));
		
		res.then().assertThat().statusCode(201).extract().response();
		
		

		//token = res.jsonPath().getString("token").replace("[", "").replace("]", "");

	}

	@Test()
	//(dependsOnMethods = "login_TC_01")
	public void getuserData_TC_02() {

		HashMap<String, String> headers = new HashMap<>();
		headers.put("Token", token);
		headers.put("Content-Type", "appplicaton/json");

		//Response getUserData = RestAssured.given().headers(headers).when().post("/getdata");
		Response getUserData=RestUtils.getReq(headers, "/getdata");
		
		Assert.assertEquals(getUserData.statusCode(), 200);
		System.out.println(getUserData.asPrettyString());
	}
	@Test()
	
	//(dependsOnMethods = "getuserData_TC_02")
	public void addData_TC_03() {
		
		HashMap<String, String> headers = new HashMap<>();
		headers.put("Token", token);
		headers.put("Content-Type", "appplicaton/json");
		
		//HashMap<String, String> payload = new HashMap<>();
		//payload.put("", token);
		//payload.put(token, token);
		//payload.put(token, token);
		//payload.put(token, token);

		//Response addUserData = RestAssured.given().headers(headers).when().body(payload).post("/adddata");
		
		
		AddUser renu=new AddUser("TA-1234545","1","11000","234567");
		
		
		
		
		Response addUserData =RestUtils.postReq(renu, headers, "/addData");
		
		System.out.println(addUserData.asPrettyString());
		
		
	}

}
