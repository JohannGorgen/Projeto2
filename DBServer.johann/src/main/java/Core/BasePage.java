package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	
	static WebDriver driver;
	static WebElement element;
	
	public BasePage(WebDriver driver){
		PageFactory.initElements(BaseTest.getDriver(),this);
	}

}
