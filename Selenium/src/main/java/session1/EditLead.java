package session1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElementByName("phoneNumber").sendKeys("8901566393");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(10000);
		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]"
				+ "").click();
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement currencyElement = driver.findElementById("updateLeadForm_currencyUomId");
		Select dropdownOptionCurrency = new Select(currencyElement);
		List<WebElement> allOptionsCountry = dropdownOptionCurrency.getOptions();
		for (WebElement item : allOptionsCountry) {
			
			System.out.println(item.getText());
			
		}
		dropdownOptionCurrency.selectByVisibleText("INR - Indian Rupee");
		WebElement industryElement = driver.findElementById("updateLeadForm_industryEnumId");
		Select dropdownOptionIndustry = new Select(industryElement);
		List<WebElement> allOptionsIndustry = dropdownOptionIndustry.getOptions();
		for (WebElement item : allOptionsIndustry) {
			
			System.out.println(item.getText());
			
		}
		dropdownOptionIndustry.selectByIndex(3);
		WebElement ownershipElement = driver.findElementById("updateLeadForm_ownershipEnumId");
		Select dropdownOptionOwnership = new Select(ownershipElement);
		dropdownOptionOwnership.selectByValue("OWN_PARTNERSHIP");
		driver.findElementByName("submitButton").click();
	}

}
