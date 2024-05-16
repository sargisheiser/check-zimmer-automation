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
public class AccountPageTest extends BaseTest {

    @Test
    public void login() {

        HomePageHeader homePage = new HomePageHeader(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.meinKontoButton();

        AccountPage accountPage = new AccountPage(driver);

        accountPage.login("test@gmail.com", "test");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.error-message")));
        Assert.assertTrue(errorMessage.isDisplayed(), "ERROR MESSAGE is not displayed");
    }
}
