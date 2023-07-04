package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class OpenGoogStepDef {
	
	WebDriver driver;
	
	@Given("^user is entering google$")
	public void user_is_entering_google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				 "/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
				 driver=new ChromeDriver();
				 driver.get("https://www.google.com/");
	   
	}

	@When("^user is typing \"([^\"]*)\"$")
	public void user_is_typing(String searchTerm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	   
	}

	@When("^enters return Key$")
	public void enters_return_Key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	    
	}

	@Then("^the user should see search results$")
	public void the_user_should_see_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("dinesh")).isDisplayed(); 
		if(status) {
		 System.out.println("Result Displayed");
	    
	}
	    
	}

}
