package org.google.DemoCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Demo1 {
static WebDriver driver;
@Given("^The user is in guru page$")
public  void the_user_is_in_guru_page() {
    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.chrome.driver","F:\\GreensTechnology\\Selenium\\DemoCucumber\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/v1/index.php");

}

@When("^The user enters valid username and password$")
public void the_user_enters_valid_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("uid")).sendKeys("mngr162583");
    driver.findElement(By.name("password")).sendKeys("mEjaqer");
}

@When("^The user clicks the submit button$")
public void the_user_clicks_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("btnLogin")).click();
}

@Then("^The user should be in managers home page$")
public void the_user_should_be_in_managers_home_page() {
	Assert.assertTrue(driver.getCurrentUrl().contains("Managerhomepage"));
}


}
