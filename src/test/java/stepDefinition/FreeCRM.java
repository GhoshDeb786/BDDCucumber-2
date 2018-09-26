package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRM {

	
	public static WebDriver driver;
	
	@Given("(?i)^user is on home page$")
	public void user_is_on_home_page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INFOCOM\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:/Users/Deb/Downloads/geckodriver-v0.20.0-win64/geckodriver.exe");
		//driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service" , title);
			    
	}

	@When("(?i)^user fills username and password$")
	public void user_fills_username_and_password()  {
		
		driver.findElement(By.name("username")).sendKeys("denghosh");
		driver.findElement(By.name("password")).sendKeys("Walmart$1");
	    
	}
	
	@And("(?i)^clicks on button$")
	public void clicks_on_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Then("(?i)^user successfully logins$")
	public void user_successfully_logins() {
		String title1 = driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals("Successful Login", "CRMPRO", title1);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
