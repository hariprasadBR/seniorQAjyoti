package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {
	HomePage homePage;

	@When("user is home page and validate home page title")
	public void user_is_home_page_and_validate_home_page_title() {
		homePage = new HomePage();
		Assert.assertEquals(homePage.getTitle(), "Cogmento CRM");
	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		Assert.assertEquals(homePage.getCurrentUrl().contains("cogmento"), true);
	}

	@When("user validate home page logo")
	public void user_validate_home_page_logo() {
		Assert.assertEquals(homePage.checkLogoStatus(), true);
	}
}
