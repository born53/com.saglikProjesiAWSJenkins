package first.stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import first.pages.US_09Page;
import first.utilities.ConfigurationReader;
import first.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US_09StepDefinitions {

    US_09Page us09Page = new US_09Page();
    Faker faker = new Faker();

    Actions actions= new Actions(Driver.getDriver());

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
    @Given("Kullanici \\(staff) Ana sayfaya gider.")
    public void kullanici_staff_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));

    }

    @Given("Kullanici \\(Staff) profil simgesine tiklar.")
    public void kullanici_staff_profil_simgesine_tiklar() {
        us09Page.profilSimgeButonu.click();
    }

    @Given("Kullanici \\(Staff ) sing in sekmesini tiklar")
    public void kullanici_staff_sing_in_sekmesini_tiklar() {
        us09Page.signInButonu.click();
    }

    @Given("Kullanici \\(staff) Username ve Password girer.")
    public void kullanici_staff_username_ve_password_girer() {
        us09Page.usernameButonu.sendKeys(ConfigurationReader.getProperty("US_09Username"));
        us09Page.passwordButonu.sendKeys(ConfigurationReader.getProperty("US_09Password"));
    }

    @Given("Kullanici\\(staff) Sing in butonuna tiklar")
    public void kullanici_staff_sing_in_butonuna_tiklar() {
        us09Page.signInButon2.click();

    }

    @Given("Kullanıcı \\(staff) MY PAGES'e tıklar.")
    public void kullanıcı_staff_my_pages_e_tıklar() {
        us09Page.myPage.click();
    }

    @Given("Kullanici\\(staff) search Patient sekmesine tiklar.")
    public void kullanici_staff_search_patient_sekmesine_tiklar() {
        us09Page.searchPatient.click();
    }

    @Given("Kullanici \\(staff) patients  goruldugunu dogrular.")
    public void kullanici_staff_patients_goruldugunu_dogrular() {
        Assert.assertTrue(US_09Page.patientDatenList.size()>0);
        //Assert.assertTrue(us09Page.patientSSN.isDisplayed());
    }

    @Given("Kullanici \\(staff) ID  goruldugunu dogrular.")
    public void kullanici_staff_ID_goruldugunu_dogrular() {
        Assert.assertTrue(us09Page.idGorme.isDisplayed());

    }

    @Given("Kullanici \\(staff) SSN  goruldugunu dogrular.")
    public void kullanici_staff_ssn_goruldugunu_dogrular() {
        Assert.assertFalse(us09Page.ssnGorme.getText().equals(""));
        us09Page.ssnGorme.isDisplayed();
    }

    @Given("Kullanici \\(staff) FirstName  goruldugunu dogrular.")
    public void kullanici_staff_first_name_goruldugunu_dogrular() {
            Assert.assertFalse(us09Page.firstNameGorme.getText().equals(""));
            us09Page.firstNameGorme.isDisplayed();
    }

    @Given("Kullanici \\(staff) LastName  goruldugunu dogrular.")
    public void kullanici_staff_last_name_goruldugunu_dogrular() {
        Assert.assertTrue(us09Page.lastNameGorme.isDisplayed());
    }
    @Given("Kullanici \\(staff) BirthDate goruldugunu dogrular.")
    public void kullanici_staff_birth_date_goruldugunu_dogrular() {
        Assert.assertTrue(us09Page.birthdayGorme.isDisplayed());
    }

    @Given("Kullanici \\(staff) Phone  goruldugunu dogrular .")
    public void kullanici_staff_phone_goruldugunu_dogrular() {
        Assert.assertTrue(us09Page.phoneGorme.isDisplayed());

    }
    @Given("Kullanici \\(staff) Email  goruldugunu dogrular.")
        public void kullanici_staff_email_goruldugunu_dogrular() {
        Assert.assertTrue(us09Page.emailGorme.isDisplayed());
    }

    @Given("Kullanici \\(staff) Gender  goruldugunu dogrular.")
        public void kullanici_staff_gender_goruldugunu_dogrular() {
        Assert.assertTrue(us09Page.genderGorme.isDisplayed());
        }
        @Given("Kullanici \\(staff) BloodGroup  goruldugunu dogrular.")
        public void kullanici_staff_blood_group_goruldugunu_dogrular() {
            Assert.assertTrue(us09Page.bloodGroupGorme.isDisplayed());
        }
        @Given("Kullanici \\(staff) Address  goruldugunu dogrular.")
        public void kullanici_staff_address_goruldugunu_dogrular() {
            Assert.assertTrue(us09Page.adressGorme.isDisplayed());
        }
        @Given("Kullanici \\(staff) Description  goruldugunu dogrular.")
        public void kullanici_staff_description_goruldugunu_dogrular() {
            Assert.assertTrue(us09Page.descriptionGorme.isDisplayed());
        }
        @Given("Kullanici \\(staff) CreatedData  goruldugunu dogrular.")
        public void kullanici_staff_created_data_goruldugunu_dogrular() {
            Assert.assertTrue(us09Page.createdDateGorme.isDisplayed());
        }
        @Given("Kullanici \\(staff) User  goruldugunu dogrular.")
        public void kullanici_staff_user_goruldugunu_dogrular() {
            Assert.assertTrue(us09Page.userGorme.isDisplayed());
        }


    //TC_02 ..........................................
    @Given("Kullanici \\(staff)  Hasta SSN'si  girer.")
    public void kullanici_staff_hasta_ssn_si_girer() {
        us09Page.patientSSN.sendKeys(ConfigurationReader.getProperty("US09_TC02_SSNNO"));
    }

    @Given("Kullanici \\(staff) edit butonuna tiklar")
    public void kullanici_staff_edit_butonuna_tiklar() {
        us09Page.editButonu.click();

    }
    @Given("Kullanici \\(staff) id numarasi {string} girer.")
    public void kullanici_staff_id_numarasi_girer(String id) throws InterruptedException {
        Thread.sleep(1000);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("javascript:window.scrollBy(0,800)");
        //Java script ile click yapildi
        JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click();", us09Page.editaPatientID);

       // us09Page.editaPatientID.sendKeys(ConfigurationReader.getProperty(id));


    }
    @Given("Kullanici \\(staff) Adini {string} girer.")
    public void kullanici_staff_adini_girer(String firstname) {
        us09Page.editaPatientFirstName.clear();
        us09Page.editaPatientFirstName.sendKeys(firstname);
    }
    @Given("Kullanici \\(staff) soy ismini {string} girer.")
    public void kullanici_staff_soy_ismini_girer(String lastname) {
        us09Page.editaPatientLastName.clear();
       us09Page.editaPatientLastName.sendKeys(lastname);
    }
    @Given("Kullanici \\(staff) dogum tarihini ve saatini {string} girer.")
    public void kullanici_staff_dogum_tarihini_ve_saatini_girer(String birthdate) {
        us09Page.editaPatientBirthDate.clear();
        Driver.waitAndSendText(us09Page.editaPatientBirthDate,(birthdate ));

    }
    @Given("Kullanici \\(staff) email linkini {string} girer.")
    public void kullanici_staff_email_linkini_girer(String email) {
        us09Page.editaPatientEmail.clear();
       us09Page.editaPatientEmail.sendKeys(email);
    }
    @Given("Kullanici \\(staff) telefonunu {string} girer.")
    public void kullanici_staff_telefonunu_girer(String phone) {
        us09Page.editaPatientPhone.clear();
        us09Page.editaPatientPhone.sendKeys(phone);
    }
    @Given("Kullanici \\(staff) cinsiyetini {string} girer.")
    public void kullanici_staff_cinsiyetini_girer(String gender) throws InterruptedException, IOException {
        WebElement editaPatientGender= us09Page.editaPatientGender;
        Driver.waitForVisibility(editaPatientGender, 2);
        Select select = new Select(editaPatientGender);
        Thread.sleep(1000);
        select.selectByValue("FEMALE");
        getScreenshot("female");

    }
    @Given("Kullanici \\(staff) kan grubunu {string} girer.")
    public void kullanici_staff_kan_grubunu_girer(String bloodgroup) throws IOException, InterruptedException {

        Driver.selectAnItemFromDropdown(us09Page.editaPatientBloodGroup,"AB+");
        Driver.wait2(3);

    }
    @Given("Kullanici \\(staff) adresini {string} girer.")
    public void kullanici_staff_adresini_girer(String address) {
        us09Page.editaPatientAdress.clear();
        us09Page.editaPatientAdress.sendKeys(address);
    }
    @Given("Kullanici \\(staff) hastanin rahatsizligini {string} girer.")
    public void kullanici_staff_hastanin_rahatsizligini_girer(String description) {
        us09Page.editaPatientDescription.clear();
        us09Page.editaPatientDescription.sendKeys(description);
    }
    @Given("Kullanici \\(staff) kullanici ismini {string} girer.")
    public void kullanici_staff_kullanici_ismini_girer(String user) throws IOException, InterruptedException {
        Driver.selectAnItemFromDropdown(us09Page.editaPatientUser,"user_112233445_56677889991657123742123");
        Driver.wait2(1);
    }
    @Given("Kullanici \\(staff) ulkeyi {string} girer.")
    public void kullanici_staff_ulkeyi_girer(String country) throws IOException, InterruptedException {
        Driver.selectAnItemFromDropdown(us09Page.editaPatientCountry,"Canada");
        Driver.wait2(1);
    }
    @Given("Kullanici \\(staff) kaldigi sehri {string} girer.")
    public void kullanici_staff_kaldigi_sehri_girer(String stateCity) throws InterruptedException, IOException {
        Driver.selectAnItemFromDropdown(us09Page.editaPatientStateCity,"FIRENK");
        Driver.wait2(1);
    }

    @Given("Kullanici \\(staff)  Hasta telefonunu siler.")
    public void kullanici_staff_hasta_telefonunu_siler() throws InterruptedException {
        Thread.sleep(3000);
        us09Page.editaPatientPhone.clear();
    }

    @Given("Kullanici \\(staff)  yeni basvurunun hasta SSN'si  girer.")
    public void kullanici_staff_yeni_basvurunun_hasta_ssn_si_girer() {

    }
    @Given("Kullanici \\(staff) yeni basvurunun tum kayit bilgilerini dolduruldugunu dogrular.")
    public void kullanici_staff_yeni_basvurunun_tum_kayit_bilgilerini_dolduruldugunu_dogrular() {

    }
    @Given("Kullanici \\(staff)  hastalari silemedigini dogrulamali")
    public void kullanici_staff_hastalari_silemedigini_dogrulamali() {

        Driver.wait2(1);
        String alert="Internal server error.";
        Assert.assertEquals(alert,us09Page.staffdeletealertmessage.getText());
    }


    @Given("Kullanici \\(staff)  Hasta SSN nosu  girerek arayabilir.")
    public void kullanici_staff_hasta_ssn_nosu_girerek_arayabilir() {
        us09Page.patientSSN.sendKeys(ConfigurationReader.getProperty("US09_TC06_SSNNO"));

    }


}






