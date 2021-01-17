package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.DriverFactory;
import Page.Page;
import io.qameta.allure.Step;

public class Steps {

	private WebDriver driver;
	Page page = new Page(driver);
	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
	
	@Step("Dado que eu pesquise um item no campo e busca.")
	public void searchItem(String text) throws InterruptedException{
		page.search.clear();
		DriverFactory.getDriver().findElement(By.cssSelector(search)).sendKeys(text);
		DriverFactory.getDriver().findElement(By.cssSelector(searchButton)).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(result)));
	}
	
	@Step("E verifique a quantidade de registros da pesqusa.")
	public void verifyItem(){
		String resultText = DriverFactory.getDriver().findElement(By.cssSelector(result)).getText();
		System.out.println("Resultado pesquisa >>>>> " + DriverFactory.getDriver().findElement(By.cssSelector(result)).getText());
		Assert.assertEquals("1", resultText);
	}
	
	@Step("E seleciono o item desejado.")
	public void selectItem(){
		DriverFactory.getDriver().findElement(By.cssSelector(item[8])).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(addBasket)));
	}
	
	@Step("Quando adiciono o item no carrinho.")
	public void addToBasket(){
		DriverFactory.getDriver().findElement(By.cssSelector(addBasket)).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(continueButton)));
		DriverFactory.getDriver().findElement(By.cssSelector(continueButton)).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(productBasket)));
	}
	
	@Step("Ent�o o mesmo deve estar no carrinho.")
	public void verifyBasket(){
		String result = DriverFactory.getDriver().findElement(By.cssSelector(productBasket)).getText();
		System.out.println("Resultado subtotal >>>>> " + DriverFactory.getDriver().findElement(By.cssSelector(productBasket)).getText());
		Assert.assertEquals("1", result);
	}	
	
	@Step("E sigo para o pagamento.")
	public void payment(){
		String result = DriverFactory.getDriver().findElement(By.cssSelector(productBasket)).getText();
		System.out.println("Resultado subtotal >>>>> " + DriverFactory.getDriver().findElement(By.cssSelector(productBasket)).getText());
		Assert.assertEquals("1", result);
	}	

}