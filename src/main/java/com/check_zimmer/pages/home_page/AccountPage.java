package com.check_zimmer.pages.home_page;

import com.check_zimmer.constants.locators.AccountPageLocators;
import com.check_zimmer.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {


    private HomePageHeader homePageHeader;

    private final By login = By.cssSelector(AccountPageLocators.LOGIN);
    private final By passwordFill = By.cssSelector(AccountPageLocators.PASSWORD);
    private final By loginLink = By.cssSelector(AccountPageLocators.LOGIN_LINK);
    private final By forgotPassword = By.cssSelector(AccountPageLocators.FORGOT_PASSWORD);
    private final By registration = By.cssSelector(AccountPageLocators.REGISTRATION_BUTTON);


    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void getHomePage(String url) {
        driver.get(url);
    }

    public void login(String username, String password){

        homePageHeader.meinKontoButton();

        WebElement usernameInput = driver.findElement(login);
        usernameInput.sendKeys(username);
        WebElement passwordInput = driver.findElement(passwordFill);
        passwordInput.sendKeys(password);
        click(loginLink);
    }

    public void openRegistrationLink(){
        click(registration);
    }

    public void forgotPassword(){
        click(forgotPassword);
    }
}
