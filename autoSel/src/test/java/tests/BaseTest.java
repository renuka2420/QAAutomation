package tests;




import java.io.IOException;
import java.io.File;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import constants.FileConstants;
import com.aventstack.extentreports.ExtentReports;
import utils.FileUtils;

public class BaseTest extends FileUtils {
	
	private static ThreadLocal<WebDriver> threadLocalDriver=new ThreadLocal<>();
	
	
	static ExtentReports extent=new ExtentReports();
	static ExtentSparkReporter spark=null;
	public static ExtentTest test=null;
	
	public static Logger logger=LogManager.getLogger("BASE TEST");
	
	@BeforeMethod
	public void setUp(Method name) {
		BaseTest.test=extent.createTest(name.getName());
		logger.info("BASE TEST : setUp : setup done");
	}
	@AfterMethod
	public void tearDown() {
		
	}
	@Parameters({"browserName","isHeadless"})
	@BeforeTest
	public static void setDriver(String browserName,boolean isHeadless) throws IOException {
		//WebDriver driver=BaseTest.getBrowserType("chrome");
		spark=new ExtentSparkReporter(new File(FileConstants.REPORT_PATH));
		extent.attachReporter(spark);
		WebDriver driver=BaseTest.getBrowserType(browserName,isHeadless);
		//WebDriver driver=BaseTest.getBrowserType(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2,"browser"),false);
		threadLocalDriver.set(driver);
		logger.info("BASE TEST : setDriver : done");
	}
	public static WebDriver getDriver() {
		return threadLocalDriver.get();
		
	}
	
	@AfterTest
public static void removeDriver() {
	getDriver().close();
	threadLocalDriver.remove();
	extent.flush();
	logger.info("BASE TEST : removeDriver : done");
	
	}
	public static WebDriver getBrowserType(String browserName, boolean headless) {

		WebDriver driver;
		String browserType = browserName.toLowerCase();
		switch (browserType) {

		case "chrome":
			if(headless) {
			
			ChromeOptions co=new 	ChromeOptions();
			co.addArguments("--headless");
			logger.info("BASE TEST : getBrowserType : headlesschrome");
			driver = new ChromeDriver(co);
			}
			else
			{
			driver = new ChromeDriver();
			logger.info("BASE TEST : getBrowserType : chrome");
			}
			break;
		case "safari":
			driver = new SafariDriver();
			logger.info("BASE TEST : getBrowserType : safari");
			break;
		case "edge":
			driver = new EdgeDriver();
			logger.info("BASE TEST : getBrowserType : edge");
			break;
		default:
			driver = null;
			logger.fatal("BASE TEST : getBrowserType : incorrect browser name given");

		}
		return driver;

	}
}
