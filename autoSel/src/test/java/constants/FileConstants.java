package constants;

import utils.CommonUtils;

public class FileConstants {
	public static final String LOGIN_TESTDATA_FILE_PATH=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\LoginSheet.xlsx";
	public static final String LOGIN_TESTDATA_FILE_PATH2 =  System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\config.properties";
	public static final String USER_MENU_TESTDATA_FILEPATH = System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\usermenutestdata.properties";
	public static final String PROFILE_PHOTO_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\Screenshot 2023-08-30 151300.png";
	public static final String REPORT_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\reports\\"+CommonUtils.getStringDateandTimeStamp()+"_SFDC.html";
	public static final String SCREENSHOT_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\reports\\"+CommonUtils.getStringDateandTimeStamp()+"_SFDC.PNG";

	
}