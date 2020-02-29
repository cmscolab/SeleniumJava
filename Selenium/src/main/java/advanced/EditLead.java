package advanced;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethodsold.ProjectMethods;

public class EditLead extends ProjectMethods {

	@Test(dataProvider="getdata")
	public void editLead(String phoneNumber) throws InterruptedException {
		click(locateElement("link", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Phone']"));
		//type(locateElement("name", "phoneCountryCode"), " ");
		type(locateElement("name", "phoneNumber"), phoneNumber);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(5000);
		click(locateElement("xpath", "(//table[@class='x-grid3-row-table']//a)[1]"));
		click(locateElement("xpath", "//a[text()='Edit']"));
		selectDropDownUsingText(locateElement("id", "updateLeadForm_currencyUomId"), "");
		click(locateElement("name", "submitButton"));
	}


	@DataProvider(name="getdata")
	public String[][] getData() {
		
		String[][] data = new String[3][2];
		data[0][0] = "9944111407";
		data[0][1] = "INR - Indian Rupee";
		data[1][0] = "9777871580";
		data[1][1] = "ARA - Argentinian Austral";
		data[2][0] = "987654321";
		data[2][1] = "BRR - Brazil";
		return data;
		
	}
	
}