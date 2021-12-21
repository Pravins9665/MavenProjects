package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		String chromedriverpath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		WebDriver cdriver = new ChromeDriver();

		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		cdriver.get("https://www.facebook.com/");

		cdriver.findElement(By.linkText("Create New Account")).click();

		// 1. Day Dropdown
		WebElement dropday = cdriver.findElement(By.id("day"));
		System.out.println("day dropdwon is dispalyed: " + dropday.isDisplayed());
		System.out.println("day dropdwon is enabled: " + dropday.isEnabled());

		// create an instance of select class
		Select dd = new Select(dropday);

		// to check dropdown is multiselect dropdown or not
		System.out.println("Is it a multiselect dropdown: " + dd.isMultiple());

		// to get all the options available in dropdown, their size & print
		List<WebElement> options = dd.getOptions();
		System.out.println("list of all the options: " + options.size());
		for (WebElement count : options) {
			System.out.println(count.getText());
		}
		// to check default selected option in dropdown
		System.out.println("Default selected option is: " + dd.getFirstSelectedOption().getText());

		// to select particular option
		dd.selectByIndex(1);
		System.out.println("Selected option is: " + dd.getFirstSelectedOption().getText());
		System.out.println("---------------------------------------");
		// 2. Month Dropdown
		WebElement dropmonth = cdriver.findElement(By.id("month"));
		System.out.println("month dropdwon is dispalyed: " + dropday.isDisplayed());
		System.out.println("month dropdwon is enabled: " + dropday.isEnabled());

		// create an instance of select class
		Select dm = new Select(dropmonth);

		// to check dropdown is multiselect dropdown or not
		System.out.println("Is it a multiselect dropdown: " + dm.isMultiple());

		// to get all the options available in dropdown, their size & print
		List<WebElement> options1 = dm.getOptions();
		System.out.println("list of all the options: " + options1.size());
		for (WebElement count : options1) {
			System.out.println(count.getText());
		}
		// to check default selected option in dropdown
		System.out.println("Default selected option is: " + dm.getFirstSelectedOption().getText());

		// to select particular option
		dm.selectByVisibleText("Nov");
		System.out.println("Selected option is: " + dm.getFirstSelectedOption().getText());
		System.out.println("---------------------------------------");

		// 3. Year Dropdown
		WebElement dropyear = cdriver.findElement(By.id("year"));
		System.out.println("year dropdwon is dispalyed: " + dropyear.isDisplayed());
		System.out.println("year dropdwon is enabled: " + dropyear.isEnabled());

		// create an instance of select class
		Select dy = new Select(dropyear);

		// to check dropdown is multiselect dropdown or not
		System.out.println("Is it a multiselect dropdown: " + dy.isMultiple());

		// to get all the options available in dropdown, their size & print
		List<WebElement> options2 = dy.getOptions();
		System.out.println("list of all the options: " + options2.size());
		for (WebElement count : options2) {
			System.out.println(count.getText());
		}
		// to check default selected option in dropdown
		System.out.println("Default selected option is: " + dy.getFirstSelectedOption().getText());

		// to select particular option
		dy.selectByValue("1998");
		System.out.println("Selected option is: " + dy.getFirstSelectedOption().getText());
	}

}
