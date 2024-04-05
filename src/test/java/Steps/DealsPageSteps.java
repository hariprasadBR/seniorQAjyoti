package Steps;

import BaseLayer.BaseClass;
import PageLayer.DealsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsPageSteps extends BaseClass {
	DealsPage deals;

	@Given("user is on home page and user click on deals page")
	public void user_is_on_home_page_and_user_click_on_deals_page() {
		deals = new DealsPage();
		deals.clickOnDealsLink();
	}

	@When("user click on create button")
	public void user_click_on_create_button() {
		deals.clickOnCreateButton();
	}

	@When("user enter title and enter description")
	public void user_enter_title_and_enter_description() {
		deals.createDeals("testing", "Ui automation testing");
	}

	@When("click on save button")
	public void click_on_save_button() {
		deals.clickonSaveButton();
	}

	@Then("user delete the created deals")
	public void user_delete_the_created_deals() throws InterruptedException {
		deals.deleteDeals();
		
		Thread.sleep(10000);
		getDriver().quit();
		
	}

}
