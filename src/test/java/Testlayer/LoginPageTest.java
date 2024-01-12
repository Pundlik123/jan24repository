package Testlayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagelayer.LoginPage;
import seleniumupsBaselayer.BaseClass;

public class LoginPageTest extends BaseClass{
	@BeforeTest
	public void SetUp() {
		BaseClass.initialization();
		
	}
	
	@Test
	public void validateregPageFunctionality() {
		
		
		LoginPage loginPage = new LoginPage();
		loginPage.regPageFuncationality("Nikhil", "Patil","980000000", "nikhil@gmail.com", "Pune", "Pune", "Maharashtra", "112211", "INDIA", "Nikhil.abc", "Pass@123", "Pass@123");
	
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
		
	}
	

}
