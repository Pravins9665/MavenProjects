package TestNGsample;

import org.testng.annotations.Test;

public class secondNG {
	
	//enabled
	//priority
	//description
	//dependsOnMethods
	//timeouts
	
	@Test(priority=0, enabled = true, description ="open browser & url")
	public void openBrowserAndAppURL() {
		int i = 10 / 0;
		System.out.println("Open browser and enter app url");
	}

	@Test(priority=1, enabled = false, dependsOnMethods = "openBrowserAndAppURL")
	public void login() {
		System.out.println("enter username, password and click on login button");
	}

	@Test(priority=2, enabled = true)
	public void createTask() {
		System.out.println("create new task");
	}

	@Test(priority=3,enabled = true)
	public void logoutClose() {
		System.out.println("Logout from the application and close the browser");
	}
}
