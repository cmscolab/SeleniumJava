package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginTest extends ProjectMethods {

	@BeforeClass
	public void setData() {
		testCaseName = "TC001_Login TestCase";
		testDescription = "Validatin Login functionality";
		authors = "Bala";
		category = "smoke";
		browserName = "chrome";
		dataSheetName = "TC001_Login";
	}
	
	@Test(dataProvider="fetchData")
	public void loginTestCase(String userName, String password) {
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();
	}
}
