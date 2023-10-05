package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageClasses.LoginPage;

public class TC_Login_002 {

	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getUsername().sendKeys("admin");
		loginPage.getPassword().sendKeys("admin");
		loginPage.getLoginButton().click();
		
		loginPage.getUsername().sendKeys("admin");
		loginPage.getPassword().sendKeys("manager");
		loginPage.getLoginButton().click();
		
	}
}
