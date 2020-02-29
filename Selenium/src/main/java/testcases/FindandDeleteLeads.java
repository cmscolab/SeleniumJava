package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class FindandDeleteLeads extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		testCaseName = "Delete Lead";
		testDescription = "Validating Delete Lead functionality";
		authors = "Chandana";
		category = "Regression";
		browserName = "chrome";
		dataSheetName = "UserNamePassword";
	}

	@Test(dataProvider="fetchData")
	public void findAndDelete(String uname, String pass, String Phonenum) {
		
		
			String leadID = new LoginPage()
			.enterUserName(uname)
			.enterPassword(pass)
			.clickLogin()
			.clickCrmsfa()
			.clickOnLeadsTab()
			.clickOnFindLeads()
			.clickPhoneTab()
			.enterphonenumber(Phonenum)
			.clickonFindLeadsButton()
			.getIDofFirstFoundLead();
			
			new FindLeadsPage()
			.clickOnTheFirstLeadFound()
			.clickOnDeleteButton()
			.clickOnFindLeads()
			.enterLeadID(leadID)
			.clickonFindLeadsButton()
			.verifyNoRecordToDisplayMsg();		


	}

}
