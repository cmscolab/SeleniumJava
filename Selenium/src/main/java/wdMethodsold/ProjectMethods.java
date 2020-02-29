package wdMethodsold;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import learnReadExcel.ReadExcel;

public class ProjectMethods extends SeMethods {

	@Parameters({"browser", "url", "username", "password"})
	@BeforeMethod(groups="general")
	public void login(String brw, String URL, String uname, String passwd) {
		startApp(brw, URL);
		type(locateElement("id", "username"), uname);
		type(locateElement("id", "password"), passwd);
		click(locateElement("class", "decorativeSubmit"));
		verifyPartialText(locateElement("xpath", "//*[@id='form']/h2"), "Demo Sales Manager");
		click(locateElement("link", "CRM/SFA"));
		click(locateElement("link", "Leads"));
		
	}
	
	@AfterMethod(groups="general")
	public void close(){
		closeAllBrowsers();
	}
	
	@DataProvider(name="fetchdata")
	public String[][] getData() throws InvalidFormatException, IOException{
		ReadExcel readExcelObj = new ReadExcel();
		return readExcelObj.readExcel("UsernamePassword");
	}

}
