package steps_definitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInFunctionalityTest extends main {
	String expectedUrl ="http://demo.guru99.com/test/newtours/index.php";
	
@Given("that a register user have the correct URL and is in home page,")
public void that_a_register_user_have_the_correct_url_and_is_in_home_page() {
	Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
	
   
}
//positive login test
@When("the user provide valide username and password")
public void the_user_provide_valide_username_and_password() {
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("test123");
	driver.findElement(By.name("password")).sendKeys("123");
   
}

@And("click on the submit button")
public void click_on_the_submit_button() {
	driver.findElement(By.name("submit")).click();
   
}
@Then("the user shold be able to login and see welcome message.")
public void the_user_shold_be_able_to_login_and_see_welcome_message() {
	String expectedResult ="Login Successfully";
	String actualResult =driver.findElement(By.xpath("//tbody//tr//td//h3")).getText();
	System.out.println(actualResult);
	Assert.assertEquals(actualResult, expectedResult);
	
}
//Negative login test
@When("the user provide invalide username and correct password")
public void the_user_provide_invalide_username_and_correct_password() {
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("test000");
	driver.findElement(By.name("password")).sendKeys("123");
}

@Then("the user shold not be able to login and will recieved an error message.")
public void the_user_shold_not_be_able_to_login_and_will_recieved_an_error_message() {
	String expectedResult ="Enter your userName and password correct";
	String actualResult=driver.findElement(By.xpath("//span[contains(text(),'Enter your userName and password correct')]")).getText();
	System.out.println(actualResult);
	Assert.assertEquals(actualResult,expectedResult);
	
   
}

@When("the user provide valide username and incorrect password")
public void the_user_provide_valide_username_and_incorrect_password() {
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("test123");
	driver.findElement(By.name("password")).sendKeys("000");
}

@And("click on  submit button")
public void click_on_submit_button() {
	driver.findElement(By.name("submit")).click();
}

@Then("the user shold not be able to login and will recieved a login error email.")
public void the_user_shold_not_be_able_to_login_and_will_recieved_a_login_error_email() {
	WebElement errorMge=driver.findElement(By.xpath("//span[contains(text(),'Enter your userName and password correct')]"));
	Assert.assertTrue(errorMge.isDisplayed());
	
}

}
