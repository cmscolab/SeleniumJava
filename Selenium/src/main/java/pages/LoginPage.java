package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods {

	public LoginPage() {
		//this.driver = driver;
		//this.test = test;
		if (!verifyTitle("Opentaps Open Source ERP + CRM")) {
			reportStep("Not in my Login Page", "fail");
		}
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.ID, using = "username")
	private WebElement userNameEle;
	
	public LoginPage enterUserName(String data) {
		type(userNameEle, data);
		return this;
	}
	
	@FindBy (how = How.ID, using = "password")
	private WebElement passwordEle;

	public LoginPage enterPassword(String data) {
		type(passwordEle, data);
		return this;
	}
	
	@FindBy (how = How.CLASS_NAME, using = "decorativeSubmit")
	private WebElement loginButtonEle;
	
	public HomePage clickLogin() {
		click(loginButtonEle);
		/*HomePage hp = new HomePage();
		return hp;*/
		return new HomePage();
	}
}
