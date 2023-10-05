package readData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register2 {

	@DataProvider
	public String[][] registerData()  throws Exception, IOException {
		String[][] data = {
							{"male","Dell","L","dell@gmail.com","dell@123","dell@123"} ,
							{"female","Sony","L","sony@gmail.com","sony@123","sony@123"} ,
							{"male","HP","L","hp@gmail.com","hp@123","hp@123"} ,
						};
		return data;
	}
	
	@Test(dataProvider = "registerData")
	public void registerUser(String [] dataToReg) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		if(dataToReg[0].equalsIgnoreCase("male")){
			driver.findElement(By.id("gender-male")).click();
		}else {
			driver.findElement(By.id("gender-female")).click();
		}		
		driver.findElement(By.id("FirstName")).sendKeys(dataToReg[1]);
		driver.findElement(By.id("LastName")).sendKeys(dataToReg[2]);
		driver.findElement(By.id("Email")).sendKeys(dataToReg[3]);
		driver.findElement(By.id("Password")).sendKeys(dataToReg[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(dataToReg[5]);
		driver.findElement(By.id("register-button")).click();	
		driver.close();
	}
}
