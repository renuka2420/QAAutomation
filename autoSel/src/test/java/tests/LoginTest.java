package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.FileConstants;
import pages.LoginPage;
import utils.FileUtils;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest1() throws IOException {
		
		WebDriver driver=BaseTest.getDriver();
		
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(driver);
		//driver.get("https://login.salesforce.com");
		//driver.get(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "url"));
		//lp.username.sendKeys(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "username"));
		//lp.password.sendKeys(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "password"));
		
	Assert.assertEquals(lp.selectRememberMeCheckBox(),"The Checkbox is clicked");
	lp.loginButton.click();
				
		
		
	}
	@Test
	public void loginTest2() throws IOException {
		
		WebDriver driver=BaseTest.getDriver();
		LoginPage lp=new LoginPage(driver);
		driver.get(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "url"));
		
		lp.username.sendKeys(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "username"));
		lp.password.clear();
		lp.loginButton.click();
	}
}
