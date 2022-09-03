package Base;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import Util.utilityClass;


public class baseClass 
{
	public static WebDriver driver;
	
	public static void open_App_in_browser(String browser, String url) throws IOException
	{

		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Interview Project\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\Interview Project\\Softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		utilityClass.implicitWait(driver, 2000);
		driver.get(url); 
				
	}
	public static void Screenshot(WebDriver driver, String Folder_Name, String File_Name, String ExtensionType) throws IOException
	{
		File source_temporary = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti_permanent=new File("F:\\Interview Project\\Automated Screenshots\\"+Folder_Name+"\\"+File_Name+ExtensionType);
		
		FileHandler.copy(source_temporary, desti_permanent);
	}
	
	
}
