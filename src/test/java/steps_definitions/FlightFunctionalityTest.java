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

public class FlightFunctionalityTest extends main {
	 
	@Given("a register user click on flight link,")
	public void a_register_user_click_on_flight_link() {
		
		driver.findElement(By.linkText("Flights")).click();
	}

	@When("the user select trip type,number of passenger,date, service class,")
	public void the_user_select_trip_type_number_of_passenger_date_service_class() {
		driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
		WebElement NumberPassengers =driver.findElement(By.name("passCount"));
		    NumberPassengers.click();
		    Select number = new Select(NumberPassengers);
		    number.selectByValue("3");
		WebElement DepartureCity=driver.findElement(By.name("fromPort"));
		    DepartureCity.click();
		    Select city = new Select(DepartureCity);
		   city.selectByIndex(7); 
		WebElement DepartureMonth = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/select[1]"));
		     DepartureMonth.click();
		     Select arrivingmonth = new Select(DepartureMonth);
		     arrivingmonth.selectByVisibleText("May");
		WebElement ArriverCity =driver.findElement(By.name("toPort"));
		     ArriverCity.click();
		     Select arrivecity= new Select(ArriverCity);
		     arrivecity.selectByIndex(5);
		WebElement Returningmonth =driver.findElement(By.name("toMonth"));
		     Returningmonth.click();
		     Select Returning = new Select(Returningmonth);
		     Returning.selectByIndex(7);
		driver.findElement(By.xpath("//input[@value='First']")).click();
		WebElement Airline = driver.findElement(By.xpath("//select[@name='airline']"));
		Airline.click();
		Select choiceAirline = new Select(Airline);
		choiceAirline.selectByIndex(2);
		
		
	   
	}
	@And("click on continue button,")
	public void click_on_continue_button() {
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
	}

	@Then("will recieved a message saying no seat Avaialble")
	public void will_recieved_a_message_saying_no_seat_avaialble() {
		WebElement noSeatAvaialable=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/a[1]/img[1]"));
		System.out.println(noSeatAvaialable);
		Assert.assertTrue(noSeatAvaialable.isDisplayed());
		
	}

}
