package session1;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated constructor stub
	
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", ./drivers/chromedriver.exe)
		driver.get("http://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement tagsText = driver.findElementById("tags");
		//tagsText.sendKeys("a");
		Actions builder = new Actions(driver);
		builder.sendKeys(tagsText, "a").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN, Keys.ENTER).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
