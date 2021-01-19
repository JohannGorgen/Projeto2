package Steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Core.BaseTest;
import Page.Page;
import io.qameta.allure.Step;

public class Steps {
//Classe de defini��o dos steps
	
	private WebDriver driver;
	Page page = new Page(driver);
	Actions action = new Actions(BaseTest.getDriver());
	
		
	@Step("Dado que eu pesquise um item no campo e busca.")
	public Steps searchItem(String text) throws InterruptedException{
		String a = page.search.toString();
		System.out.println("AQUI OH >>>  "+ a);
		page.wait.until(ExpectedConditions.elementToBeClickable(page.search));
		page.search.clear();
		page.search.sendKeys(text);
		page.searchButton.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.result));
		return this;
	}
	
	@Step("E verifique a quantidade de registros da pesqusa.")
	public Steps verifyItem(){
		page.result.getText();
		System.out.println("Resultado pesquisa >>>>> " + page.result.getText());
		Assert.assertEquals("Showing 1 - 1 of 1 item", page.result.getText());
		return this;
	}
	
	@Step("E seleciono o item desejado.")
	public Steps selectItem(){
		page.item.get(8).click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.addBasket));
		return this;
	}
	
	@Step("Quando adiciono o item no carrinho.")
	public Steps addToBasket(){
		page.addBasket.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.continueButton2));
		action.moveToElement(page.continueButton2).build();
		page.continueButton2.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.productName.get(1)));
		return this;
	}
	
	@Step("Ent�o o mesmo deve estar no carrinho.")
	public Steps verifyBasket(){
		System.out.println("Nome do Produto >>>>> " + page.productName.get(1).getText());
		Assert.assertEquals("Blouse", page.productName.get(1).getText());
		System.out.println("Pre�o Total >>>>> " + page.price.getText());
		Assert.assertEquals("$29.00", page.price.getText());
		return this;
	}	
	
	@Step("E sigo para o cadastro.")
	public Steps register(String mail){
		page.proceed2.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.emailInput));
		page.emailInput.sendKeys(mail);
		page.createAcc.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.customerFirstName));
		return this;
	}
	
	@Step("E preencho o formulario.")
	public Steps fillForm(String customerFirstname, String customerLastName, String password, String day, String month, String year, String company, String address1, String address2, String city, String state, String postcode, String country, String phone){
		page.title1.click();
		page.customerFirstName.sendKeys(customerFirstname);
		page.customerLastName.sendKeys(customerLastName);
		page.password.sendKeys(password);
		page.selectDay(day);
		page.selectMonth(month);
		page.selectYear(year);
		page.company.sendKeys(company);
		page.address1.sendKeys(address1);
		page.address2.sendKeys(address2);
		page.city.sendKeys(city);
		page.selectState(state);
		page.postcode.sendKeys(postcode);
		page.selectCountry(country);
		page.phone_mobile.sendKeys(phone);
		page.register.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.proceed));
		return this;
	}
	
	@Step("E valido o endere�o.")
	public Steps verifyAddress(){
		System.out.println("Endere�o 1 >>>>> " + page.confirmAddress1.get(0).getText());
		Assert.assertEquals("Rua das Palmeiras, numero 100 Bairro das Arvores", page.confirmAddress1.get(0).getText());
		System.out.println("Endere�o 2 >>>>> " + page.confirmAddress2.get(0).getText());
		Assert.assertEquals("Tokio, Alaska 00000", page.confirmAddress2.get(0).getText());
		System.out.println("Endere�o 3 >>>>> " + page.confirmAddress3.get(0).getText());
		Assert.assertEquals("United States", page.confirmAddress3.get(0).getText());
		page.proceed.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.proceed2));
		return this;
	}
	
	@Step("E aceitos os termos e valido o valor da compra.")
	public Steps verifyPriceAndAceptTerms(){
		page.terms.click();
		page.proceed2.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.paymentMethod));
		System.out.println("Pre�o Total >>>>> " + page.totalPrice.getText());
		Assert.assertEquals("$29.00", page.totalPrice.getText());
		return this;
	}
	
	@Step("Ent�o termino a compra.")
	public Steps finish(){
		page.paymentMethod.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.proceed));
		page.proceed.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.confirmation.get(5)));
		System.out.println("Texto final >>>>> " + page.confirmation.get(5).getText());
		Assert.assertEquals("Your order on My Store is complete.", page.confirmation.get(5).getText());
		return this;
	}

}
