package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(name = "email")
	private WebElement uname;

	@FindBy(name = "password")
	private WebElement Pass;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement lgnBtn;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void loginFunctionality(String Uname, String pass) {
		uname.sendKeys(Uname);
		Pass.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		lgnBtn.click();
	}

}
