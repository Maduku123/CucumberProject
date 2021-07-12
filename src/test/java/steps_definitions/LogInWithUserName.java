package steps_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.main;
import io.cucumber.java.en.When;

public class LogInWithUserName extends main {
	
	@When("the user provide valide username {string} and password {string}")
	public void the_user_provide_valide_username_and_password(String string, String string2) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}
	@When("the user provide invalide username {string} and correct password {string}")
	public void the_user_provide_invalide_username_and_correct_password(String string, String string2) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}
}
