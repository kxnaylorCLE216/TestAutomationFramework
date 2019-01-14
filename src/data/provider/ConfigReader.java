package data.provider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConfigReader {
	
	private Properties properties;
	
	Logger logger = Logger.getLogger(ConfigReader.class.getName());
	
	public static final String PROPFILEPATH = "config/automationConfigs.properties";
	 
	 public ConfigReader(){
		 
		 BufferedReader reader;
		 
		 FileReader filereader;
	 
		 try {
			 
			 filereader = new FileReader(PROPFILEPATH);
			 
			 reader = new BufferedReader(filereader);
			 
			 properties = new Properties();
	 
			 loadProperties(reader);
		 	
		 	} catch (FileNotFoundException e) {
					 
			 String message = ("automationConfigs.properties file was not found at " 
			 + PROPFILEPATH);
				
			 logger.log(Level.SEVERE, message, e);
				 
		 } 
	 }
	 
	 public void loadProperties(BufferedReader reader) {
		 
		 try {
				
			 properties.load(reader);
			 reader.close();
		 
		 } catch (IOException e) {
			 
			 String message = ("automationConfigs.properties could not load properties" 
					 + PROPFILEPATH);
						
			logger.log(Level.SEVERE, message, e);
		 }
	 }
	 
	 public String getExPageTitle(){
		 String strExpectedTitle = properties.getProperty("expectedPageTitle");
		 if(strExpectedTitle!= null) return strExpectedTitle;
		 else throw new RuntimeException("ExpectedTitle not specified in the Configuration.properties file."); 
		 }
	 
	 public String getURL(){
		 String strURL = properties.getProperty("URL");
		 if(strURL!= null) return strURL;
		 else throw new RuntimeException("URL not specified in the Configuration.properties file."); 
		 }
	 
	 public String getBrowserType(){
		 String strBrowserType = properties.getProperty("browserType");
		 if(strBrowserType!= null) return strBrowserType;
		 else throw new RuntimeException("BrowserType not specified in the Configuration.properties file."); 
		 }
	 
	 public String getIsHeadLess(){
		 String strIsHeadLess = properties.getProperty("isHeadLess");
		 if(strIsHeadLess!= null) return strIsHeadLess;
		 else throw new RuntimeException("BrowserType not specified in the Configuration.properties file."); 
		 }
	 
	 public String getDriverPath(){
		 String strDriverPath = properties.getProperty("driverPath");
		 if(strDriverPath!= null) return strDriverPath;
		 else throw new RuntimeException("DriverPath not specified in the Configuration.properties file."); 
		 }

	 public String getUserName(){
		 String strUserName = properties.getProperty("userName");
		 if(strUserName!= null) return strUserName;
		 else throw new RuntimeException("userName not specified in the Configuration.properties file."); 
		 }

	 public String getPassword(){
		 String strPassword = properties.getProperty("passWord");
		 if(strPassword!= null) return strPassword;
		 else throw new RuntimeException("passWord not specified in the Configuration.properties file."); 
		 }
	 
	 public String getLoginAlert(){
		 String strLoginAlert = properties.getProperty("LoginAlert");
		 if(strLoginAlert!= null) return strLoginAlert;
		 else throw new RuntimeException("LoginAlert not specified in the Configuration.properties file."); 
		 }
	 
}
