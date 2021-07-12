package steps_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.main;
import io.cucumber.java.en.When;

public class RegistrationWithData extends main {
	 @When("^the new user click the registration link and provide (.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+).$")
	    public void the_new_user_click_the_registration_link_and_provide_(String firstname, String lastname,
	    		String phone, String email, String address, String username, String password, String confirmepassword) {
		 driver.findElement(By.name("firstName")).sendKeys(firstname);
		    driver.findElement(By.name("lastName")).sendKeys(lastname);
		    driver.findElement(By.name("phone")).sendKeys(phone);
		    driver.findElement(By.name("userName")).sendKeys(email);
		    driver.findElement(By.name("address1")).sendKeys(address);
		    driver.findElement(By.name("city")).sendKeys("Dallas");
		    driver.findElement(By.name("state")).sendKeys("Texas");
		    driver.findElement(By.name("postalCode")).sendKeys("75228");
		    WebElement country =driver.findElement(By.name("country"));
		    Select select = new Select(country);
		    select.selectByVisibleText("INDIA");
		    driver.findElement(By.id("email")).sendKeys(username);
		    driver.findElement(By.name("password")).sendKeys(password);
		    driver.findElement(By.name("confirmPassword")).sendKeys(confirmepassword);
		    
	    }

}
