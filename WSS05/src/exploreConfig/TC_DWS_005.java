package exploreConfig;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass{

	@Test
	public void clickDigitalDownloads() {
		driver.findElement(By.partialLinkText("Digital downloads")).click();
	}
}
