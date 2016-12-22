package Test;

import com.openq.selenium.WebDriver;
import com.openqa.selenium.chrome.ChromeDriver;
import com.openqa.selenium.firefox.FirefoxDriver;
import com.openqa.selenium.ie.InternetExplorerDriver;

public class TestSample {

	public static String browser="ie";
	//public static FirefoxDriver driver;
	public static WebDriver driver;
	
	public static void main(String[] args) {

		
		if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();

		}else if(browser.equals("ie"))
		{
			driver = new InternetExplorerDriver();
		
		}else if(browser.equals("chrome"))
		{			
			driver = new ChromeDriver();
		}
		
		driver.get("http://gmail.com");
		driver.Click("id=dsdsdsd");
		driver.sendKeys("name=asdsdsd");
	}

}
