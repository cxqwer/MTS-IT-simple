package steps;

import cucumber.api.java.en.When;
import wrikeTests.enums.SocialMedias;
import wrikeTests.pages.ResendPage;

import static com.codeborne.selenide.Selenide.page;

public class AssertionsSteps {
    private ResendPage resendPage = page(ResendPage.class);

    @When("I was move to the next page")
    public void checkResendPage(){
        resendPage.checkMovedResendPage();
    }

   @When("^Section Follow us consists '([^\"]*)'$")
    public void checkMedia(SocialMedias medias){
       resendPage.checkFooterContainElement(medias);
   }

}
