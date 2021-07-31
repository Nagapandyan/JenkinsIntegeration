package stepdefinition;

import java.sql.Driver;

import org.openqa.selenium.By;

import base.InitializeBrowsers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition extends InitializeBrowsers {
	

	@Given("The user opens chrome browser")
	public void the_user_opens_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    loadBrowsers("Chrome");
	}
	@When("User accesses login URL")
	public void user_accesses_login_url() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.facebook.com/");
	}
	@Then("Land on Login page")
	public void land_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title, "Facebook - உள்நுழையவும் அல்லது பதிவுசெய்யவும்");
	    driver.close();
	    
	}



	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		 
	    System.out.println("user is on the login page");
	    Assert.assertTrue(true);
	}
	@When("The user enters {string} and {string}")
	public void the_user_enters_and(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		    loadBrowsers("Chrome");
			driver.get("https://www.facebook.com/"); 
	        login (username,password);
	        Thread.sleep(5000);
	        
	}
	@Then("User should login successfully")
	public void user_should_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		//InitializeBrowsers.driver.quit();
		String login = driver.getTitle();
		System.out.println("Print#####" + login);
		Assert.assertEquals(login, "Facebook");
		driver.close();
	}




}
