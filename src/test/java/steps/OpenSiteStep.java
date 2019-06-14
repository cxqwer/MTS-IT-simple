package steps;

import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;
import static wrikeTests.enums.SimpleWrikeTestData.SITE_URL;


public class OpenSiteStep {

    @Given("I open site")
    public void OpenSite() {
        open(SITE_URL.value);
    }
}
