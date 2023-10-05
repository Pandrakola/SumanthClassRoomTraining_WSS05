package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Cart_001 extends Base {

	@Test
	public void addProductToCart() {
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
}
