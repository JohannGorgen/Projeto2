package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.BasePage;
import Core.BaseTest;

public class FormPage extends BasePage{

	//Campos do formulário
	
	public WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), 10);
	
	@FindBy(css = "#email_create")
	public WebElement emailInput;
	
	@FindBy(css = "#SubmitCreate")
	public WebElement createAcc;
	
	@FindBy(css = "#id_gender1")
	public WebElement title1;
	
	@FindBy(css = "#id_gender2")
	public WebElement title2;
	
	@FindBy(css = "#customer_firstname")
	public WebElement customerFirstName;
	
	@FindBy(css = "#customer_lastname")
	public WebElement customerLastName;
	
	@FindBy(css = "#passwd")
	public WebElement password;
	
	@FindBy(css = "#days")
	public WebElement days;
		
	@FindBy(css = "#months")
	public WebElement months;
	
	@FindBy(css = "#years")
	public WebElement years;
		
	@FindBy(css = "#newsletter")
	public WebElement newsletter;
	
	@FindBy(css = "#optin")
	public WebElement offers;
	
	@FindBy(css = "#firstname")
	public WebElement firstName;
	
	@FindBy(css = "#lastname")
	public WebElement lastname;
	
	@FindBy(css = "#company")
	public WebElement company;
	
	@FindBy(css = "#address1")
	public WebElement address1;
	
	@FindBy(css = "#address2")
	public WebElement address2;
	
	@FindBy(css = "#city")
	public WebElement city;
	
	@FindBy(css = "#id_state")
	public WebElement id_state;
	
	@FindBy(css = "#postcode")
	public WebElement postcode;
	
	@FindBy(css = "#id_country")
	public WebElement id_country;
		
	@FindBy(css = "#other")
	public WebElement other;
	
	@FindBy(css = "#phone")
	public WebElement phone;
	
	@FindBy(css = "#phone_mobile")
	public WebElement phone_mobile;
	
	@FindBy(css = "#alias")
	public WebElement alias;
	
	@FindBy(css = "#submitAccount")
	public WebElement register;	
	
	public FormPage selectDay(String day){
		Select daysSelect = new Select(days);
		daysSelect.selectByValue(day);
		return this;
	}
	
	public FormPage selectMonth(String month){
		Select monthSelect = new Select(months);
		monthSelect.selectByValue(month);
		return this;
	}
	
	public FormPage selectYear(String year){
		Select yearSelect = new Select(years);
		yearSelect.selectByValue(year);
		return this;
	}
	
	public FormPage selectState(String state){
		Select stateSelect = new Select(id_state);
		stateSelect.selectByValue(state);
		return this;
	}		
	
	public FormPage selectCountry(String country){
		Select countrySelect = new Select(id_country);
		countrySelect.selectByValue(country);
		return this;
	}
	
	public FormPage(WebDriver driver) {
		super(driver);
	}	

}
