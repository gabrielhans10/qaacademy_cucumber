package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PesquisaPages;

import java.time.Duration;


public class PesquisaStep {
    WebDriver driver;
    PesquisaPages pesquisaPages;


    @Dado(": que o usuario esta em {string}")
    public void que_o_usuario_esta_em(String url) {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Quando(": pesuisa por {string}")
    public void pesuisa_por(String palavraDaPesquisa) {
        pesquisaPages = new PesquisaPages();
        driver.findElement(By.id(pesquisaPages.barraDePesquisa)).sendKeys(palavraDaPesquisa);
        driver.findElement(By.id(pesquisaPages.barraDePesquisa)).sendKeys(Keys.ENTER);

    }
    @Entao(": retorna um link relaciona a pesquisa")
    public void retorna_um_link_relaciona_a_pesquisa() {
        pesquisaPages = new PesquisaPages();
        //String linkSelector = "div.yuRUbf a";

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Localiza o elemento usando o seletor CSS
        //WebElement linkElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath((pesquisaPages.linkSelector)));

        // Faz o scroll até o elemento ficar visível
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", linkElement);

        // Espera até que o elemento esteja clicável
        //linkElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector((pesquisaPages.linkSelector)));

        // Clica no link
        //linkElement.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;//para descer a pagina
        js.executeScript("window.scrollBy(0,300)", "");//cont. para descer a pagina
        driver.findElement(By.xpath(pesquisaPages.clicarNoLink)).isDisplayed();
        driver.findElement(By.xpath(pesquisaPages.clicarNoLink)).click();


    }

    }




