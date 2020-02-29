package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	
	@BeforeClass
	public void setData() {
		testCaseName = "Create Lead";
		testDescription = "Validatin Creation of Lead functionality";
		authors = "Chandana";
		category = "Sanity";
		browserName = "chrome";
		dataSheetName = "Book1";
	}
 
	@Test(dataProvider="fetchData")
	public void createLead(String uName, String passwd, String cName, String fName, String lName, String PhoneNum, String curr) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(passwd)
		.clickLogin()
		.clickCrmsfa()
		.clickOnLeadsTab()
		.clickOnCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterPhoneNumber(PhoneNum)
		.selectCurrency(curr)
		.clickCreateLeadButton()
		.verifyFirstNameOfCreatedLead(fName);	

	}

}
