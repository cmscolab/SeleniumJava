package session1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the browser
		//Syntax to call a Class within another Class
		//ClassName object = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", ./drivers/chromedriver.exe)
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@value='Say my name!']").click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Chandana");
		driver.switchTo().alert().accept();
		String alertText = driver.switchTo().alert().getText();
		Thread.sleep(5000);
		if (alertText.contains("Chandana")){
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			System.out.println("Operation Successful");
		}
		else
			System.out.println("Operation not successful");
		driver.quit();
	}

}
