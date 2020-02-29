package session1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;	

public class GUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://10.53.191.80/cwlc/");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("cwlcadmin");
		driver.findElementById("password").sendKeys("NokiacWLC#16");
		driver.findElementByClassName("button-content").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//p[@id='actSessContent']/following::span[text()='OK']").click();
		driver.findElementByXPath("//div[@id='flyoutMenuHolder']//img").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//li[@id='configureMenuEntry']/a").click();
		driver.findElementById("wifiMgmtMenuEntry").click();
		driver.findElementById("zoneMenuEntry").click();
		Thread.sleep(5000);
		driver.findElementById("btnCreateEdit").click();
		Thread.sleep(5000);
		//driver.findElementByXPath("//select[@id='drpAPSoftwareVersion']/following-sibling::div").sendKeys("Wi-Fi17A_AP.02.06.00");
		//WebElement element = driver.findElementByXPath("//select[@id='drpAPSoftwareVersion']/following-sibling::div//*[@class='selected-item truncate']");
		WebElement element = driver.findElementByXPath("//select[@id='APSoftwareVersionDiv']");
		Select oselect = new Select(element);
		List<WebElement> allOptions = oselect.getOptions();
		System.out.println(allOptions.size());
		for(WebElement item : allOptions){
			
			System.out.println(item.getText());
		}
		oselect.selectByVisibleText("Wi-Fi17A_AP.02.06.00");
		driver.findElementById("user").click();
		driver.findElementByLinkText("Log Out").click();
		driver.findElementByXPath("//*[@id='logoutConfirm']").click();
		driver.close();

	}

}
