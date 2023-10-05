package exploreConfig;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass{

	@Test
	public void clickApparelsAndShoes() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	}
}
