package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings(value = { "unused" })
public class AccessingMethodFromDiffProject {

	public static void main(String[] args) throws InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.makemytrip.com/");
//		System.out.println(1/0);
//		add();
//		Actions actions = new Actions(driver);
//		actions.click().moveToElement(null).doubleClick().perform();
//		actions.build().perform();
	}
	
	
	public void add() {
		System.out.println("from add method");
	}
}
