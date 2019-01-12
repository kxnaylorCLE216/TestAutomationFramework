package testUtility;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class commonLib {
	
	static WebDriver driver;
	
	public void newBrowser(String strURL){
				
		System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
		
		driver = new ChromeDriver();    
		
		driver.navigate().to(strURL);
				
	}

}
