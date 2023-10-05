package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_AddProductToCart extends BaseClass {

	@Test
	public void add() {
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
	
	@Test
	public void clickOn() {
		driver.findElement(By.linkText("awesome")).click();
	}
}
