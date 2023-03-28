package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	@Given("User have to maximize the screen")
	public void user_have_to_maximize_the_screen() {
		maxWindow();
	}

	// @When("User have to enter valid email and invalid password")
	// public void user_have_to_enter_valid_email_and_invalid_password() {
	// WebElement txtEmail = driver.findElement(By.id("email"));
	// fillTextBox(txtEmail, "Amirtha");
	// WebElement txtPwd = driver.findElement(By.id("pass"));
	// fillTextBox(txtPwd, "1234567");
	// }

	@When("User have to enter invalid mobile number")
	public void user_have_to_enter_invalid_mobile_number(DataTable d) {

		List<String> allVal = d.asList();
		String val = allVal.get(2);

		WebElement txtBox = driver.findElement(By.xpath("//*[@id='identify$email']"));
		fillTextBox(txtBox, val);
	}

	@When("User have to enter valid email and invalid password")
	public void userHaveToEntervalidEmailAndInvalidPassword(io.cucumber.datatable.DataTable d) {

		List<List<String>> allLst = d.asLists();
		String v1 = allLst.get(1).get(10);
		String v2 = allLst.get(3).get(1);

		WebElement txtEmail = driver.findElement(By.id("email"));
		fillTextBox(txtEmail, v1);
		WebElement txtPwd = driver.findElement(By.id("pass"));
		fillTextBox(txtPwd, v2);
	}

	@When("User have to enter invalid email and invalid password")
	public void user_have_to_enter_invalid_email_and_invalid_password(DataTable d) {

		Map<String, String> maps = d.asMap(String.class, String.class);
		String v1 = maps.get("Phno");
		String v2 = maps.get("password");

		WebElement txtEmail = driver.findElement(By.id("email"));
		fillTextBox(txtEmail, v1);
		WebElement txtPwd = driver.findElement(By.id("pass"));
		fillTextBox(txtPwd, v2);
	}

	@When("User have to enter invalid email and valid password")
	public void user_have_to_enter_invalid_email_and_valid_password(DataTable d) {

		List<Map<String, String>> allMaps = d.asMaps();

		Map<String, String> maps = allMaps.get(2);
		String v1 = maps.get("phoneno");

		String v2 = allMaps.get(1).get("username");

		WebElement txtEmail = driver.findElement(By.id("email"));
		fillTextBox(txtEmail, v1);
		WebElement txtPwd = driver.findElement(By.id("pass"));
		fillTextBox(txtPwd, v2);
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		WebElement btnLogin = driver.findElement(By.name("login"));
		toClickButton(btnLogin);
		holdExecution(5000);
	}

	@Then("User have to be in password incorrect page")
	public void user_have_to_be_in_password_incorrect_page() {
		String url = fetchCurrentUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("User is in password incorrect page");
		}
	}

	@Given("User have to enter Fb Login Page")
	public void user_have_to_enter_Fb_Login_Page() {

		launchUrl("https://www.facebook.com/");

	}

	@Given("User have to click forgotten password button")
	public void user_have_to_click_forgotten_password_button() {

		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	}

	@When("User have to click search button")
	public void user_have_to_click_search_button() {

		WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@id,'submit')]"));
		toClickButton(searchBtn);
	}

	@Then("User have to be in error page")
	public void user_have_to_be_in_error_page() {

		System.out.println("User will be in error page");
	}
}
