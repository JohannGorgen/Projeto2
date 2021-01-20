package Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.BasePage;
import Core.BaseTest;

public class Page extends BasePage {

	public WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), 10);

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

	@FindBy(css = "li.address_address1.address_address2")
	public List<WebElement> confirmAddress1;

	@FindBy(css = "li.address_city.address_state_name.address_postcode")
	public List<WebElement> confirmAddress2;

	@FindBy(css = "li.address_country_name")
	public List<WebElement> confirmAddress3;

	@FindBy(css = "button.button.btn.btn-default.button-medium")
	public WebElement proceed;

	@FindBy(css = "#cgv")
	public WebElement terms;

	@FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")
	public WebElement proceed2;

	@FindBy(css = "#total_price")
	public WebElement totalPrice;

	@FindBy(css = "a.bankwire")
	public WebElement paymentMethod;

	@FindBy(css = "strong.dark")
	public List<WebElement> confirmation;

	public Page(WebDriver driver) {
		super(driver);
	}

}
