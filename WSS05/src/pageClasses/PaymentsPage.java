package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentsPage {

	WebDriver driver;
	
	public PaymentsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement username ;
	
	private WebElement password ;
	
	private WebElement loginButton ;
	

	public WebElement getUsername() {
		username = driver.findElement(By.id("username"));
		return username;
	}

	public WebElement getPassword() {
		password = driver.findElement(By.name("pwd"));
		return password;
	}

	public WebElement getLoginButton() {
		loginButton = driver.findElement(By.id("loginButton"));
		return loginButton;
	}

	
	
	
}
