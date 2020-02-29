package session1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public GetWindowHandles() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", ./drivers/chromedriver.exe)
		driver.get("https://www.crystalcruises.com/cruises/calendar?year=2017");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String parWinHandel = driver.getWindowHandle();
		System.out.println(parWinHandel);
		driver.findElementByXPath("(//a[text()='Book now'])[4]").click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> allWindowHandlesList = new ArrayList<String>();
		allWindowHandlesList.addAll(allWindowHandles);
		String newWinHandel = allWindowHandlesList.get(1);
		driver.switchTo().window(newWinHandel);
		driver.findElementById("MainContent_chkGuest2sailed").click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(parWinHandel);
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(newWinHandel);
		File src  = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/crystal.jpeg");
		FileUtils.copyFile(src, dest);
		driver.quit();

	}

}
