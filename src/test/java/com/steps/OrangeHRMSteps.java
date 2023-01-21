package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.OrangeHRMpagefac;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMSteps {

	WebDriver driver;
	OrangeHRMpagefac pf;
//	List<Integer> prices = new ArrayList<Integer>();
	    //OrangeHRMpagefac  class obj
	@Given("^User go to OrangeHRM demo home page$")
	public void user_go_to_OrangeHRM_demo_home_page() throws Throwable {
		 driver =new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    pf=new OrangeHRMpagefac (driver);  
	   
	}

	@When("^User type the username in the username field$")
	public void user_type_the_username_in_the_username_field() throws Throwable {
		//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		 Thread.sleep(3000);
		  pf.getUsername().sendKeys("Admin");     
	   
	}

	@When("^User type the password in the password field$")
	public void user_type_the_password_in_the_password_field() throws Throwable {
		//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
				Thread.sleep(3000);
				pf.getPassword().sendKeys("admin123");  
	   
	}

	@Then("^User clicks on the Login button$")
	public void user_click_on_the_Login_button() throws Throwable {
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
				pf.getLogin().click();   
	   
	}	
	
		
	


}
