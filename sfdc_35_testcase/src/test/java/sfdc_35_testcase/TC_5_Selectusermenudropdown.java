package sfdc_35_testcase;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_5_Selectusermenudropdown extends ReusableMethods {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
//		  WebDriverManager.firefoxdriver().setup();
		  driver =new ChromeDriver();
		  driver.get("https://login.salesforce.com");
		  driver.manage().window().maximize();
		WebElement Uname=driver.findElement(By.xpath("//input[@id='username']"));
		enterText(Uname, "aruan@abc.com", "UserName");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		enterText(pwd, "Anoop@1234", "Password");
		WebElement remember=driver.findElement(By.xpath("//*[@id='rememberUn']"));
		//remember.click();
		selectCheckBox(remember, "RememberMe");
	    WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
	    clickObj(login, "login");
	    String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		//Assert.assertEquals(expectedTitle, actualTitle);
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		WebElement UserMenu = driver.findElement(By.xpath("//*[@id='userNavButton']"));
		UserMenu.click();
		
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='userNav-menuItems']//a"));
		List<String> li1 = Arrays.asList("My", "My Settings", "Developer Console","Switch to Lightning Experience", "Logout");
		System.out.println(li);
		System.out.println(li1);
		/*
		 * for (WebElement we : li) { boolean error=false; //
		 * System.out.println(we.getText()); if (!li1.contains(we.getText())) { error =
		 * true; } if (!error) { System.out.println("The Usermenu is Shown Correctly");
		 * 
		 * }
		 * 
		 * }
		 */
		//driver.close();
		System.out.println("TC_5 Check RemeberMe completed");
	}
}

