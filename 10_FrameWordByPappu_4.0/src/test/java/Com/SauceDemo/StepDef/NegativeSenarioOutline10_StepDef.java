package Com.SauceDemo.StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


import Com.SauceDemo.BaseClass.BaseClass10;
import Com.SauceDemo.elementpage.ElementPage10;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeSenarioOutline10_StepDef extends BaseClass10 {
	
	ElementPage10 pf = PageFactory.initElements(driver, ElementPage10.class);

	
	@Given("User Open The Browser")
	public void user_open_the_browser() {
		//BaseClass10.Browserlaunch2();
	    

	}

	@When("User Navigate to the {string} WebApplication")
	public void user_navigate_to_the_web_application(String string) throws InterruptedException {
		driver.get(string);
		Thread.sleep(2000);
	    

	}

	@When("User put invalid Username {string}")
	public  void user_put_invalid_username(String UserName) {
	driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys(UserName);
		// old pf.getinvalidUserName().sendKeys(UserName);
		// pf = PageFactory.initElements(driver, ElementPage10.class);

		// pf.getInvalidUserName().sendKeys(UserName);
		
		// pf.getInvalidUserName().sendKeys(UserName);

	}

	@When("User put  invalid Password  {string}")
	public  void user_put_invalid_password(String Password) {
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(Password);
		//pf.getinvaliPassword().sendKeys(Password);
		
		//pf.getInvalidPassword().sendKeys(Password);
	}

	@When("User Click on Login button")
	public void user_click_on_login_button() {
	   driver.findElement(By.xpath("//*[@type='submit']")).click();
	   // pf.getClickOnLogInBottom().click();
	    
		pf.getClickLogInBotton().click();
	    

	}

	@Then("User Should see Username and password do not match any user in this service message")
	public void user_should_see_username_and_password_do_not_match_any_user_in_this_service_message() {
	    
		//System.out.println("The Actual Text is "+ driver.getCurrentUrl());
		
		String expected = driver.findElement(By.xpath("//*[@data-test='error']")).getText();
		String actual = driver.findElement(By.xpath("//*[@data-test='error']")).getText();
		
		Assert.assertEquals(actual, expected);
		

	}

}
