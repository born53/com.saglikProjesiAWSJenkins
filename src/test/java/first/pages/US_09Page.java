package first.pages;

import first.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_09Page {
    public US_09Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
//TC_01 Page.................................
    @FindBy(id = "account-menu")
    public WebElement profilSimgeButonu;

    @FindBy(id = "login-item")
    public WebElement signInButonu;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameButonu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordButonu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButon2;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPage;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement searchPatient;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[1]/div[2]/input")
    public WebElement patientSSN;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr")
    public static List<WebElement> patientDatenList;


    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[1]/span")
    public WebElement idGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[2]/span")
    public WebElement ssnGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[3]/span")
    public WebElement firstNameGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[4]/span")
    public WebElement lastNameGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[5]/span")
    public WebElement birthdayGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[6]/span")
    public WebElement phoneGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[7]/span")
    public WebElement emailGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[8]/span")
    public WebElement genderGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[9]/span")
    public WebElement bloodGroupGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[10]/span")
    public WebElement adressGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[11]/span")
    public WebElement descriptionGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[12]/span")
    public WebElement createdDateGorme;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[13]/span")
    public WebElement userGorme;


    //TC_02 Page...............................
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/tbody/tr/td[16]/div/a[2]")
    public WebElement editButonu;


    @FindBy(xpath = " //*[@id=\"app-view-container\"]/div/div/div/div[2]/div/form/div[1]/label")
    public WebElement editaPatientID;


    @FindBy(xpath = "//*[@id=\"patient-firstName\"]")
    public WebElement editaPatientFirstName;

    @FindBy(xpath = "//*[@id=\"patient-lastName\"]")
    public WebElement editaPatientLastName;

   /* @FindBy(xpath = "//*[@id=\"patient-birthDate\"]")
    public WebElement editaPatientBirthDate;*/
    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement editaPatientBirthDate;


    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement editaPatientEmail;

    @FindBy(xpath = "//*[@id=\"patient-phone\"]")
    public WebElement editaPatientPhone;

    @FindBy(xpath = "//*[@id=\"patient-gender\"]")
    public WebElement editaPatientGender;

    @FindBy(xpath = "//*[@id=\"patient-bloodGroup\"]")
    public WebElement editaPatientBloodGroup;

    @FindBy(xpath = "//*[@id=\"patient-adress\"]")
    public WebElement editaPatientAdress;

    @FindBy(xpath = "//*[@id=\"patient-description\"]")
    public WebElement editaPatientDescription;

    @FindBy(xpath = "//*[@id=\"patient-user\"]")
    public WebElement editaPatientUser;

    @FindBy(xpath = "//*[@id=\"patient-country\"]")
    public WebElement editaPatientCountry;

    @FindBy(xpath = "//*[@id=\"patient-cstate\"]")
    public WebElement editaPatientStateCity;

    @FindBy(xpath = "//*[@id=\"save-entity\"]")
    public WebElement editaPatientSave;

    @FindBy(xpath="//div[text()='Internal server error.']")
    public WebElement staffdeletealertmessage;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement usersSayfasindakiDeleteButonu;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement alertDeleteButonu;


    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/tbody/tr/td[2]")
    public WebElement ssnNoDogrulama;




}