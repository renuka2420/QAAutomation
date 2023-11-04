
package tests;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import constants.FileConstants;
import listeners.Listner;
//import constants.FileConstants;
import pages.LoginPage;
import pages.UserMenuPage;
import utils.CommonUtils;


@Listeners(Listner.class)
public class UserMenuTest extends BaseTest {
	
	@BeforeClass
	public void navigateToHome() throws IOException {
		WebDriver driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(driver);
	}
	@Test ()
	public void userMenuDropDown_TC06() throws IOException, InterruptedException {

		//SoftAssert softAssert = new SoftAssert();

		WebDriver driver = BaseTest.getDriver();
		UserMenuPage ump = new UserMenuPage(driver);
		CommonUtils.waitForElement(driver, ump.userMenu);
		ump.userMenu.click();
		Assert.assertTrue(ump.verifyUserMenuItems(), "Failed to verify user menu options");
		BaseTest.test.info("usermenuitems verified");
		Assert.assertTrue(ump.selectMyprofile(), "");
	
		CommonUtils.waitForElement(driver, ump.profilePage);
		BaseTest.test.info("My profile link is selected");
		Assert.assertTrue(ump.isProfilePageVisible(), "");
		ump.SelectEditContact(driver);
		Assert.assertTrue(ump.verifyProfilePopUpWindow(driver), "");
		Assert.assertTrue(ump.verifyLastNameChangeInAboutTab(driver, "Tekarch"), "");
		Assert.assertTrue(ump.verifyCreatePost(driver, "Hello welcome to java"));
		BaseTest.test.info("post verified");
		Assert.assertTrue(ump.verifyFileUpload(driver, FileConstants.LOGIN_TESTDATA_FILE_PATH));
		Assert.assertTrue(ump.uploadPhoto(driver, FileConstants.PROFILE_PHOTO_FILE_PATH));



	}

}