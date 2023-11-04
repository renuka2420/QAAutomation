package utils;
import java.io.File;  
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.FileConstants;

public class Excel {
	
	public void readExcelFile(String filePath, String sheetName, int row ,int col) {
		
		
	}

	public static void main(String[] args) throws IOException {
		File file=new File (FileConstants.LOGIN_TESTDATA_FILE_PATH);
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		

	}

}
