package Selenium1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablecodesofselenium.Utils;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		int brokenlink = 0;

		WebDriver driver = Utils.setUp("chrome", "http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			String href = link.getAttribute("href");
			if (href == null || href.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
			URL url = new URL(href);
			HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();

			if (httpurl.getResponseCode() >= 400) {
				System.out.println(httpurl.getResponseCode() + href + " is" + " Broken Link");
				brokenlink++;
			} else {
				System.out.println(httpurl.getResponseCode() + href + " is" + " Valid Link");
			}
			System.out.println("number of broken links: " + brokenlink);
		}

	}

}
