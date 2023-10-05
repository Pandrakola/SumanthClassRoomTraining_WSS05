package exploreConfig;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass{

	@Test
	public void clickBooks() {
		driver.findElement(By.partialLinkText("Books")).click();
	}
	
}
