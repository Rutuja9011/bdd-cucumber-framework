package stepDefination;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class stepDefination {
	 WebDriver driver;
	 String url;
	 String Email;
	 String password;
	@Before
	 public void setup() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Properties prop = PropertiesFileReader.read("config.properties");
		 url= prop.getProperty("baseUrl");
		 Email= prop.getProperty("Email");
		 password = prop.getProperty("password");
		 System.out.println(url);
		 System.out.println(Email);
		 System.out.println(password);
	}
	@Given("User is on nopcommerce site")
	
	public void user_is_on_nopcommerce_site() {
	   driver.get(url);
	}
	@When("User click on login")
	public void user_click_on_login() {
	driver.findElement(By.className("ico-login")).click();
	  
	}
	@And("User enter username and password")
	public void user_enter_username_and_password() {
	   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	}
	@And("User click on login button")
	public void user_click_on_login_button() {
	  driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}
	
	 @Then("User should successful login")
    public void userShouldSuccessfulLogin() {
        boolean loginSuccessful = driver.findElement(By.linkText("Log out")).isDisplayed();
        assert loginSuccessful : "User login was not successful.";
    }

     
	 }


	 

	


