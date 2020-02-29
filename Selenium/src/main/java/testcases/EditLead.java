package testcases;



import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethodsold.SeMethods;

public class EditLead extends SeMethods {

	@Test(dependsOnMethods={"testcases.CreateLead.createLead"})
	public void editLead(String uname, String pass, String phNum, String annRev) throws InterruptedException {
		new LoginPage().enterUserName(uname)
		.enterPassword(pass)
		.clickLogin()
		.clickCrmsfa()
		.clickOnLeadsTab()
		.clickOnFindLeads()
		.enterphonenumber(phNum)
		.clickonFindLeadsButton()
		.clickOnTheFirstLeadFound()
		.clickOnEditButton()
		.editAnnualRevenue(annRev)
		.clickOnUpdateButton()
		.verifyAnualRevenueOfEditLead(annRev);
	}

}
