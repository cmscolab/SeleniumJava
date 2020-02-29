package wdMethodsold;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods {

	RemoteWebDriver driver = null;  
	int i = 1;

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			
		} 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("Browser Launched successfully");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			e.printStackTrace();
		}
	}

	/*public void startApp(String url) {
		// TODO Auto-generated method stub
		
	}*/

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			case "link":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
				break;

			default:
				break;
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(locValue + " Element Not found");
			throw new RuntimeException();
		} catch(WebDriverException e){
			
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		}
		
		return ele;
	}

	/*public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}*/

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("Entered "+ data +" successfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("Clicked "+ ele +" successfully");
		} catch (WebDriverException e) {
			System.err.println("Click failed on " + ele);
			e.printStackTrace();
		}
	}

	public String getText(WebElement ele) {
		return ele.getText();
		
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		
		Select dropdownOptionCurrency = new Select(ele);
		dropdownOptionCurrency.selectByVisibleText(value);
		
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		
		Select dropdownOptionCurrency = new Select(ele);
		dropdownOptionCurrency.selectByIndex(index);
	}

	public boolean verifyTitle(String expectedTitle) {
		
		if (driver.getTitle().contains(expectedTitle))
			System.out.println("URL contains "+ expectedTitle);
			//return true;
		else
			System.out.println("URL does not contain "+ expectedTitle);
			return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		if (getText(ele).equals(expectedText))
			System.out.println("Text exactly matches to "+ expectedText);
		else
			System.out.println("Text does not match "+ expectedText);
		
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		if (getText(ele).contains(expectedText))
			System.out.println("Text contains "+ expectedText);
		else
			System.out.println("Text does not contain "+ expectedText);
		
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void verifyDisplayed(WebElement ele) {
		ele.isDisplayed();
		
	}

	public void switchToWindow(String windowHandle) {
		
		driver.switchTo().window(windowHandle);
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		try{
			
			File srcFile = driver.getScreenshotAs(OutputType.FILE);
			File destFile = new File ("./screenshot/screenshot"+i+".jpeg");
			FileUtils.copyFile(srcFile, destFile);
			System.out.println("Screenshot captured successfully");
		}catch (IOException e){
			System.err.println("IOException while taking snapshot");
		}catch (WebDriverException e){
			
			System.err.println("WebDriverException occured during takesnap");
		}
		
		
	}

	public void closeBrowser() {
		driver.close();
		// TODO Auto-generated method stub
		
	}

	public void closeAllBrowsers() {
		driver.quit();
		
	}
	
	public String getWindowHandel() {
		return driver.getWindowHandle();		
	}
	
	public Set<String> getWindowHandels() {
		return driver.getWindowHandles();		
	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void startApp(String url) {
		// TODO Auto-generated method stub
		
	}

}
