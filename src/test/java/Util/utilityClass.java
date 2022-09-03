package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityClass 
{

	public static void Screenshot(WebDriver driver, String Folder_Name, String File_Name, String ExtensionType) throws IOException
	{
		File source_temporary = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti_permanent=new File("F:\\Interview Project\\Automated Screenshots\\"+Folder_Name+"\\"+File_Name+ExtensionType);
		
		FileHandler.copy(source_temporary, desti_permanent);
	}
	
	public static void implicitWait(WebDriver driver, int timeInMillis)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeInMillis));
	}
	
}
