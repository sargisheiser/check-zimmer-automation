package com.example.checkzimmerautomation.pages;

import com.check_zimmer.constants.urls.Links;
import com.check_zimmer.pages.HomePage;
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
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.homePage();
        String expectedUrl = "https://check-zimmer.de/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void favButton() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.favButton();
        String expectedUrl = "https://check-zimmer.de/favorites";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void unterkuftButton() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.unterkuftButton();
        String expectedUrl = "https://check-zimmer.de/registration";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void meinKontoButton() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.meinKontoButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement registrationPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-content-item")));

        Assert.assertTrue(registrationPopup.isDisplayed(), "Registration popup is not displayed");
    }

    @Test
    public void login() {

        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.meinKontoButton();

        homePage.login("test@gmail.com", "test");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.error-message")));
        Assert.assertTrue(errorMessage.isDisplayed(), "ERROR MESSAGE is not displayed");
    }

    @Test
    public void forgotPassword() {

        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.meinKontoButton();

        homePage.forgotPassword("");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-block modal-forgot-password show']//div[@class='error-text' and text()='Sie haben Ihre E-Mail nicht eingegeben.']")));
        Assert.assertTrue(errorMessage.isDisplayed(), "ERROR MESSAGE is not displayed");
    }

    @Test
    public void checkCity() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.chooseCity();
        WebElement element = driver.findElement(By.xpath("//h1[@class='list-title' and text()='Monteurunterkünfte in Leipzig']"));
        Assert.assertTrue(element.isDisplayed(), "The element is not displayed on the page.");
    }

    @Test
    public void footerLogo() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.footerLogo();
        String expectedUrl = "https://check-zimmer.de/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void footerFB() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.footerFB();
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com"));
    }

    @Test
    public void footerIG() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.footerIG();
        Assert.assertTrue(driver.getCurrentUrl().contains("instagram.com"));
    }

    @Test
    public void footerYB() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.footerYB();
        Assert.assertTrue(driver.getCurrentUrl().contains("youtube.com"));
    }

    @Test
    public void footerAGB() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.footerAGB();
        String expectedUrl = "https://check-zimmer.de/agb";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void footerImpressum() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.footerImpressum();
        String expectedUrl = "https://check-zimmer.de/impressum";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }


    @Test
    public void footerDaten() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.footerDaten();
        String expectedUrl = "https://check-zimmer.de/datenschutz";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

}
