package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Jewellery_001 extends Base {

	@Test
	public void clickOnJewellery() {
		driver.findElement(By.linkText("Jewelry")).click();
	}
}
