package StepsCucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"StepsCucumber"}, monochrome = true, plugin = {"pretty","html:target/reports/HtmlReports.html"})
public class TestRunner {

	//Classe que executa os testes do cucumber e gera um relatório simples em html
}
