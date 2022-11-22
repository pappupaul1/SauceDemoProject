package Com.SauceDemo.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.SauceDemo.utilits.Utilitis10;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass10 {
	
	public static WebDriver driver;
	
public static void Browserlaunch2() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Use go to Website 
		// driver.get("https://www.saucedemo.com/");
		
		//User put Valid User Name
		//driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys("standard_user");
		// Utilitis10.getHighLighter10(driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")))	;
		
		// Useer Pass WOrd 2
		//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		//Utilitis10.getHighLighter10(driver.findElement(By.xpath("//*[@id=\"password\"]")));
		
		// User Click on Submit Button
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//User  Successfully Logged in In page
		
		// User Click on The Sauce Labs Backpack
		//driver.findElement(By.xpath("(//*[@class=\"btn btn_primary btn_small btn_inventory\"])[1]")).click();
		
		// User Clickl on Shopping Cart 5\
		//driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
		
		// User click on Check Out 5
		//driver.findElement(By.name("checkout")).click();
		
		// user Put first name 6
		//driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Pappu");
		
		// user put Last Name 7 
		//driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Paul");
		
		// User Put Last Name 8
		//driver.findElement(By.xpath("//*[@placeholder='Zip/Postal Code']")).sendKeys("30144");
		
		//User Click on Continue 9
		//driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		// User go to Checkout/Revivew page and click Continue 10
		//driver.findElement(By.id("finish")).click();
		
		// User go to Manu bar 11
		//driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
		
		// Uset Click on Log out 12
		//driver.findElement(By.xpath("//*[@id='logout_sidebar_link']")).click();
		

	}
	public static void main(String[] args) {
		BaseClass10.Browserlaunch2();
		} }
