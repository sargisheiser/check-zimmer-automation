package com.example.checkzimmerautomation.pages;

import com.check_zimmer.constants.urls.Links;
import com.check_zimmer.pages.HomePage;
import com.check_zimmer.pages.RegistrationPage;
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
public class RegistrationFormTest extends BaseTest {


    private void openForm() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        registrationPage.openForm();
    }

    @Test
    public void openFormTest() {
        openForm();
        String expectedUrl = "https://check-zimmer.de/registration";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

    }

    @Test
    public void fillForm() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        openForm();
        registrationPage.fillForm("Test", "Test", "TEST", "1111111.55555",
                "146464946", "TEST", "TEST", "TEST",
                "33333333333"
        );

        registrationPage.fillFormSecondPage("TEST", "TEST", "TEST", "333333333");
        registrationPage.fillFormThirdPage();

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(100)).until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@style='text-align: center;' and contains(., 'Fehler') and contains(., 'Auf unserer Seite scheint etwas schief gelaufen zu sein. Ihre Bewerbung wurde gespeichert. Bitte versuchen Sie es später in diesem Browser erneut.')]")
                )
        );
        assert element.isDisplayed() : "Error modal is not displayed";

    }


}
