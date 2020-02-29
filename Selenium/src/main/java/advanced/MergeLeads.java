package advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import wdMethodsold.ProjectMethods;


	public class MergeLeads extends ProjectMethods {
		
		@Test()
		public void merge() throws InterruptedException{
			click(locateElement("link", "Merge Leads"));
			String parentWindowHandle = getWindowHandel();
			click(locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[1]"));
			Set<String> allWindHandel = getWindowHandels();
	    	List<String> allWindowHandelsList = new ArrayList<String>();
		    allWindowHandelsList.addAll(allWindHandel);
		    String newWindowHandel1 = allWindowHandelsList.get(1);
		    switchToWindow(newWindowHandel1);
		    type(locateElement("xpath", "//label[text()='Lead ID:']/..//input"), "10237");
		    click(locateElement("xpath", "//button[text()='Find Leads']"));
		    Thread.sleep(3000);
		    click(locateElement("xpath", "//table[@class='x-grid3-row-table']//tr[1]/td[1]//a"));
		    switchToWindow(parentWindowHandle);
		    click(locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]"));
		    Set<String> allWindowHandels = getWindowHandels();
		    List<String> allWindowHandelsList1 = new ArrayList<String>();
		    allWindowHandelsList1.addAll(allWindowHandels);
		    String newMoreWindowHandle = allWindowHandelsList1.get(1);
		    switchToWindow(newMoreWindowHandle);
		    type(locateElement("xpath", "//label[text()='Lead ID:']/..//input"), "10252");
		    click(locateElement("xpath", "//button[text()='Find Leads']"));
		    Thread.sleep(3000);
		    click(locateElement("xpath", "//table[@class='x-grid3-row-table']//tr[1]/td[1]//a"));
		    switchToWindow(parentWindowHandle);
		    click(locateElement("link", "Merge"));
		    acceptAlert();
		    verifyDisplayed(locateElement("xpath", "//span[text()='First name']"));	


	}

}
