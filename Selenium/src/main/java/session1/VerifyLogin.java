package session1;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		//Syntax to call a Class within another Class
		//ClassName object = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty(", value)
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByClassName("decorativeSubmit").click();
		
	}

}
