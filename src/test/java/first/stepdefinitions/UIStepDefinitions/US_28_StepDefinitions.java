package first.stepdefinitions.UIStepDefinitions;


import com.github.javafaker.Faker;
import first.pages.US_28_Pages;
import first.utilities.ConfigurationReader;
import first.utilities.Driver;
import first.utilities.JSUtils;
import first.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static first.utilities.TXTWriter.readFile;
import static first.utilities.TXTWriter.saveMapToFile;

public class US_28_StepDefinitions {
    US_28_Pages us28PagesCountry=new US_28_Pages();
    Map<String, String> data= new HashMap<>();

// Background:
   /* @Given("Kullanici Medunna Url'ye gider")
    public void kullanici_medunna_url_ye_gider() throws InterruptedException {
   *//* Thread.sleep(2000);
    Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));*//*
}*/
    @When("Kullanici  profil simgesine tiklar.")
    public void kullanici_profil_simgesine_tiklar() {
        us28PagesCountry.userIcon.click();
    }
    @When("Kullanici  sing in sekmesini tiklar")
    public void kullanici_sing_in_sekmesini_tiklar() {
        us28PagesCountry.signInLocation.click();
    }
    @Then("Kullanici oturum acma acilir penceresini dogrular.")
    public void kullanici_oturum_acma_acilir_penceresini_dogrular() {
        ReusableMethods.waitForVisibility(us28PagesCountry.signInText,3);
        Assert.assertTrue(us28PagesCountry.signInText.isDisplayed());
    }

    @When("Kullanici Username ve Password girer ve  sing in sekmesini tiklar.")
    public void kullanici_username_ve_password_girer_ve_sing_in_sekmesini_tiklar() {
       us28PagesCountry.usernameBox.sendKeys(ConfigurationReader.getProperty("US_028_admin_username"));
       us28PagesCountry.passwordBox.sendKeys(ConfigurationReader.getProperty("US_028_admin_password"));
        us28PagesCountry.signInButton.click();
    }


    @When("Kullanici items&Titles button sekmesini tiklar.")
    public void kullanici_items_titles_button_sekmesini_tiklar() throws InterruptedException {
        Thread.sleep(3000);
       us28PagesCountry.itemsTitles.click();
    }


    //Scenario: TC01_Kullanici yeni bir Country olusturur.

    @When("Kullanici Country tiklar.")
    public void kullanici_country_tiklar() {
        us28PagesCountry.countryLink.click();
    }
    @Then("Kullanici Countries sayfasinin acildigini dogrular.")
    public void kullanici_countries_sayfasinin_acildigini_dogrular() {
        Assert.assertTrue(us28PagesCountry.countriesText.isDisplayed());
    }
    @When("Kullanici Create or edit a Country dugmesine tiklar")
    public void kullanici_create_or_edit_a_country_dugmesine_tiklar() {
       us28PagesCountry.createANewCountryButton.click();
    }
    @When("Kullanici Country adini girer.")
    public void kullanici_country_adini_girer() {
        String country= Faker.instance().country().name();
        data.put("name",country);
        us28PagesCountry.nameInput.sendKeys(country);
    }
    @When("Kullanici Country sayfasindaki save dugmesine tiklar")
    public void kullanici_country_sayfasindaki_save_dugmesine_tiklar() {
        us28PagesCountry.saveButton.click();
    }
    @Then("Kullanici yeni kimlik numarasi mesajiyla yeni bir Country olusturuldugunu dogrular")
    public void kullanici_yeni_kimlik_numarasi_mesajiyla_yeni_bir_country_olusturuldugunu_dogrular() {
        ReusableMethods.waitForVisibility(us28PagesCountry.newCountryIsCreatedMessage,3);
        Assert.assertTrue(us28PagesCountry.newCountryIsCreatedMessage.isDisplayed());
        String message= us28PagesCountry.newCountryIsCreatedMessage.getText();
        String id= message.replaceAll("[^0-9]","");
        data.put("id",id);

    }

    @Then("Kullanici, yeni olusturulan Country nin listede  gorundugunu dogrular.")
    public void kullanici_yeni_olusturulan_country_nin_listede_gorundugunu_dogrular() {
        List<WebElement> listOfElements= Driver.getDriver().findElements(By.xpath("//tbody//td//a"));
        boolean flag=false;
        for (WebElement w:  listOfElements) {
            if(w.getText().equals(data.get("id"))){
                flag=true;
                break;
            }
        }
        Assert.assertTrue(flag);
    }
    @Then("Kullanici yeni olusturulan Country  ve kimligi kaydeder.")
    public void kullanici_yeni_olusturulan_country_ve_kimligi_kaydeder() {
        saveMapToFile(data);
    }
    @Then("Kullanici  tarayicisini kapatir.")
    public void kullanici_tarayicisini_kapatir() {
        Driver.closeDriver();

    }
// Scenario: TC02_Kullanici, Country'ye göre ilgili eyaletler veya sehirler olusturabilmelidir.

