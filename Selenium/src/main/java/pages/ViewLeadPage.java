package pages;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {
		
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("Not in View Lead page", "fail");
		}
	}
	
	public ViewLeadPage verifyFirstNameOfCreatedLead(String fName){
		
		verifyExactText(locateElement("id", "viewLead_firstName_sp"), fName);
		return this;
	}
	
	public EditLeadPage clickOnEditButton(){
		
		click(locateElement("link", "Edit"));
		return new EditLeadPage();
	}
	
public ViewLeadPage verifyAnualRevenueOfEditLead(String fName){
		
		verifyExactText(locateElement("id", "viewLead_annualRevenue_sp"), "$"+fName+".00");
		return this;
	}

public MyLeadsPage clickOnDeleteButton(){
	click(locateElement("link", "Delete"));
	return new MyLeadsPage();
}

public DuplicateLeadPage clickOnDuplicateButton(){
	click(locateElement("link", "Duplicate Lead"));
	return new DuplicateLeadPage();
}
}
