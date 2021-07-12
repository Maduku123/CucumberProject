package steps_definitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base.main;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CruiseFunctionTest extends main {
	@When("the user clink on the cruise link and provide valide username and password")
	public void the_user_clink_on_the_cruise_link_and_provide_valide_username_and_password() {
		driver.findElement(By.linkText("Cruises")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
	    
	}	
	@Then("the user shold be able to book for cruise and see welcome message.")
	public void the_user_shold_be_able_to_book_for_cruise_and_see_welcome_message() {
		String expectedResult ="Login Successfully";
		String actualResult =driver.findElement(By.xpath("//tbody//tr//td//h3")).getText();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, expectedResult);
		
	}
}