    @When("Kullanici State City tiklar.")
public void kullanici_state_city_tiklar() {
        us28PagesCountry.stateCityLink.click();
}
    @When("Kullanici yeni bir Create or edit a State City olustur dugmesine tiklar")
    public void kullanici_yeni_bir_create_or_edit_a_state_city_olustur_dugmesine_tiklar() {
        us28PagesCountry.createNewStateCityButton.click();
    }
    @Then("Kullanici Create or edit a State City sayfasinin acildigini dogrular.")
    public void kullanici_create_or_edit_a_state_city_sayfasinin_acildigini_dogrular() {
        Assert.assertTrue(us28PagesCountry.createNewStateCityText.isDisplayed());
    }

    @When("Kullanici acilir listesinden yeni olusturulan ulkeyi secer.")
    public void kullanici_acilir_listesinden_yeni_olusturulan_ulkeyi_secer() {
        String countryData= readFile(ConfigurationReader.getProperty("US_028_country_ui_data"));
        String[] countryArray= countryData.split("=");
        String str =countryArray[1];
        int idx= str.indexOf(",");
        String country= str.substring(0,idx);
        System.out.println(country);
        Select select= new Select(us28PagesCountry.stateCityDropdown);
//        select.selectByValue(id); does not work
        select.selectByVisibleText(country);
    }

    @When("Kullanici sectigi ulkeye gore State City bolumune sehri girer.")
    public void kullanici_sectigi_ulkeye_gore_state_city_bolumune_sehri_girer() {
        us28PagesCountry.nameInput.sendKeys(Faker.instance().address().state());
    }
    @When("Kullanici save dugmesini tiklar.")
    public void kullanici_save_dugmesini_tiklar() {
        us28PagesCountry.saveButton.click();
    }
    @Then("Kullanici yeni bir State City olusturuldugunu dogrular.")
    public void kullanici_yeni_bir_state_city_olusturuldugunu_dogrular() {
        Assert.assertTrue(us28PagesCountry.newStateCityIsCreatedMessage.isDisplayed());
    }

   // Scenario: TC03_Kullanici ulkeleri silebilmelidir.


    @Then("Kullanici her hangi bir ulkeyi bulur ve Sil dugmesine tiklar.")
    public void kullanici_her_hangi_bir_ulkeyi_bulur_ve_sil_dugmesine_tiklar() {

    }
    @When("Kullanici yeni olusturdugu ulkeyi bulur ve Sil dugmesine tiklar.")
    public void kullanici_yeni_olusturdugu_ulkeyi_bulur_ve_sil_dugmesine_tiklar() {
        List<WebElement> countryIds= Driver.getDriver().findElements(By.xpath("//tr//td[1]"));
        for(int i= countryIds.size(); i>0; i--){
            String xpath= "//tr["+i+"]//td[1]";
            if(Driver.getDriver().findElement(By.xpath(xpath)).getText().equals(data.get("id"))){
                WebElement deleteButton=Driver.getDriver().findElement(By.xpath("//tr["+i+"]//a[@class=\"btn btn-danger btn-sm\"]"));
                JSUtils.scrollIntoViewJS(deleteButton);
                ReusableMethods.waitForClickablility(deleteButton,5);
                JSUtils.clickElementByJS(deleteButton);
                break;
            }
        }
    }
    @When("Kullanici uyari mesajini dogrular")
    public void kullanici_uyari_mesajini_dogrular() {
        ReusableMethods.waitForVisibility(us28PagesCountry.warningMessage,5);
        Assert.assertTrue(us28PagesCountry.warningMessage.isDisplayed());
        Assert.assertTrue(us28PagesCountry.warningMessage.getText().contains(data.get("id")));
    }


    @When("Kullanici ulke'nin basariyla silindigini dogrular.")
    public void kullanici_ulke_nin_basariyla_silindigini_dogrular() {
        ReusableMethods.waitForVisibility(us28PagesCountry.countryIsDeletedMessage,3);
        Assert.assertTrue(us28PagesCountry.countryIsDeletedMessage.isDisplayed());
    }
    @Then("Kullanici silinen ulkenin ulke listesinde gorunmedigini dogrular.")
    public void kullanici_silinen_ulkenin_ulke_listesinde_gorunmedigini_dogrular() {
        List<WebElement> listId= Driver.getDriver().findElements(By.xpath("//tr//td[1]"));
        boolean flag= false;
        for (WebElement w:   listId) {
            if(w.getText().equals(data.get("id"))){
                flag= true;
                break;
            }
        }
        Assert.assertFalse(flag);
    }













}
