package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;



public class LoginPage {
	
	  WebDriver driver;
	  
	  By userName = By.id("inputUsername");
	  
	  By passWord = By.id("inputPassword");
	  
	  By signIn = By.className("btn btn-lg btn-primary btn-block");
	  
	  public LoginPage(WebDriver driver){
		  
		  this.driver = driver;
	  }
	  
	  public void setUserName(CharSequence[] strUserName){
		  
		  driver.findElement(userName).sendKeys(strUserName);
	  }
	  
	  public void setPassword(CharSequence[] strPassword){
		  
		  driver.findElement(userName).sendKeys(strPassword);
	  }

	  public void clickLogin(){
		  
		  driver.findElement(signIn).click();
		  
	  }
	  
	  public void loginIntoPage(CharSequence[]  strUserName, CharSequence[]  strPassword){
		  
		  this.setUserName(strUserName);
		  
		  this.setPassword(strPassword);
		  
		  this.clickLogin();
		  
	  }
	  
}
