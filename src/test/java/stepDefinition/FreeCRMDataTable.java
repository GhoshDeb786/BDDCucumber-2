package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRMDataTable {

	
	public static WebDriver driver;
	
	@Given("(?i)^the user is on home page$")
	public void the_user_is_on_home_page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INFOCOM\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:/Users/Deb/Downloads/geckodriver-v0.20.0-win64/geckodriver.exe");
		//driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service" , title);
			    
	}

	// Using Data table concept
	
	@When("(?i)^the user fills username and password$")
	public void the_user_fills_username_and_password(DataTable credententials)  {
		
		List<List<String>> data = credententials.raw();
		
		//This is to get the first data of the set (First Row + First Column)
		
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		
		//This is to get the first data of the set (First Row + Second Column)
		
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	    
	}
	
	@And("(?i)^the user clicks on button$")
	public void the_user_clicks_on_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Then("(?i)^the user successfully logins$")
	public void the_user_successfully_logins() {
		String title1 = driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals("Successful Login", "CRMPRO", title1);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
