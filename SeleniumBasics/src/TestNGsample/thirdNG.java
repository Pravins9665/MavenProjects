package TestNGsample;

import org.testng.annotations.Test;

public class thirdNG {
	@Test(enabled = true, timeOut = 2000)
	public void openBrowserAndAppURL() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Open browser and enter app url");
	}
}
