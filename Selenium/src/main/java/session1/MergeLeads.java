package session1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads {

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
		driver.findElementByLinkText("Merge Leads").click();
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> allWindHandel = driver.getWindowHandles();
		List<String> allWindowHandelsList = new ArrayList<String>();
		allWindowHandelsList.addAll(allWindHandel);
		String newWindowHandel1 = allWindowHandelsList.get(1);
		driver.switchTo().window(newWindowHandel1);
		driver.findElementByXPath("//label[text()='Lead ID:']/..//input").sendKeys("10422");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr[1]/td[1]//a").click();
		driver.switchTo().window(parentWindowHandle);
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> allWindowHandels = driver.getWindowHandles();
		List<String> allWindowHandelsList1 = new ArrayList<String>();
		allWindowHandelsList1.addAll(allWindowHandels);
		String newMoreWindowHandle = allWindowHandelsList1.get(1);
		driver.switchTo().window(newMoreWindowHandle);
		driver.findElementByXPath("//label[text()='Lead ID:']/..//input").sendKeys("10435");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr[1]/td[1]//a").click();
		driver.switchTo().window(parentWindowHandle);
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		//String nameAfterMerge = driver.findElementById("viewLead_firstName_sp").getText();
		driver.findElementByXPath("//span[text()='First name']").isDisplayed();
		driver.quit();
		
		
		
		
		


	}

}
