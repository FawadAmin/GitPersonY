package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;

	
	@Before("@MobileTest")
	public void BeforeHooksMobile () {
	System.out.println("Open Moile App using Icon");
	System.setProperty("webdriver.chrome.driver", "/Users/fawad/Downloads/chromedriver");
	driver = new ChromeDriver();
	}
	
	@After("@MobileTest")
	public void AfterHooksMobile () {
	System.out.println("Close Moile App using Icon");
	}
	
	@Before("@WebTest")
	public void BeforeHooksWeb () {
	System.out.println("Open Browser using Icon");
	System.setProperty("webdriver.chrome.driver", "/Users/fawad/Downloads/chromedriver");
	driver = new ChromeDriver();
	 
	}
	
	@After("@WebTest")
	public void AfterHooksWeb () {
	System.out.println("Close Browser using Icon");
	System.out.println("Delete Browser Cookies");
	}
	
	
	@Before("@RegressionTest")
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/fawad/Downloads/chromedriver");
		driver = new ChromeDriver();
		
	}
	
	@After("@RegressionTest")
	public void CloseBrowser() {
		driver.close();
		
	}
	
	
	
	
	
}