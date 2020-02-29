package session1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		//Syntax to call a Class within another Class
		//ClassName object = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", ./drivers/chromedriver.exe)
		driver.get("http://leaftaps.com/opentaps/");
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
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("NSN");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kavitha");
		driver.findElementById("createLeadForm_lastName").sendKeys("M S");
		//driver.findElementById("createLeadForm_parentPartyId").sendKeys("2345");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("chan");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("dana");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("560010");
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Partnership");
		driver.findElementByClassName("smallSubmit").click();
		//Thread.sleep(1500);
		String leadName = driver.findElementById("viewLead_companyName_sp").getText();
		if (leadName.contains("Nokia"))
			System.out.println("Lead creation successful");
		else
			System.out.println("Lead creation not successful");
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("").sendKeys("Kavitha");
		driver.findElementByClassName("x-btn-text").click();
		String createdLead = driver.findElementByClassName("x-grid3-body").getText();
		if (createdLead.contains("Kavitha"))
			System.out.println("Finding created Lead Successful");
		else
			System.out.println("Finding created Lead Failed");
		//driver.findElementByClassName("decorativeSubmit").click();
	}

}
