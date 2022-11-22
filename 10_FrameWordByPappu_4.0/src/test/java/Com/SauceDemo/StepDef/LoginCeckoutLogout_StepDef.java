package Com.SauceDemo.StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Com.SauceDemo.BaseClass.BaseClass10;
import Com.SauceDemo.elementpage.ElementPage10;
import Com.SauceDemo.utilits.Utilitis10;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCeckoutLogout_StepDef extends BaseClass10 {
	
	// here we are initializing the page factory by initializing  the constractor 
	ElementPage10 pf = PageFactory.initElements(driver, ElementPage10.class);
	
	@Given("One User Open The Browser")
	public void one_user_open_the_browser() {
		//BaseClass10.Browserlaunch2();
	    

	}

	@Given("Two User Navigate to  {string}")
	public void two_user_navigate_to(String string) {
		driver.get(string);

	    

	}

	@Given("User put Valid User Name")
	public void user_put_valid_user_name() {
	//driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("standard_user");
	
		pf = PageFactory.initElements(driver, ElementPage10.class);
		pf.getUsername().sendKeys("standard_user");
		Utilitis10.getHighLighter10(pf.getUsername())	;

	}

	@Given("User put Valid  User Password")
	public void user_put_valid_user_password() {  
	//	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
	//	Utilitis10.getHighLighter10(driver.findElement(By.xpath("//*[@id='password']")));
		
	pf.getPassword().sendKeys("secret_sauce");
	Utilitis10.getHighLighter10(pf.getPassword());
	
	
		
	}

	@Given("User Click on Submit Button")
	public void user_click_on_submit_button() {
	//driver.findElement(By.xpath("//*[@type='submit']")).click();
		pf.getsubmit_button().click();

	}

	@Then("User  Successfully Logged in In page")
	public void user_successfully_logged_in_in_page() {
	    

	}

	@When("User Click on The Sauce Labs Backpack")
	public void user_click_on_the_sauce_labs_backpack() {
	//driver.findElement(By.xpath("(//*[@class='btn btn_primary btn_small btn_inventory'])[1]")).click();
		pf.getthe_sauce_labs_backpack().click();
	
  
	}

	@When("User Click on Shopping Cart")
	public void user_click_on_shopping_cart() {
	//driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
		pf.getclick_on_shopping_cart().click();

	}

	@When("User Clicks On CheckOut Button")
	public void user_clicks_on_check_out_button() {
	//driver.findElement(By.name("checkout")).click();
		pf.getclicks_on_check_out_button().click();

	}

	@When("User Put Valid FirstName")
	public void user_put_valid_first_name() {
	//driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Pappu");
		pf.getvalid_first_name().sendKeys("Pappu");


	}

	@When("USer Put Valid LastName")
	public void u_ser_put_valid_last_name() {
	//driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Paul");
		pf.getvalid_last_name().sendKeys("Paul");
   
	}

	@When("User Put Valid Zip code")
	public void user_put_valid_zip_code() {
	//driver.findElement(By.xpath("//*[@placeholder='Zip/Postal Code']")).sendKeys("30144");
		pf.getvalid_zip_code().sendKeys("30144");
   
	}

	@When("User Click on Continue")
	public void user_click_on_continue() {
	//driver.findElement(By.xpath("//*[@id='continue']")).click();
		pf.getcontinue1().click();;

	}

	@When("User go to Checkout\\/OverReview page and click On Finish")
	public void user_go_to_checkout_over_review_page_and_click_on_finish() {
	//driver.findElement(By.id("finish")).click();
		pf.getCheckoutOverReview().click();
   

	}

	@Then("User Displayed Thank You FOr Your Order Page Message")
	public void user_displayed_thank_you_f_or_your_order_page_message() {
		String expected = driver.findElement(By.xpath("//*[@class='complete-header']")).getText();
		String actual = driver.findElement(By.xpath("//*[@class='complete-header']")).getText();
		
		Assert.assertEquals(actual, expected);
		
		
	    

	}

	@When("User Click on Menu bar")
	public void user_click_on_menu_bar() {
	//driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
		pf.getClickManuBar().click();

	    

	}

	@When("User Click on Logout  button")
	public void user_click_on_logout_button() {
	//driver.findElement(By.xpath("//*[@id='logout_sidebar_link']")).click();
		pf.getlogoutbutton().click();
	
 

	}

	@Then("User should Successfully Log out")
	public void user_should_successfully_log_out() {
//		String expected = driver.findElement(By.xpath("//*[@class='login_logo']")).getText();
//		String actual = driver.findElement(By.xpath("//*//*[@class='login_logo']")).getText();
//		
//		Assert.assertEquals(actual, expected);
	    
 }

}
