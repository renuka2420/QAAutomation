package ecommerceapplication;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Launch {
	
	public static void main (String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","11");
		dc.setCapability("deviceName","fire");
		dc.setCapability("apppcakage","com.solodroid.solomerce");
		dc.setCapability("appActivity",".activities.ActivitySplash");
		
		
		//AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		AppiumDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.findElement(By.id("com.solodroid.solomerce:id/icon")).clik();
		
	}

}
