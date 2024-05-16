package com.check_zimmer.constants.locators;

public class AccountPageLocators {

    public static final String LOGIN = "//form[@class='modal-form login']//input[@id='mail-phone']";
    public static final String PASSWORD = "//form[@class='modal-form login']//input[@id='password']";
    public static final String LOGIN_LINK = "//form[@class='modal-form login']//a[@class='entry login-link']";
    public static final String FORGOT_PASSWORD = ".input-block-item .forgot-password.desctop-link\n";
    public static final String POPUP_EMAIL_INPUT_FIELD = "//div[@class='modal-block modal-forgot-password show']//input[@id='mail' and @type='email']";
    public static final String RESET_PASSWORD_LINK = "//div[@class='modal-block modal-forgot-password show']//a[@class='entry forgot-password-link' and text()='Passwort zurücksetzen']";
    public static final String REGISTRATION_BUTTON = "a[href='/registration']";


}
