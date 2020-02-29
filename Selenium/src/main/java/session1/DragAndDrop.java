package session1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
	
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", ./drivers/chromedriver.exe)
		driver.get("http://jqueryui.com/sortable");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 4']");
		int locationY = item5.getLocation().getY();
		System.out.println(locationY);
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, 0, locationY).perform();
		
		
	}

}
