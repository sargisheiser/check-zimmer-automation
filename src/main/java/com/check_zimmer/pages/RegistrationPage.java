package com.check_zimmer.pages;

import com.check_zimmer.constants.locators.RegistrationFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {

    private final By choosePlan = By.xpath(RegistrationFormLocators.CHOOSE_PLAN_BUTTON);
    private final By name = By.xpath(RegistrationFormLocators.NAME);
    private final By nachname = By.xpath(RegistrationFormLocators.NACHNAME);
    private final By strasse = By.xpath(RegistrationFormLocators.STRASSE);
    private final By hausnummer = By.xpath(RegistrationFormLocators.HAUSNUMMER);
    private final By postal = By.xpath(RegistrationFormLocators.POSTLEITZAHLL);
    private final By stadt = By.xpath(RegistrationFormLocators.STADT);
    private final By geshprachPartner = By.xpath(RegistrationFormLocators.GESPRACHSPARTNER);
    private final By emailAddress = By.xpath(RegistrationFormLocators.EMAIL_ADDRESSE);
    private final By telefonNumber = By.xpath(RegistrationFormLocators.TELEFONNUMMER);
    private final By telefonNumberCheckbox = By.xpath(RegistrationFormLocators.TELEFONNUMBER_CHECKBOX);
    private final By sprache = By.xpath(RegistrationFormLocators.SPRACHE);


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void openForm() {
        HomePage homePage = new HomePage(driver);
        homePage.registrationButton();

    }

    public void fillForm(String nameInput, String nachnameInput, String strasseInput, String hausnummerInput, String postalcode,
                         String stadtInput, String GesprachPartner, String emailInput, String phoneNumberInput) {

        click(choosePlan);

        WebElement usernameInput = driver.findElement(name);
        usernameInput.sendKeys(nameInput);
        WebElement nachnameElement = driver.findElement(nachname);
        nachnameElement.sendKeys(nachnameInput);
        WebElement street = driver.findElement(strasse);
        street.sendKeys(strasseInput);
        WebElement houseNumber = driver.findElement(hausnummer);
        houseNumber.sendKeys(hausnummerInput);
        WebElement postalCode = driver.findElement(postal);
        postalCode.sendKeys(postalcode);
        WebElement city = driver.findElement(stadt);
        city.sendKeys(stadtInput);

        WebElement gesprach = driver.findElement(geshprachPartner);
        gesprach.sendKeys(GesprachPartner);
        WebElement email = driver.findElement(emailAddress);
        email.sendKeys(emailInput);
        WebElement phoneNumber = driver.findElement(telefonNumber);
        phoneNumber.sendKeys(phoneNumberInput);

        click(telefonNumberCheckbox);
        click(sprache);

    }

    public void fillFormSecondPage(String facebookLinkInput, String vorNachNameInput, String emailInput, String phoneNumberInput) {
        click(By.xpath("//a[@href='#' and @class='save' and text()='Speichern und fortfahren']"));

        WebElement facebookLink = driver.findElement(By.xpath("//input[@type='text' and @id='video-input' and @name='video-input' and @placeholder='Geben Sie den Facebook-Link an']"));
        facebookLink.sendKeys(facebookLinkInput);

        WebElement vorNachName = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Geben Sie den Namen der Person an, die die Aufträge annimmt' and @id='contact-person-input' and @name='contact-person-input' and @class='only-text']"));
        vorNachName.sendKeys(vorNachNameInput);

        WebElement email = driver.findElement(By.xpath("//input[@type='email' and @placeholder='Geben Sie Ihre E-Mail-Adresse an' and @id='email-address-input' and @name='email-address-input']"));
        email.sendKeys(emailInput);

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@type='number' and @placeholder='+49 15168161326' and @id='number-phone-input' and @name='number-phone-input']"));
        phoneNumber.sendKeys(phoneNumberInput);

        click(By.xpath("//a[@href='#' and @class='save' and text()='Speichern und fortfahren']"));
    }

    public void fillFormThirdPage() {
        click(By.xpath("//a[@href='#' and @class='save' and text()='Mit Zahlungsverpflichtung bestätigen']"));
    }
}
