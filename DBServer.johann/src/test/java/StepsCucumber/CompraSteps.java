package StepsCucumber;

import java.io.IOException;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Core.BaseTest;
import Page.FormPage;
import Page.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompraSteps {
	//Classe de defini��o dos steps do cucumber
	
	private WebDriver driver;
	Page page = new Page(driver);
	FormPage form = new FormPage(driver);
	Actions action = new Actions(BaseTest.getDriver());
	
	@Given("^que eu pesquise um (.*) no campo e busca$")
	public void que_eu_pesquise_um_item_no_campo_e_busca(String item) {
		BaseTest.getDriver().navigate().to("http://automationpractice.com/");
		page.wait.until(ExpectedConditions.elementToBeClickable(page.search));
		page.search.clear();
		page.search.sendKeys(item);
		page.searchButton.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.result));
	}

	@And("verifique a quantidade de registros da pesqusa")
	public void verifique_a_quantidade_de_registros_da_pesqusa() {
		page.result.getText();
		System.out.println("Resultado pesquisa >>>>> " + page.result.getText());
		Assert.assertEquals("Showing 1 - 1 of 1 item", page.result.getText());
	}

	@And("seleciono o item desejado")
	public void seleciono_o_item_desejado() {
		page.item.get(8).click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.addBasket));
	}

	@When("adiciono o item no carrinho")
	public void adiciono_o_item_no_carrinho() {
		page.addBasket.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.continueButton2));
		action.moveToElement(page.continueButton2).build();
		page.continueButton2.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.productName.get(1)));
	}

	@Then("o mesmo deve estar no carrinho")
	public void o_mesmo_deve_estar_no_carrinho() {
		System.out.println("Nome do Produto >>>>> " + page.productName.get(1).getText());
		Assert.assertEquals("Blouse", page.productName.get(1).getText());
		System.out.println("Pre�o Total >>>>> " + page.price.getText());
		Assert.assertEquals("$29.00", page.price.getText());
	}

	@And("sigo para o cadastro")
	public void sigo_para_o_cadastro() {
		Date date = new Date();
		String date1= BaseTest.dateFormat.format(date);
		System.out.println("DATA AQUI >>>> " + date1);
		
		page.proceed2.click();
		form.wait.until(ExpectedConditions.elementToBeClickable(form.emailInput));
		form.emailInput.sendKeys("joaodasilva"+date1+"@teste.com.br");
		form.createAcc.click();
		form.wait.until(ExpectedConditions.elementToBeClickable(form.customerFirstName));
	}

	@And("preencho o formulario")
	public void preencho_o_formulario() {
		form.title1.click();
		form.customerFirstName.sendKeys("joao");
		form.customerLastName.sendKeys("da silva");
		form.password.sendKeys("12345");
		form.selectDay("15");
		form.selectMonth("5");
		form.selectYear("2000");
		form.company.sendKeys("DBServer");
		form.address1.sendKeys("Rua das Palmeiras, numero 100");
		form.address2.sendKeys("Bairro das Arvores");
		form.city.sendKeys("Tokio");
		form.selectState("2");
		form.postcode.sendKeys("00000");
		form.selectCountry("21");
		form.phone_mobile.sendKeys("8989898989");
		form.register.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.proceed));
	}

	@And("valido o endereco")
	public void valido_o_endere_o() {
		System.out.println("Endere�o 1 >>>>> " + page.confirmAddress1.get(0).getText());
		Assert.assertEquals("Rua das Palmeiras, numero 100 Bairro das Arvores", page.confirmAddress1.get(0).getText());
		System.out.println("Endere�o 2 >>>>> " + page.confirmAddress2.get(0).getText());
		Assert.assertEquals("Tokio, Alaska 00000", page.confirmAddress2.get(0).getText());
		System.out.println("Endere�o 3 >>>>> " + page.confirmAddress3.get(0).getText());
		Assert.assertEquals("United States", page.confirmAddress3.get(0).getText());
		page.proceed.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.proceed2));
	}

	@And("aceitos os termos e valido o valor da compra")
	public void aceitos_os_termos_e_valido_o_valor_da_compra() {
		page.terms.click();
		page.proceed2.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.paymentMethod));
		System.out.println("Pre�o Total >>>>> " + page.totalPrice.getText());
		Assert.assertEquals("$29.00", page.totalPrice.getText());;
	}

	@Then("termino a compra")
	public void termino_a_compra() throws IOException, InterruptedException {
		page.paymentMethod.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.proceed));
		page.proceed.click();
		page.wait.until(ExpectedConditions.elementToBeClickable(page.confirmation.get(5)));
		System.out.println("Texto final >>>>> " + page.confirmation.get(5).getText());
		Assert.assertEquals("Your order on My Store is complete.", page.confirmation.get(5).getText());
		BaseTest.killDriver();
	}

}