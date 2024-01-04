package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Page01;
import utils.ConfigReader;
import utils.Driver;

public class Steps01 {
    Page01 elements = new Page01();

    @Given("OBSS adresine git")
    public void obssAdresineGit() {
        Driver.getDriver().get(ConfigReader.getProperty("link"));
    }

    @Given("çerezleri kabul et")
    public void çerezleri_kabul_et() {
        elements.cookiePoP.click();
    }

    @Then("Logoyu kontrol et")
    public void logoyu_kontrol_et() {
        Assert.assertTrue(elements.logo.isDisplayed());
    }

    @Then("tarayıcıyı kapat")
    public void tarayıcıyıKapat() {
        Driver.closeDriver();
    }


}
