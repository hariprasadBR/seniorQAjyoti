package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass {
	LoginPage login;

	@Given("user is on login page on {string} browser")
	public void user_is_on_login_page_on_browser(String browsername) {
		initialization(browsername);
	}

	@When("user enter valid username as {string} and password as {string}")
	public void user_enter_valid_username_as_and_password_as(String uname, String pass) {
		login = new LoginPage();
		login.loginFunctionality(uname, pass);
	}

	@Then("click on login button")
	public void click_on_login_button() {
		login.clickOnLoginButton();
	}

	@AfterStep
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
	}
}
