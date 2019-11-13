package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case {
	WebDriver driver;
	@Given("user open browser and launches testme application")
	public void user_open_browser_and_launches_testme_application() {
		System.setProperty("webdriver.gecko.driver","C:\\NexGen Testing Stream\\Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8083/TestMeApp");
	}

	@When("user clicks signup link")
	public void user_clicks_signup_link() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),' SignUp')]"))).click().perform();
	}

	@When("user enters user name as {string} in  field")
	public void user_enters_user_name_as_in_field(String username) {
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	@When("user enters first name as {string} in  field")
	public void user_enters_first_name_as_in_field(String firstname) {
		driver.findElement(By.name("firstName")).sendKeys(firstname);
	}

	@When("user enters last name as {string} in  field")
	public void user_enters_last_name_as_in_field(String lastname) {
		driver.findElement(By.name("lastName")).sendKeys(lastname);
	}

	@When("user enters password {string} in  field")
	public void user_enters_password_in_field(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("user enters conform password {string} in  field")
	public void user_enters_conform_password_in_field(String confirmPassword) {
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
	}

	@When("user enter gender")
	public void user_enter_gender() {
		driver.findElement(By.xpath("//input[contains(@value,'Male')]")).click();
	}

	@When("user enters email address {string} in  field")
	public void user_enters_email_address_in_field(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@When("user enters mobile number {string} in  field")
	public void user_enters_mobile_number_in_field(String mobnumber) {
		driver.findElement(By.name("mobileNumber")).sendKeys(mobnumber);
	}

	@When("user enters dob {string} in  field")
	public void user_enters_dob_in_field(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@When("user enters address {string} in  field")
	public void user_enters_address_in_field(String address) {
		driver.findElement(By.name("address")).sendKeys(address);
	}

	@When("user select security question")
	public void user_select_security_question() {
		Select quest=new Select(driver.findElement(By.id("securityQuestion")));
	    quest.selectByIndex(1);
	}

	@When("user enters answer {string} in  field")
	public void user_enters_answer_in_field(String answer) {
		driver.findElement(By.name("answer")).sendKeys(answer);
	}

	@Then("user clicks regestration")
	public void user_clicks_regestration() {
		driver.findElement(By.name("Submit")).click();
	}
}
