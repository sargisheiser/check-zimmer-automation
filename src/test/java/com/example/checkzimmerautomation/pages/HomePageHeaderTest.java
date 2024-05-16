package com.example.checkzimmerautomation.pages;

import com.check_zimmer.constants.urls.Links;
import com.check_zimmer.pages.home_page.AccountPage;
import com.check_zimmer.pages.home_page.HomePageHeader;
import com.example.checkzimmerautomation.utility.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;


@Listeners(TestListener.class)
public class HomePageHeaderTest extends BaseTest {

    @Test
    public void Logo() {
        HomePageHeader homePage = new HomePageHeader(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.homePage();
        String expectedUrl = "https://check-zimmer.de/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void favButton() {
        HomePageHeader homePage = new HomePageHeader(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.favButton();
        String expectedUrl = "https://check-zimmer.de/favorites";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void unterkuftButton() {
        HomePageHeader homePage = new HomePageHeader(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.unterkuftButton();
        String expectedUrl = "https://check-zimmer.de/registration";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void meinKontoButton() {
        HomePageHeader homePage = new HomePageHeader(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.meinKontoButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement registrationPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-content-item")));

        Assert.assertTrue(registrationPopup.isDisplayed(), "Registration popup is not displayed");
    }

    @Test
    public void login() {

        HomePageHeader homePage = new HomePageHeader(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.meinKontoButton();

        homePage.login("test@gmail.com", "test");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.error-message")));
        Assert.assertTrue(errorMessage.isDisplayed(), "ERROR MESSAGE is not displayed");
    }

}
