package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import dataProvider.ConfigReader;

public class PalindromeTestPage {

	WebDriver driver;
	
	By pageTitle = By.className("navbar-brand");
	
	By radio1label = By.id("radio1label");
	
	By radio2label = By.id("radio2label");
	
	By radio3label = By.id("radio3label");
	
	By radio4label = By.id("radio4label");
	
	By radio5label = By.id("radio5label");
	
	By radio6label = By.id("radio6label");
	 
	By radio7label = By.id("radio7label");
	
	By input1label = By.id("input1label");
	
	By input2label = By.id("input2label");
	
	By input3label = By.id("input3label");
	
	By input4label = By.id("input4label");
	
	By input5label = By.id("input5label");
	
	By input6label = By.id("input6label");
	
	By check1label = By.id("check1label");
	
	By check2label = By.id("check2label");
	
	By check3label = By.id("check3label");
	
	By check4label = By.id("check4label");
	
	By check5label = By.id("check5label");
	
	By check6label = By.id("check6label");
	
	By dropDown = By.id("select");
	
	By table = By.id("table-body");
	
	By moreButton = By.className("btn btn-secondary btn-lg btn-block");
	
	public PalindromeTestPage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public String getPageTitle(){
		
		return driver.findElement(pageTitle).getText();

	}
	
	public boolean isExpectedPageTitle(){
		
		ConfigReader reader = new ConfigReader();
				
		String strPageTitle =  getPageTitle();
		
		String strExpectedPageTitle = reader.getExPageTitle();
		
		return new String(strPageTitle).equals(strExpectedPageTitle);

	}
	
	public void setDropDown(String strSelection){
		
		Select selectDropDown = new Select(driver.findElement(dropDown));
		
		selectDropDown.selectByValue(strSelection);
	}
	
	public List getDropDownOptions(){
		
		Select selectDropDown = new Select(driver.findElement(dropDown));
		
		return selectDropDown.getOptions();
	}
	
	public void clickMoreButton(){
		  
		driver.findElement(moreButton).click();
		  
	}
	
}
