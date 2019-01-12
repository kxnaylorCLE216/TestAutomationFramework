package testUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	Properties props;
	
	public void configFile()
	{
		
		try {
			
			File configFile = new File("./configs");
			
			FileInputStream input = new FileInputStream(configFile);
			
			props = new Properties();
			
			props.load(input);
			
		} catch (Exception ex) {
			
			System.out.println(ex.getMessage());
		}
	}
	
	public String getExPageTitle()
	{
		return props.getProperty("expectedPageTitle");
		
	}
	

}
