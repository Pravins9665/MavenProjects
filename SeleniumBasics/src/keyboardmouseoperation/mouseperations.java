package keyboardmouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseperations {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		mouseperations mouse = new mouseperations();
//		mouse.rightclick();
//		mouse.doubleclick();
//		mouse.draganddrop();
		mouse.draganddrop1();
//		mouse.mousehover();
		

	}

	void rightclick() {
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rightclick = driver.findElement(By.xpath("//*[@class=\"context-menu-one btn btn-neutral\"]"));

		Actions act = new Actions(driver);
		// Right Click operation
		act.contextClick(rightclick).perform();
	}

	void doubleclick() {
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement field1 = driver.findElement(By.xpath("//*[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//*[@id='field1']//following::input"));
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"field1\"]//following::button"));

		field1.clear();
		field1.sendKeys("Welcome to selenium world");

		Actions act = new Actions(driver);
		// Double click operation
		act.doubleClick(doubleclick).perform();

		if (field1.getAttribute("value").equals(field2.getAttribute("value")))
			System.out.println("double click is working ");
		else
			System.out.println("double click is not working");
	}

	void draganddrop() {
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement italy = driver.findElement(By.xpath("//div[@id=\"box106\"]")); // target element
		WebElement rome = driver.findElement(By.xpath("//div[@id=\"box6\"]")); // source element

		Actions act = new Actions(driver);
		act.dragAndDrop(rome, italy).perform();

	}

	void draganddrop1() {
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.manage().window().maximize();
		WebElement dragdrop = driver.findElement(By.xpath("//a[contains(text(),'DragAndDrop')]"));
		dragdrop.click();
		dragdrop.sendKeys(Keys.RETURN);
		Actions act = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']")));
		// source element
		WebElement image1 = driver.findElement(By.xpath("//img[@src=\"images/high_tatras_min.jpg\"]"));
		// target element
		WebElement droptrash = driver.findElement(By.xpath("//div[@id=\"trash\"]"));

		act.dragAndDrop(image1, droptrash).perform();

	}

	void mousehover() {
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		WebElement desktops = driver.findElement(By.xpath("//a[text() = 'Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[text() = 'Desktops']//following::a[2]"));

		Actions act = new Actions(driver);
		act.moveToElement(desktops).moveToElement(mac).click().perform();

	}
}
