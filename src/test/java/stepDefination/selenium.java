package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class selenium {
	WebDriver driver;
		@Given("User is on the home page of selenium")
		public void user_is_on_the_home_page_of_selenium() {
			driver.get("https://www.selenium.dev/");
		}


		@When("user clicks on downlode link")
		public void user_clicks_on_downlode_link() {
			  driver.findElement(By.linkText("Downloads")).click();
		}
		@Then("title should be {string}")
		public void title_should_be(String string) {
			 Assert.assertEquals(string, driver.getTitle());
		}



}
