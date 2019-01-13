package testUtility;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import dataProvider.ConfigReader;


public class commonLib {
	
	public void newBrowser(WebDriver driver){
		
		ConfigReader reader = new ConfigReader();
		
		String strURL = reader.getURL();
		
		String strBrowserType = reader.getBrowserType();
		
		String strDriverPath = reader.getDriverPath();
				
		System.setProperty(strBrowserType, strDriverPath);
		
		
		
		driver.navigate().to(strURL);
						
	}

}
 