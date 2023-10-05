package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriFileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//span[text()='Send me important updates on']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("resumeUpload")).sendKeys("E:\\WSS05-Selenium\\Installation Steps.pdf");

		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_U);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_H);
		
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_H);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ENTER);		
	}

}



