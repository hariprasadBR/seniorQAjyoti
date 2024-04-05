package Steps;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.CasePage;
import io.cucumber.java.en.When;

public class CasePageStep extends BaseClass {
	CasePage casePage;

	@When("user is on case page and validate case page title")
	public void user_is_on_case_page_and_validate_case_page_title() {
		casePage = new CasePage();
		Assert.assertEquals(casePage.clickOnCaseLink().contains("cases"), true);
	}

	@When("user click on create button case page")
	public void user_click_on_create_button_case_page() {
		casePage.clickOnCreateButton();
	}

	@When("user enter {string} and {string} in casepage")
	public void user_enter_and_in_casepage(String title, String desc) {
		casePage.createNewCase(title, desc);

	}

	@When("user click on save button on case page")
	public void user_click_on_save_button_on_case_page() {
		casePage.clickOnSaveButton();
	}

	@When("user delete the create cases in case page")
	public void user_delete_the_create_cases_in_case_page() throws InterruptedException {
		casePage.clickOnDelete();
	}

}
