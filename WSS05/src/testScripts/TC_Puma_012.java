package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Puma_012 {

	@Test(groups = "Sportswear")
	public void openingPuma() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.puma.com/in");
		Reporter.log("Opened Puma web page",true);
		driver.close();
		Reporter.log("closed the browser",true);
	}
}
