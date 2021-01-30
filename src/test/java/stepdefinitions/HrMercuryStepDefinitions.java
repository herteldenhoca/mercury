package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HrMercuryPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HrMercuryStepDefinitions {
    HrMercuryPage hrMercuryPage=new HrMercuryPage();

    @Given("Kullanici hr mercury ana sayfasina gider")
    public void kullaniciHrMercuryAnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("hr_login_page_url"));
    }

    @And("Kullanci username textbox a valid bir username girer")
    public void kullanciUsernameTextboxAValidBirUsernameGirer() {
        hrMercuryPage.usernameTextBox.sendKeys(ConfigReader.getProperty("hr_username"));
    }


    @And("Kullanici password textbox a valid bir username girer")
    public void kullaniciPasswordTextboxAValidBirUsernameGirer() throws InterruptedException {
        hrMercuryPage.passwordTextBox.sendKeys(ConfigReader.getProperty("hr_password"));
    }

    @And("Kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        /*WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(hrMercuryPage.loginButton));
        hrMercuryPage.loginButton.click();*/
        hrMercuryPage.passwordTextBox.sendKeys(Keys.ENTER);
    }

    @Then("Kullanici giris yaptigini dogrular")
    public void kullaniciGirisYaptiginiDogrular() {
        Assert.assertTrue(hrMercuryPage.accessDogrulama.isDisplayed());
    }
}
