package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage() {
		if(!verifyTitle(" opentaps CRM")){
			reportStep("Not in Edit Lead Page", "fail");
		}
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "updateLeadForm_annualRevenue")
	private WebElement annualRevenue;
	
	public EditLeadPage editAnnualRevenue(String annureven){
		type(annualRevenue, annureven);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using="smallSubmit")
	private WebElement editButton;
	
	public ViewLeadPage clickOnUpdateButton(){
		click(editButton);
		return new ViewLeadPage();
	}
}
