package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
WebDriver driver;
	@Given("^I want t write a step with precondtion$")
	public void i_want_t_write_a_step_with_precondtion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://magento.com");
	    driver.findElement(By.linkText("MY ACCOUNT")).click();
	}

	@When("^I update my user name and password$")
	public void i_update_my_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I should get access to the admin panel$")
	public void i_should_get_access_to_the_admin_panel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
