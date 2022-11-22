package Com.SauceDemo.elementpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.SauceDemo.BaseClass.BaseClass10;

public class ElementPage10 extends BaseClass10 {
	
	//
	public ElementPage10() {
		PageFactory.initElements(driver, this);	

	}
	// Login CheckOut and Logout XPaths 

	@FindBy (xpath = "//*[@placeholder='Username']")
	private WebElement Username;
	public WebElement getUsername() {
		return Username;
	}
	
	@FindBy (xpath = "//*[@id='password']" )
	private WebElement Password;
	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy (xpath = "//*[@id='login-button']")
	private WebElement submit_button;
	public WebElement getsubmit_button() {
		return submit_button;
	
	} 
	
	
	@FindBy (xpath = "(//*[@class='btn btn_primary btn_small btn_inventory'])[1]")
	private WebElement the_sauce_labs_backpack;
	public WebElement getthe_sauce_labs_backpack() {
		return the_sauce_labs_backpack; 
		
		
	}
	//click_on_shopping_cart
	@FindBy (xpath = "//*[@class='shopping_cart_link']")
	private WebElement click_on_shopping_cart;
	public WebElement getclick_on_shopping_cart() {
		return click_on_shopping_cart;
	}
	
	//clicks_on_check_out_button
	@FindBy (name ="checkout")
	private WebElement clicks_on_check_out_button;
	public WebElement getclicks_on_check_out_button() {
		return clicks_on_check_out_button;
	
	
	}
	
	//valid_first_name
	@FindBy (xpath ="//*[@placeholder='First Name']")
	private WebElement valid_first_name;
	public WebElement getvalid_first_name() {
		return valid_first_name;
	}
	
	//valid_last_name
	@FindBy (xpath ="//*[@placeholder='Last Name']")
	private WebElement valid_last_name;
	public WebElement getvalid_last_name() {
		return valid_last_name;
		}
	
	//valid_zip_code
	@FindBy (xpath ="//*[@placeholder='Zip/Postal Code']")
	private WebElement valid_zip_code;
	public WebElement getvalid_zip_code() {
		return valid_zip_code;				
	}
	//Click Continue1
	@FindBy (xpath ="//*[@id='continue']")
	private WebElement continue1;
	public WebElement getcontinue1() {
		return continue1;
				
	}
	//Checkout\\/OverReview
	@FindBy (id ="finish")
	private WebElement CheckoutOverReview;
	public WebElement getCheckoutOverReview() {
		return CheckoutOverReview;
	
	
	}
	
	// ClickManuBar
	@FindBy (xpath ="//*[@id='react-burger-menu-btn']")
	private WebElement ClickManuBar;
	public WebElement getClickManuBar() {
		return ClickManuBar;
	
	
	}
	//logoutbutton
	@FindBy (xpath= "//*[@id='logout_sidebar_link']")
	private WebElement logoutbutton;
	public WebElement getlogoutbutton() {
		return logoutbutton;

	}
	//Invalid User Name
	@FindBy (xpath = "//*[@placeholder='Username']")
	private WebElement InvalidUserName;
	public WebElement getInvalidUserName() {
		return InvalidUserName;
	}
	
	//Invalid Password
	@FindBy (xpath = "//*[@type='password']")
	private WebElement InvalidPassword;
	public WebElement getInvalidPassword() {
		return InvalidPassword;
	}
	
	//Click LogIn bottom
	@FindBy (xpath = "//*[@type='submit']")
	private WebElement ClickLogInBotton;
	public WebElement getClickLogInBotton() {
		return ClickLogInBotton;
	}
	
	
	
	
	
	
	
}
	
//	@FindBy (xpath=)
//	Negative Testing Test Cases 
//	invalidUserName
//	@FindBy (xpath= "//*[@placeholder='Username']")
//	private WebElement invalidUserName;
//	public WebElement getinvalidUserName() {
//		return invalidUserName;		
//	}
//	invalidPassword
//	@FindBy (xpath= "//*[@type='password']")
//	private WebElement invaliPassword;
//	public WebElement getinvaliPassword() {
//		return invaliPassword;	
//	}
//	@FindBy (xpath= "//*[@type='submit']")
//	private WebElement ClickOnLogInBottom;
//	public WebElement getClickOnLogInBottom() {
//		return ClickOnLogInBottom;	
		
	
		

