package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static ThreadLocal<WebDriver> tl = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return tl.get();
	}

	public void initialization(String browsername) {

		if (browsername.equalsIgnoreCase("edge")) {
			tl.set(new EdgeDriver());
		} 
		else if (browsername.equalsIgnoreCase("chrome")) 
		{
			tl.set(new ChromeDriver());
		} 
		else if (browsername.equalsIgnoreCase("incognito")) 
		{
			ChromeOptions opt =new ChromeOptions();
			opt.addArguments("--incognito");
			tl.set(new ChromeDriver(opt));
		}
		else
		{
			System.err.println("Please Enter Correct Browser Name");
		}

		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().manage().deleteAllCookies();
		getDriver().get("https://ui.cogmento.com/");
	}

}
