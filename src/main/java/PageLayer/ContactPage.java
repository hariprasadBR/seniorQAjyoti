package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ContactPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactlink;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createButton;

	@FindBy(name = "first_name")
	private WebElement fname;

	@FindBy(name = "middle_name")
	private WebElement mname;

	@FindBy(name = "last_name")
	private WebElement lname;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//button[@class='ui button icon']")
	private WebElement delete;

	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement confirmdelete;

	public ContactPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void clickOnContactLink() {
		contactlink.click();
	}

	public void clickOnCreateButton() {
		createButton.click();
	}

	public void createCustomer(String Fname, String LName, String Mname) {
		fname.sendKeys(Fname);
		lname.sendKeys(LName);
		mname.sendKeys(Mname);
	}

	public void clickonSaveButton() {
		saveButton.click();
	}

	public void deleteCustomer() {
		delete.click();
		confirmdelete.click();
	}

}
