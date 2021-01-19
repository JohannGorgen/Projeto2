package Page;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.BasePage;
import Core.BaseTest;

public class Page extends BasePage{

	//Classe onde os elementos s�o definidos	

	WebDriver driver;
	public WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), 10);
	
	//Busca e compra
	    
		@FindBy(css = "#search_query_top")
		public WebElement search;
		
		@FindBy(css = "button.btn.btn-default.button-search")
		public WebElement searchButton;
		
		@FindBy(css = "div.product-count")
		public WebElement result;	
		
		@FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default")
		public WebElement add;
		
		@FindBy(css = "a.product-name")
		public List<WebElement> item;
		
		@FindBy(css = "#fancybox-frame1610988001043")
		public WebElement viewFrame;
		
		@FindBy(css = "button.exclusive")
		public WebElement addBasket;
		
		@FindBy(css = "span.cross")
		public WebElement closeModal;

		@FindBy(css = "span.ajax_cart_quantity")
		public List<WebElement> cart;
		
		@FindBy(css = "i.icon-chevron-right.right")
		public List<WebElement> continueButton;
		
		@FindBy(css = "a.btn.btn-default.button.button-medium")
		public WebElement continueButton2;
		
		@FindBy(css = "span")
		public List<WebElement> continueButton3;
		
		@FindBy(css = "input.cart_quantity_input.form-control.grey")
		public WebElement productBasket;
		
		@FindBy(css = "p.product-name")
		public List<WebElement> productName;

		@FindBy(css = "#total_price")
		public WebElement price;
		
		@FindBy(css = "product")
		public List<WebElement> product;
		
		@FindBy(css = "button.btn.btn-default.standard-checkout.button-medium")
		public WebElement proceedCheckout;
		
		//Campos do formul�rio
		
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
		
		public Page selectDay(String day){
			Select daysSelect = new Select(days);
			daysSelect.selectByValue(day);
			return this;
		}
		
		@FindBy(css = "#months")
		public WebElement months;
		
		public Page selectMonth(String month){
			Select monthSelect = new Select(months);
			monthSelect.selectByValue(month);
			return this;
		}
		
		@FindBy(css = "#years")
		public WebElement years;
		
		public Page selectYear(String year){
			Select yearSelect = new Select(years);
			yearSelect.selectByValue(year);
			return this;
		}
		
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
		
		public Page selectState(String state){
			Select stateSelect = new Select(id_state);
			stateSelect.selectByValue(state);
			return this;
		}		
		
		@FindBy(css = "#postcode")
		public WebElement postcode;
		
		@FindBy(css = "#id_country")
		public WebElement id_country;
		
		public Page selectCountry(String country){
			Select countrySelect = new Select(id_country);
			countrySelect.selectByValue(country);
			return this;
		}
		
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
		
		//Confirma��o de endere�o
		
		@FindBy(css = "li.address_address1.address_address2")
		public List<WebElement> confirmAddress1;
		
		@FindBy(css = "li.address_city.address_state_name.address_postcode")
		public List<WebElement> confirmAddress2;
		
		@FindBy(css = "li.address_country_name")
		public List<WebElement> confirmAddress3;
		
		@FindBy(css = "button.button.btn.btn-default.button-medium")
		public WebElement proceed;	

		//Confirma��o de termos
		
		@FindBy(css = "#cgv")
		public WebElement terms;
		
		@FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")
		public WebElement proceed2;	
		
		//Confirma��o de valor e pagamento
		
		@FindBy(css = "#total_price")
		public WebElement totalPrice;
		
		@FindBy(css = "a.bankwire")
		public WebElement paymentMethod;
		
		@FindBy(css = "strong.dark")
		public List<WebElement> confirmation;		
		
		//Constructor
		   public Page(WebDriver driver){
		      super(driver);
		   }
		   
}
