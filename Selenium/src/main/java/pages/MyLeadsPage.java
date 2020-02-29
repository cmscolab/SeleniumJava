package pages;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {

	public MyLeadsPage() {

		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("Not in My Leads Page", "fail");
		}
	}

	public CreateLeadPage clickOnCreateLead(){
		click(locateElement("link", "Create Lead"));
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickOnFindLeads(){
		click(locateElement("link", "Find Leads"));
		return new FindLeadsPage();
	}
	
	public MergeLeadPage clickOnMergeLeads(){
		click(locateElement("link", "Merge Leads"));
		return new MergeLeadPage();
	}

}
