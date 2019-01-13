package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.*;

import dataProvider.ConfigReader;

public class LoginPage {
	
	  WebDriver driver;
	  
	  By userName = By.id("inputUsername");
	  
	  By passWord = By.id("inputPassword");
	  
	  By signIn = By.cssSelector(".btn.btn-lg.btn-primary.btn-block");
	  
	  By alert = By.id("alert");
	  
	  ConfigReader reader = new ConfigReader();
	  
	  String strUserName = reader.getUserName();
		
	  String strPassword = reader.getPassword();
	  
	  String strExpectedValidation = "Please fill out this field.";
	  
	  public LoginPage(WebDriver driver){
		  
		  this.driver = driver;
	  }
	  
	  public void setUserName(String strUserName){
		  
		 this.driver.findElement(userName).sendKeys(strUserName);
	  }
	  
	  public void setPassword(String strPassword){
		  
		  driver.findElement(passWord).sendKeys(strPassword);
	  }

	  public void clickLogin(){
		  
		  driver.findElement(signIn).click();
		  
	  }
	  
		public String getIncorrectAlert(){
			
			return driver.findElement(alert).getText();

		}
	  
	  public void loginIntoPage(){
		  		  		  		  
		  this.setUserName(strUserName);
		  
		  this.setPassword(strPassword);
		  
		  this.clickLogin();
		  
	  }
	  
	  public boolean loginNoUserName(){
				  		  
		  String strValidateMessage 
		  = driver.findElement(userName).getAttribute("validationMessage");
		  	  	  			  
		  this.setPassword(strPassword);
		  
		  this.clickLogin();
		  
		  return (strValidateMessage.equals(strExpectedValidation));
		  	  
	  }
	  
	  public boolean loginNoPassword(){
		  	  
		  String strValidateMessage 
		  = driver.findElement(passWord).getAttribute("validationMessage");
		  		  			  		  
		  this.setUserName(strUserName);
		  		  
		  this.clickLogin();
		  
		  return (strValidateMessage.equals(strExpectedValidation));
		  
	  }
  
	  public void loginWrongUserName(String strUserName){
		  
		  this.setUserName(strUserName);
		  
		  this.setPassword(strPassword);
		  
		  this.clickLogin();
		  
	  }
	  
	  public void loginWrongPassword(String strPassword){
		  
		  this.setUserName(strUserName);
		  
		  this.setPassword(strPassword);
		  
		  this.clickLogin();
		  
	  }
	  
	  public boolean isExpectedAlert(){
			
			String strPageTitle =  getIncorrectAlert();
			
			String strExpectedPageTitle = reader.getLoginAlert();
			
			return new String(strPageTitle).equals(strExpectedPageTitle);

		}
	    	  
}
