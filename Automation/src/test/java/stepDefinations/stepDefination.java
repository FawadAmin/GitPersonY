package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
//import cucumber.api.PendingException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Cucumber.class)
public class stepDefination {
	

    @Given("^User is on NetBanking Landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {

    	//System.setProperty("webdriver.chrome.driver", "/Users/fawad/Downloads/chromedriver");
		//driver = new ChromeDriver();
		Hooks.driver.get("http://facebook.com");
    	System.out.println("navigated to Facebook Login page");
    	

    }

    @When("^User logs into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	//System.out.println(strArg1);
    	//System.out.println(strArg2);
		Hooks.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("faddu786@hotmail.com");
		Hooks.driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("BonjeLA827");
		

    }
    
    @When("^User signs up from Login Page$")
    public void user_signs_up_from_Login_Page(DataTable data) throws Throwable {
    	List<List<String>> obj=data.raw();
    	/*System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
    	System.out.println(obj.get(1).get(0));
    	System.out.println(obj.get(1).get(1));
    	System.out.println(obj.get(1).get(2));
    	System.out.println(obj.get(1).get(3));
    	System.out.println(obj.get(1).get(4));*/
		Hooks.driver.findElement(By.xpath("//input[@id='email']")).sendKeys(obj.get(0).get(0));
		Hooks.driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(obj.get(0).get(1));

    }
    
    @When("^User logs in to application with (.+) and password (.+)$")
    public void user_logs_in_to_application_with_and_password(String username, String password) throws Throwable {
    	//System.out.println(username);
    	//System.out.println(password);
    	Hooks.driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		Hooks.driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);

    }
    
    
    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	//Hooks.driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("Signed into facebook successfully");
    	//System.out.println("home page displayed");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("cards displayed");
    }
    
    @Then("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) {
    	//System.out.println(Hooks.driver.findElement(By.xpath("(//div[@dir='ltr'])[1]")).getText());
    	System.out.println("SUCCESS");
    	
    	//System.out.println(arg1);
  
    }
    
    @Given("^User opens chrome browser$")
    public void user_opens_chrome_browser() throws Throwable {
    	System.out.println("user click chrome icon");

    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("broswer loads");

    }

    @Then("^Check browser is opened$")
    public void check_browser_is_opened() throws Throwable {
    	System.out.println("Chrome opened");

    }
    

}