package pages;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{

	public MergeLeadPage() {
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("Not in Merge Leads Page", "fail");
		}
	}
	}
	
	
