package Com.SauceDemo.Hooks;


import Com.SauceDemo.BaseClass.BaseClass10;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks1 extends BaseClass10 {
	
	@Before
	public static void initialize() {
		BaseClass10.Browserlaunch2();	
	}
	
	
	//tearDown will quit the browser after every scenario
	@After
	public static void tearDown() {
		driver.quit();
} 
	}
