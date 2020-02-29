package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {
		
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("Not in Create Lead Page", "fail");
		}
		PageFactory.initElements(driver, this);
	}
	
	public CreateLeadPage enterCompanyName(String cName){
		type(locateElement("id", "createLeadForm_companyName"), cName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fName){
		type(locateElement("id", "createLeadForm_firstName"), fName);
		return this;
		
	}
	public CreateLeadPage enterLastName(String lName){
		type(locateElement("id", "createLeadForm_lastName"), lName);
		return this;
		
	}
	public ViewLeadPage clickCreateLeadButton(){
		click(locateElement("name", "submitButton"));
		return new ViewLeadPage();
		
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement phoneNumber;
	
	public CreateLeadPage enterPhoneNumber(String phoneNum){
		type(phoneNumber, phoneNum);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_currencyUomId")
	private WebElement currency;
	
	public CreateLeadPage selectCurrency(String cur){
		selectDropDownUsingText(currency, cur);
		return this;
	}
}
