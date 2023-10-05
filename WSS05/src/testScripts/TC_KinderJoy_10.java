package testScripts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_KinderJoy_10 {

	@Test(groups = "Choclates")
	public void openingKinderJoy() {
		Assert.assertTrue(false);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.kinder.com/in/en/kinder-joy");
		Reporter.log("Opened Kinder Joy web page", true);
		driver.close();
		Reporter.log("closed the browser", true);
	}
}
