package steps_definitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Base.main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationFunctionalityTest extends main {
	String expectedUrl ="http://demo.guru99.com/test/newtours/register.php";

	@Given("that the new user have the correct URL and is on the home page")
	public void that_the_new_user_have_the_correct_url_and_is_on_the_home_page() {
		driver.findElement(By.linkText("REGISTER")).click();
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
	    
	}

	@When("the new user click the registration link he or she should be able the fill in the required information")
	public void the_new_user_click_the_registration_link_he_or_she_should_be_able_the_fill_in_the_required_information() {
		
	    driver.findElement(By.name("firstName")).sendKeys("Derick");
	    driver.findElement(By.name("lastName")).sendKeys("Maduku");
	    driver.findElement(By.name("phone")).sendKeys("2142680619");
	    driver.findElement(By.name("userName")).sendKeys("pekiakaderick@gmail.com");
	    driver.findElement(By.name("address1")).sendKeys("205 frankline");
	    driver.findElement(By.name("city")).sendKeys("Dallas");
	    driver.findElement(By.name("state")).sendKeys("Texas");
	    driver.findElement(By.name("postalCode")).sendKeys("75228");
	    WebElement country =driver.findElement(By.name("country"));
	    Select select = new Select(country);
	    select.selectByVisibleText("INDIA");
	    driver.findElement(By.id("email")).sendKeys("DericM");
	    driver.findElement(By.name("password")).sendKeys("De12");
	    driver.findElement(By.name("confirmPassword")).sendKeys("De12");
	    
	}

	@And("should clik on submit button after providing all required information")
	public void should_clik_on_submit_button_after_providing_all_required_information() {
		driver.findElement(By.name("submit")).click();
	    
	}

	@Then("new user should be about to register")
	public void new_user_should_be_about_to_register() {
		WebElement register=driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]"));
		Assert.assertTrue(register.isDisplayed());
		
	    
	}
	

}
