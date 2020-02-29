package pages;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {
	
	public MyHomePage(){
		
		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("Not in My Home Page", "fail");
		}
		
	}
	
	public MyLeadsPage clickOnLeadsTab(){
		click(locateElement("link", "Leads"));
		return new MyLeadsPage();
	}

}
