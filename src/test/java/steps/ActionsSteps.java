package steps;

import cucumber.api.java.en.*;
import wrikeTests.pages.IndexPage;
import wrikeTests.pages.ResendPage;
import wrikeTests.utilities.GeneratedEmail;

import static com.codeborne.selenide.Selenide.page;
import static wrikeTests.enums.QASectionElements.*;
import static wrikeTests.enums.SimpleWrikeTestData.COMMENTS;

public class ActionsSteps {

    private IndexPage indexPage = page(IndexPage.class);
    private ResendPage resendPage = page(ResendPage.class);

    @Then("I choose Get started for free")
    public void getStartedForFree(){
        indexPage.clickGetStartedForFree();
    }

    @And("Fill in the email field with random generated number of email")
    public void fillEmailForm(){
        indexPage.fillEmailField(GeneratedEmail.createRandomEmail());
    }

    @And("I create my Wrike account check with assertion that you are moved to the next page")
    public void createWrikeAccount(){
        indexPage.clickCreateWrikeAccountButton();
    }

    @Then("I fill in the Q&A section at the left part of page")
    public void fillQAsection(){
        resendPage.fillForm(VERY_INTERESTED, SIX_TO_FIFTEEN, OTHER, COMMENTS);
        resendPage.submit();
    }

    @Then("I Resend email")
    public void  resendEmail(){
        resendPage.ResendEmail();
    }

}
