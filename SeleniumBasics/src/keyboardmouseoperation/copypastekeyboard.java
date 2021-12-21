package keyboardmouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class copypastekeyboard {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://text-compare.com/");
		cdriver.manage().window().maximize();
		WebElement textbox1 = cdriver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement textbox2 = cdriver.findElement(By.xpath("//textarea[@id='inputText2']"));

		textbox1.sendKeys("Welcome to selenium world", Keys.chord(Keys.CONTROL, "a"), Keys.chord(Keys.CONTROL, "c"),
				Keys.chord(Keys.TAB), Keys.chord(Keys.CONTROL, "v"));
		Thread.sleep(3000);
//		textbox2.sendKeys(Keys.chord(Keys.CONTROL, "v"));

		// or Using Actions Class

		Actions act = new Actions(cdriver);

		
		// Ctrl + a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// Ctrl + c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// Tab - shift to textbox2
		act.sendKeys(Keys.TAB);
		act.perform();

		// Ctrl + v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

		if (textbox1.getAttribute("value").equals(textbox2.getAttribute("value"))) {
			System.out.println("Text copied");
		} else {
			System.out.println("text not copied");
		}

	}

}
