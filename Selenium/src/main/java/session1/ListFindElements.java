package session1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", ./drivers/chromedriver.exe)
		driver.get("https://www.crystalcruises.com/cruises/calendar?year=2017");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> listOfLinkTexts = driver.findElementsByXPath("//a[text()='Request A Quote']");
		System.out.println(listOfLinkTexts);
		System.out.println(listOfLinkTexts.size());
		driver.quit();
	}

}
