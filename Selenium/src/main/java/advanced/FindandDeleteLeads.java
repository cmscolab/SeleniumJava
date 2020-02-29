package advanced;



import org.testng.annotations.Test;

import wdMethodsold.ProjectMethods;


public class FindandDeleteLeads extends ProjectMethods{

	@Test()
	public void findAndDelete() throws InterruptedException {
			click(locateElement("link", "Find Leads"));
			click(locateElement("xpath", "//span[text()='Phone']"));
			//type(locateElement("name", "phoneCountryCode"), " ");
			type(locateElement("name", "phoneNumber"), "9988776655");
			click(locateElement("xpath", "//button[text()='Find Leads']"));
			Thread.sleep(5000);
			click(locateElement("xpath", "(//table[@class='x-grid3-row-table']//a)[1]"));
			click(locateElement("link", "Delete"));

	}

}
