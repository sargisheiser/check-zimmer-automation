package com.check_zimmer.pages;

import com.check_zimmer.constants.locators.AccountPageLocators;
import com.check_zimmer.constants.locators.FooterLocators;
import com.check_zimmer.constants.locators.HomePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private final By homePageButton = By.xpath(HomePageLocators.HOME_PAGE_BUTTON);
    private final By favButton = By.xpath(HomePageLocators.FAVORITE_BUTTON);
    private final By unterkuftButton = By.xpath(HomePageLocators.UNTERKUFT_BUTTON);
    private final By meinKontoButton = By.xpath(HomePageLocators.MEIN_KONTO_BUTTON);
    private final By login = By.xpath(AccountPageLocators.LOGIN);
    private final By passwordFill = By.xpath(AccountPageLocators.PASSWORD);
    private final By loginLink = By.xpath(AccountPageLocators.LOGIN_LINK);
    private final By forgotPassword = By.cssSelector(AccountPageLocators.FORGOT_PASSWORD);
    private final By popupEmailInput = By.xpath(AccountPageLocators.POPUP_EMAIL_INPUT_FIELD);
    private final By resetPasswordButton = By.xpath(AccountPageLocators.RESET_PASSWORD_LINK);
    private final By registration = By.xpath(AccountPageLocators.REGISTRATION_BUTTON);
    private final By city = By.xpath(AccountPageLocators.CITY);
    private final By logo = By.xpath(FooterLocators.LOGO);
    private final By agb = By.xpath(FooterLocators.AGB);
    private final By ig = By.xpath(FooterLocators.INSTAGRAM);
    private final By fb = By.xpath(FooterLocators.FACEBOOK);
    private final By yb = By.xpath(FooterLocators.YOUTUBE);
    private final By impressum = By.xpath(FooterLocators.IMPRESSUM);
    private final By datenshutz = By.xpath(FooterLocators.DATENSHUTZ);


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void getHomePage(String url) {
        driver.get(url);
    }

    public void homePage() {
        click(homePageButton);
    }

    public void favButton() {
        click(favButton);
    }

    public void unterkuftButton() {
        click(unterkuftButton);
    }

    public void meinKontoButton() {
        click(meinKontoButton);
    }

    public void registrationButton() {
        click(meinKontoButton);
        click(registration);
    }

    public void login(String username, String password) {

        WebElement usernameInput = driver.findElement(login);
        usernameInput.sendKeys(username);
        WebElement passwordInput = driver.findElement(passwordFill);
        passwordInput.sendKeys(password);
        click(loginLink);
    }

    public void forgotPassword(String email) {
        click(forgotPassword);
        WebElement usernameInput = driver.findElement(popupEmailInput);
        usernameInput.sendKeys(email);
        click(resetPasswordButton);
    }

    public void chooseCity() {
        click(city);
    }

    public void footerLogo() {
        click(logo);
    }

    public void footerFB() {
        click(fb);
    }

    public void footerIG() {
        click(ig);
    }

    public void footerYB() {
        click(yb);
    }

    public void footerAGB() {
        click(agb);
    }

    public void footerImpressum() {
        click(impressum);
    }

    public void footerDaten() {
        click(datenshutz);
    }


}
