package session1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainTable {

	public static void main(String[] args) throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty(", value)
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Bangalore", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Kerala", Keys.TAB);
		driver.findElementById("buttonFromTo").click();
		WebElement checkDate = driver.findElementById("chkSelectDateOnly");
		if (checkDate.isSelected()){
			checkDate.click();
		}
		Thread.sleep(3000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList']//tr"));
		ArrayList<String> trainNames = new ArrayList<String>();
		for (WebElement i : rows) {

			List<WebElement> columns = i.findElements(By.tagName("td"));
			if(!(columns.size()==0)){
			//System.out.println((columns.get(1).getText()));
			trainNames.add((columns.get(1).getText()));
			}
		}
		System.out.println(trainNames);
		driver.findElementByLinkText("Train Name").click();
		List<WebElement> rowsAfterClick = driver.findElements(By.xpath("//table[@class='DataTable TrainList']//tr"));
		ArrayList<String> trainNamesAfterClick = new ArrayList<String>();
		for (WebElement j : rowsAfterClick) {

			List<WebElement> columnsAfterClick = j.findElements(By.tagName("td"));
			if(!(columnsAfterClick.size()==0)){
			//System.out.println((columnsAfterClick.get(1).getText()));
			trainNamesAfterClick.add((columnsAfterClick.get(1).getText()));
			}
		}
		System.out.println(trainNamesAfterClick);
		Collections.sort(trainNames);
		//trainNames.
		//trainNames.
		
	}
	//driver.quit();
	
		
	}
	

