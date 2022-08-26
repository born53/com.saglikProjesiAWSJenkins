package first.pages;

import first.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_28_Pages {

    public US_28_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    // Background:pages
    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement userIcon;

    @FindBy(xpath = "//*[@id='login-item']/span")
    public WebElement signInLocation;

    @FindBy(xpath = "//h5[@class=\"modal-title\"]//span")
    public WebElement signInText;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitles;





    @FindBy(xpath = "//a[@href=\"/country\"]")
    public WebElement countryLink;

    @FindBy(xpath = "//h2[@id=\"country-heading\"]")
    public WebElement countriesText;

    @FindBy(xpath = "//a[@class=\"btn btn-primary float-right jh-create-entity\"]")
    public WebElement createANewCountryButton;

    @FindBy(xpath = "//div[@class=\"Toastify__toast-body\"]")
    public WebElement newCountryIsCreatedMessage;

    @FindBy(xpath = "//input[@id=\"country-name\"]")
        public WebElement nameInput;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//a[@href=\"/c-state\"]//span")
    public WebElement stateCityLink;

    @FindBy(xpath = "//span[.='Admin Adminlast']")
    public WebElement adminAdminLast;

    @FindBy(xpath = "//a[@href=\"/logout\"]")
    public WebElement signOut;

    @FindBy(xpath = "//a[@href=\"/c-state/new\"]//span")
    public WebElement createNewStateCityButton;

    @FindBy(xpath = "//h2//span")
    public WebElement createNewStateCityText;

    @FindBy(id = "c-state-state")
    public WebElement stateCityDropdown;

    @FindBy(xpath = "//*[contains(text(),'New State/City is created')]")
    public WebElement newStateCityIsCreatedMessage;

    @FindBy(id = "hospitalmsappfrontendApp.country.delete.question")
    public WebElement warningMessage;

    @FindBy(xpath = "//div[@class=\"Toastify__toast-body\"]")
    public WebElement countryIsDeletedMessage;

    @FindBy(id = "jhi-confirm-delete-country")
    public WebElement popUpDeleteButton;


}




