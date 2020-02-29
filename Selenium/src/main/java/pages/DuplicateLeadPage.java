package pages;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{

	public DuplicateLeadPage() {
		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("Not in Duplicate Lead page", "fail");
	}
	}
		
		public ViewLeadPage clickOnCreateLeadButton(){
			click(locateElement("name", "submitButton"));
			return new ViewLeadPage();
			
		}
}
