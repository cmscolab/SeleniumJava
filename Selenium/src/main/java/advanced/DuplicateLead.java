package advanced;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethodsold.ProjectMethods;


public class DuplicateLead extends ProjectMethods {

	@Test(dataProvider="getmail")
	public void duplicateLead(String mail) throws InterruptedException {
		click(locateElement("link", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Email']"));
		type(locateElement("name", "emailAddress"), mail);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(10000);
		click(locateElement("xpath", "(//table[@class='x-grid3-row-table']//a)[1]"));
		String leadName = getText(locateElement("id", "viewLead_firstName_sp"));
		click(locateElement("link", "Duplicate Lead"));
		verifyTitle("Duplicate Lead");
		click(locateElement("name", "submitButton"));
		verifyExactText(locateElement("id", "viewLead_firstName_sp"), leadName);
		


	}
	
	@DataProvider(name="getemail")
	public String[][] getData(){
		String[][] data = new String[4][1];
		data[0][0] = "b@gmail.com";
		data[1][0] = "poorani.ty@gmail.com";
		data[2][0] = "rajesh3245@gmail.com";
		data[3][0] = "abc@test.com";
		return data;
	}

}
