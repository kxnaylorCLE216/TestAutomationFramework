package pages;
import testUtility.commonLib;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

	@Test
	public void testBrowser() {
				
		commonLib common = new commonLib();
		
		common.newBrowser("http://qa-home-palindrome.s3-website.us-east-2.amazonaws.com/login.html");
	}

}
