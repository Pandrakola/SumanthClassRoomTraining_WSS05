package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class T2 {

	@Test(invocationCount = 5, threadPoolSize = 3)
	public void openBMW() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
//		Reporter.log("Browser is maximized",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bmw.in/");
//		Reporter.log("Landed to BMW welcome page",true);
		driver.close();
//		Reporter.log("closed the browser",true);
	}
	
}
