package com.check_zimmer.constants.locators;

public class RegistrationFormLocators {

    public static final String CHOOSE_PLAN_BUTTON = "//a[@class='choose-plan' and @href='#']";
    public static final String NAME = "//input[@type='text' and @placeholder='Bitte geben Sie Ihren Namen ein' and @name='name-input' and @id='name-input' and @class='only-text']";
    public static final String NACHNAME = "//input[@type='text' and @placeholder='Geben Sie Ihren Nachnamen ein' and @name='surname-input' and @id='surname-input' and @class='only-text']";
    public static final String STRASSE = "//input[@type='text' and @placeholder='Geben Sie Ihre Straße an' and @id='street-input' and @name='street-input']";
    public static final String HAUSNUMMER = "//input[@type='number' and @placeholder='Hausnummer' and @id='house-number-input' and @name='house-number-input']";
    public static final String POSTLEITZAHLL = "//input[@type='number' and @placeholder='Ihre Postleitzahll' and @id='zip-input' and @name='zip-input']";
    public static final String STADT = "//input[@type='text' and @placeholder='Gib deine Stadt ein' and @id='city-input' and @name='city-input' and @class='only-text']";
    public static final String LAND = "//div[@class='vs__selected-options' and descendant::span[@class='vs__selected' and text()='Deutschland'] and descendant::input[@aria-autocomplete='list' and @aria-labelledby='vs2__combobox' and @aria-controls='vs2__listbox' and @type='search' and @autocomplete='off' and @class='vs__search']]";
    public static final String ADDRESSE_GLEICHE_CHECKBOX = "//label[@for='legal-address' and text()='Die Adresse ist die gleiche wie die Adresse des Objekts']";
    public static final String GESPRACHSPARTNER = "//input[@id='contact-person-input' and @name='contact-person-input' and @placeholder='Geben Sie den Namen der Person an, die die Aufträge annimmt' and @class='only-text']";
    public static final String EMAIL_ADDRESSE = "//input[@id='email-address-input' and @name='email-address-input' and @placeholder='Geben Sie Ihre E-Mail-Adresse an' and @type='email']";
    public static final String TELEFONNUMMER = "//input[@id='number-phone-input' and @name='number-phone-input' and @placeholder='+49 15168161326' and @type='number']";
    public static final String TELEFONNUMBER_CHECKBOX = "//label[@for='number-phone-show' and text()='Telefonnummer öffentlich anzeigen']";
    public static final String SPRACHE = "//div[@class='languages-speak-block german active' and contains(text(), 'Deutsche')]\n";

}
