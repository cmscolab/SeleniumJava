package session1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindandDeleteLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the browser
		//Syntax to call a Class within another Class
		//ClassName object = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", ./drivers/chromedriver.exe)
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String welcomeText = driver.findElementByXPath("//*[@id='form']/h2").getText();
		if (welcomeText.contains("Demo Sales Manager"))
			System.out.println("Login Successful");
		else
			System.out.println("Failed");
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByName("phoneCountryCode").clear();
		driver.findElementByName("phoneNumber").sendKeys("9566127063");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(10000);
		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]"
				+ "").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("NOKIA");
		driver.findElementById("updateLeadForm_industryEnumId").sendKeys("Computer Software");
		driver.findElementByName("submitButton").click();


	}

}
