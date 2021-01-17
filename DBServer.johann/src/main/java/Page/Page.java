package Page;
import java.awt.Button;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page {

	//Classe onde os passos e elementos s�o definidos

	private WebDriver driver;		

	//Busca e compra
	    
		@FindBy(css = "#search_query_top")
		public WebElement search;
		//String search = "#search_query_top";	
		
		@FindBy(css = "#btnHeaderSearch")
		public Button searchButton;
		//String searchButton = "#btnHeaderSearch";
		
		@FindBy(css = "div.product-count")
		public input result;	
		//String result = "div.product-count";
		
		@FindBy(css = "img.replace-2x.img-responsive")
		public Button item;
		//List <String> item = "img.replace-2x.img-responsive";
		
		@FindBy(css = "button.exclusive")
		public Button addBasket;
		//String addBasket = "button.exclusive";
		
		@FindBy(css = "a.btn.btn-default.button.button-medium")
		public Button continueButton;
		//String confirmButton = "a.btn.btn-default.button.button-medium";
		//String continueButton = "a.btn.btn-default.button.button-medium";
		
		@FindBy(css = "input.cart_quantity_input.form-control.grey")
		public input productBasket;
		//String productBasket = "input.cart_quantity_input.form-control.grey";
		
		@FindBy(css = "product")
		public List<input> product;
		//List <String> productName = "p.product-name";
		
		@FindBy(css = "button.btn.btn-default.standard-checkout.button-medium")
		public Button proceedCheckout;
		//String proceedCheckout = "button.btn.btn-default.standard-checkout.button-medium";
		
		//Campos do formul�rio
		
		@FindBy(css = "#email_create")
		public input emailInput;
		
		@FindBy(css = "#SubmitCreate")
		public Button createAcc;
		
		@FindBy(css = "#id_gender1")
		public input title;
		
		@FindBy(css = "#customer_firstname")
		public input customerFirstName;
		
		@FindBy(css = "#customer_lastname")
		public input customerLastName;
		
		@FindBy(css = "#passwd")
		public input password;
		
		@FindBy(css = "#days")
		public select days;
		
		@FindBy(css = "#months")
		public select months;
		
		@FindBy(css = "#years")
		public select years;
		
		@FindBy(css = "#newsletter")
		public input newsletter;
		
		@FindBy(css = "#optin")
		public input offers;
		
		@FindBy(css = "#firstname")
		public input firstName;
		
		@FindBy(css = "#lastname")
		public input lastname;
		
		@FindBy(css = "#company")
		public input company;
		
		@FindBy(css = "#address1")
		public input address1;
		
		@FindBy(css = "#address2")
		public input address2;
		
		@FindBy(css = "#city")
		public input city;
		
		@FindBy(css = "#id_state")
		public select id_state;
		
		@FindBy(css = "#postcode")
		public input postcode;
		
		@FindBy(css = "#id_country")
		public Select id_country;
		
		@FindBy(css = "#other")
		public input other;
		
		@FindBy(css = "#phone")
		public input phone;
		
		@FindBy(css = "#phone_mobile")
		public input phone_mobile;
		
		@FindBy(css = "#alias")
		public input alias;
		
		@FindBy(css = "#submitAccount")
		public Button register;	
		
		//Confirma��o de endere�o
		
		@FindBy(css = "li.address_address1.address_address2")
		public List<input> confirmAddress1;
		
		@FindBy(css = "li.address_city.address_state_name.address_postcode")
		public List<input> confirmAddress2;
		
		@FindBy(css = "li.address_country_name")
		public List<input> confirmAddress3;
		
		@FindBy(css = "button.button.btn.btn-default.button-medium")
		public Button proceed;	

		//Confirma��o de termos
		
		@FindBy(css = "#cgv")
		public Button terms;
		
		@FindBy(css = "button.button.btn.btn-default.standard-checkout.button-medium")
		public Button proceed2;	
		
		//Confirma��o de valor e pagamento
		
		@FindBy(css = "#total_price")
		public input totalPrice;
		
		@FindBy(css = "a.bankwire")
		public Button paymentMethod;
		
		@FindBy(css = "strong.dark")
		public List<input> confirmation;		
		
		//Constructor
		   public Page(WebDriver driver){
		       this.driver=driver;
		       PageFactory.initElements(driver, this);
		   }
		   
}