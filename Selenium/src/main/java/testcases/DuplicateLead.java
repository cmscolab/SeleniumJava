package testcases;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods {

	@Test(enabled=false)
	public void duplicateLead(String uname, String pass, String phoneNumber) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pass)
		.clickLogin()
		.clickCrmsfa()
		.clickOnLeadsTab()
		.clickOnFindLeads()
		.enterphonenumber(phoneNumber)
		.clickonFindLeadsButton()
		.clickOnTheFirstLeadFound()
		.clickOnDuplicateButton()
		.clickOnCreateLeadButton();


	}

}
