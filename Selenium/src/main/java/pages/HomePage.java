package pages;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods {

	public HomePage() {
		if (!verifyTitle("Opentaps Open Source ERP + CRM")) {
			reportStep("Not in Home Page", "fail");
		}
		//PageFactory.initElements(driver, this);
	}
	
	/*@FindBy (how = How.CLASS_NAME, using = "decorativeSubmit")
	private WebElement logoutButtonEle;*/
	
	public LoginPage clickLogout() {
		click(locateElement("class", "decorativeSubmit"));
		//click(logoutButtonEle);
		return new LoginPage();
	}
	
	public MyHomePage clickCrmsfa(){
		
		click(locateElement("link", "CRM/SFA"));
		return new MyHomePage();
		
	}
}
