package readData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {

	@Test
	public void getData() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Music\\UKBatchInfo.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		System.out.println(prop.get("name"));
		System.out.println(prop.get("subject"));
		System.out.println(prop.get("Students"));
	}
}
