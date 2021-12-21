package DowloadsUploads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Reusablecodesofselenium.Utils;

public class Downloadwordfiles {

	public static void main(String[] args) {

		WebDriver driver = Utils.setUp("Chrome",
				"https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");

		WebElement docfile = driver.findElement(By.xpath("(//a[text()='Download sample DOC file'])[1]"));
		docfile.click();

	}

}
