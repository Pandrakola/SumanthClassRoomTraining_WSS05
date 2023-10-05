package readData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading {

	public static void main(String[] args) throws IOException {
		
		//Step 1 : Create FileInputStream object
		FileInputStream ref = new FileInputStream("E:\\WSS05-Selenium\\config.properties");
		
		//Step 2 : Create File object
		Properties file = new Properties();
		
		//Step 3 : call read methods
		file.load(ref);
		System.out.println("IDE used is : " + file.get("IDE"));
		System.out.println("Java version is : "+ file.get("Java"));
		System.out.println("Selenium version is : "+ file.get("Selenium"));
		System.out.println("TestNG version is : "+ file.get("TestNG"));
		
	}

}
