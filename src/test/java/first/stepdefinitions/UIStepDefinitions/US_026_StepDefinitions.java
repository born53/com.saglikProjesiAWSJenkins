package first.stepdefinitions.UIStepDefinitions;

import first.pages.US_26_Pages;
import first.utilities.ConfigurationReader;
import first.utilities.Driver;
import first.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class US_026_StepDefinitions {

    US_26_Pages us26Contact = new US_26_Pages();

    Actions actions=new Actions(Driver.getDriver());

    // Background:
    @Given("Kullanici Medunna Url'ye gider")
    public void kullanici_medunna_url_ye_gider() throws InterruptedException {
        Thread.sleep(2000);
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }

    @When("Kullanici İletisim icin contact  tiklar")
    public void kullanici_iletisim_icin_contact_tiklar() {
        Driver.waitForVisibility(us26Contact.contactTitle,15);
        us26Contact.contactTitle.click();

    }

    // Scenario: TC_001_Herhangi bir kullanıcının contact portal ile iletişime geçebileceğini doğrulayın

    @Then("Herhangi bir kullanicinin iletisim portalina erisebilecegini dogrulayin")
    public void herhangi_bir_kullanicinin_iletisim_portalina_erisebilecegini_dogrulayin() throws IOException, InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://medunna.com/contact"));
         ReusableMethods.getScreenshot("US_026_TC001_1");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.getScreenshot("US_026_TC001_2");
    }

    @Then("Kullanici tarayiciyi kapatir")
    public void kullanici_tarayiciyi_kapatir() {
        Driver.closeDriver();
    }

//Scenario: TC_002_Herhangi bir kullanicinin gecerli kimlik bilgileriyle istek  gonderebilecegini dogrulayin

    @When("Kullanici gecerli ad, e-posta ve konu girer")
    public void kullanici_gecerli_ad_e_posta_ve_konu_girer() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us26Contact.name.sendKeys("Mustafa");
        us26Contact.email.sendKeys("persineloktay53@gmail.com");
        us26Contact.subject.sendKeys("hastayim");
    }

    @Then("Kullanici Gonder dugmesini tiklar")
    public void kullanici_gonder_dugmesini_tiklar() {
        Driver.waitForVisibility(us26Contact.sendButton,10);
        us26Contact.sendButton.submit();
    }

    @Then("Herhangi bir kullanicinin gecerli kimlik bilgileriyle istek gonderebilecegini dogrulayin")
    public void herhangi_bir_kullanicinin_gecerli_kimlik_bilgileriyle_istek_gonderebilecegini_dogrulayin() throws IOException {
    Assert.assertFalse(us26Contact.receivedMessage.isDisplayed());
    ReusableMethods.getScreenshot("US_026_TC002");
    }

//Scenario:TC_003_Kullanicinin gecerli e-posta kutusunu doldurmadan istek  gonderemeyecegini dogrulayin(Negatif test)

    @When("Kullanici gecerli bir ad ve gecerli bir konu girer ancak e-posta kutusunu bos birakir")
    public void kullanici_gecerli_bir_ad_ve_gecerli_bir_konu_girer_ancak_e_posta_kutusunu_bos_birakir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        us26Contact.name.sendKeys("Mustafa");
        us26Contact.subject.sendKeys("nasil randevu alabilirim");
    }


    @Then("Kullanicinin e-posta kutusunu doldurmadan istek gonderemeyecegini dogrulayin")
    public void kullanicinin_e_posta_kutusunu_doldurmadan_istek_gonderemeyecegini_dogrulayin() throws IOException {
        Assert.assertTrue(us26Contact.yourEmailIsRequiredMessage.isDisplayed());
        ReusableMethods.getScreenshot("US026_TC003_");

    }
     //Scenario:TC_004_Kullanicinin gecerli e-posta yazmadan istek  gonderemeyecegini dogrulayin(Negatif test)

    @When("Kullanici gecerli bir ad ve gecerli bir konu girer")
     public void kullanici_gecerli_bir_ad_ve_gecerli_bir_konu_girer() {

        actions.sendKeys(Keys.PAGE_DOWN).
              perform();

        us26Contact.name.sendKeys("Mustafa");
        us26Contact.subject.sendKeys("nasil randevu alabilirim");

     }

    @Then("Kullanici e-posta kutusuna gecersiz bir e-posta yazar")
    public void kullanici_e_posta_kutusuna_gecersiz_bir_e_posta_yazar() {
        us26Contact.email.sendKeys("persineloktay53gmail");
    }

    @Then("Kullanici gecerli bir e-posta yazmadan istek gonderemeyecegini dogrulayin")
    public void kullanici_gecerli_bir_e_posta_yazmadan_istek_gonderemeyecegini_dogrulayin() throws IOException {
        Assert.assertTrue(us26Contact.thisFieldIsInvalidMessage.isDisplayed());
        ReusableMethods.getScreenshot("US026_TC004_");


    }
    //Scenario:TC_005_Kullanicinin ad kutusunu doldurmadan istek gonderemeyecegini dogrulayin(Negatif test)

    @When("Kullanici gecerli bir e-posta ve gecerli bir konu girer")
    public void kullanici_gecerli_bir_e_posta_ve_gecerli_bir_konu_girer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

       us26Contact.email.sendKeys("persineloktay53@gmail.com");
      us26Contact.subject.sendKeys("hastayim randevu alamiyorum");


    }

    @Then("Kullanici ad kutusunu boş birakir")
    public void kullanici_ad_kutusunu_bos_birakir() {

    }


    @Then("Kullanici ad kutusunu doldurmadan istek gonderemeyecegini dogrulayin")
    public void kullanici_ad_kutusunu_doldurmadan_istek_gonderemeyecegini_dogrulayin() throws IOException {
        Assert.assertTrue(us26Contact.nameIsRequiredMessage.isDisplayed());
        ReusableMethods.getScreenshot("US026_TC005_");
    }
    //Scenario:TC_006_Kullanicinin konu kutusunu doldurmadan istek gonderemeyecegini dogrulayin(Negatif test)

    @When("Kullanici gecerli bir ad ve gecerli bir e-posta girer")
    public void kullanici_gecerli_bir_ad_ve_gecerli_bir_e_posta_girer() {
        us26Contact.name.sendKeys("Mustafa");
        us26Contact.email.sendKeys("persineloktay53@gmail.com");
    }

    @Then("Kullanici konu kutusunu bos birakir")
    public void kullanici_konu_kutusunu_bos_birakir() {

    }

   @Then("Kullanici konu kutusunu doldurmadan istek gonderemeyecegini dogrulayin")
    public void kullanici_konu_kutusunu_doldurmadan_istek_gonderemeyecegini_dogrulayin() throws IOException {
       Assert.assertTrue(us26Contact.subjectThisFieldIsRequiredMessage.isDisplayed());
       ReusableMethods.getScreenshot("US026_TC006_");
    }

   // Scenario:TC_007_Kullanicinin mesaj kutusunu doldurmadan istek gonderebilecegini dogrulayin


    @Then("Kullanici mesaj kutusunu bos birakir")
    public void kullanici_mesaj_kutusunu_bos_birakir() {

    }

    @Then("Kullanici mesaj kutusunu doldurmadan bir istek gonderebilecegini dogrulayin")
    public void kullanici_mesaj_kutusunu_doldurmadan_bir_istek_gonderebilecegini_dogrulayin() throws IOException {
        Driver.waitForVisibility(us26Contact.receivedMessage,10);
        Assert.assertTrue(us26Contact.receivedMessage.isDisplayed());
        ReusableMethods.getScreenshot("US026_TC007_");
    }


}