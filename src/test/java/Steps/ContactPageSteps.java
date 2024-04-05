package Steps;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageSteps extends BaseClass {

	ContactPage contact;

	@Given("user is on home page then user click on contact page link")
	public void user_is_on_home_page_then_user_click_on_contact_page_link() {
		contact = new ContactPage();
		contact.clickOnContactLink();
	}

	@When("click on create button")
	public void click_on_create_button() {
		contact.clickOnCreateButton();
	}

	@When("enter the first name and middle name and lastname")
	public void enter_the_first_name_and_middle_name_and_lastname(DataTable dataTable) {
		List<List<String>> ls = dataTable.asLists();
		String fname = ls.get(0).get(0);
		String mname = ls.get(0).get(1);
		String lname = ls.get(0).get(2);
		contact.createCustomer(fname, mname, lname);
	}

	@When("user click on save button")
	public void user_click_on_save_button() {
		contact.clickonSaveButton();
	}

	@Then("user delete the user")
	public void user_delete_the_user() throws InterruptedException {
		contact.deleteCustomer();

		Thread.sleep(10000);
		getDriver().quit();
	}

}
