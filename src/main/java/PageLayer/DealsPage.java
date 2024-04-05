package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class DealsPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/deals']")
	private WebElement dealslink;

	@FindBy(xpath = "//a[@href='/deals/new']")
	private WebElement createButton;

	@FindBy(name = "title")
	private WebElement title;

	@FindBy(name = "description")
	private WebElement description;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//button[@class='ui button icon']")
	private WebElement delete;

	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement confirmdelete;

	public DealsPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void clickOnDealsLink() {
		dealslink.click();
	}

	public void clickOnCreateButton() {
		createButton.click();
	}

	public void createDeals(String Title, String desc) {
		title.sendKeys(Title);
		description.sendKeys(desc);
	}

	public void clickonSaveButton() {
		saveButton.click();
	}

	public void deleteDeals() {
		delete.click();
		confirmdelete.click();
	}

}
