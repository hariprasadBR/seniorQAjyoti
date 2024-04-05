package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import io.cucumber.java.hu.De;

public class CasePage extends BaseClass {

	@FindBy(xpath = "//a[@href='/cases']")
	private WebElement caselink;

	@FindBy(xpath = "//a[@href='/cases/new']")
	private WebElement createButton;

	@FindBy(name = "title")
	private WebElement title;

	@FindBy(name = "description")
	private WebElement description;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement SaveButton;

	@FindBy(xpath = "//button[@class='ui button icon']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement CdeleteButton;


	public CasePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public String clickOnCaseLink() {
		caselink.click();
		return getDriver().getCurrentUrl();
	}

	public void clickOnCreateButton() {
		createButton.click();
	}

	public void createNewCase(String Title, String Desc) {
		title.sendKeys(Title);
		description.sendKeys(Desc);
	}

	public void clickOnSaveButton() {
		SaveButton.click();
	}

	public void clickOnDelete() {
		deleteButton.click();
		
		CdeleteButton.click();
	}
	

}
