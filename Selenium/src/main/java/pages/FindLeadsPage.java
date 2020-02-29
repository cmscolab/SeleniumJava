package pages;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

	public FindLeadsPage() {
		
		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("Not in Find Leads Page", "fail");
		}
	}
	
	public FindLeadsPage clickPhoneTab(){
		
		click(locateElement("xpath", "//span[text()='Phone']"));
		return this;
	}
	
	public FindLeadsPage enterphonenumber(String num){
		type(locateElement("name", "phoneNumber"), num);
		return this;
		
	}
	
	public FindLeadsPage clickonFindLeadsButton(){
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		return this;
		
	}

	public ViewLeadPage clickOnTheFirstLeadFound(){
		click(locateElement("xpath", "(//table[@class='x-grid3-row-table']//a)[1]"));
		return new ViewLeadPage();
	}
	
	public FindLeadsPage enterLeadID(String leadID){
		type(locateElement("name", "id"), leadID);
		return this;
		
	}
	public FindLeadsPage verifyNoRecordToDisplayMsg(){
		verifyExactText((locateElement("xpath", "//div[@class='x-paging-info']")), "No records to display");
		return this;
	}
	
	public String getIDofFirstFoundLead(){
		String leadID = getText(locateElement("xpath", "(//table[@class='x-grid3-row-table']//a)[1]"));
		return leadID;
	}
}
