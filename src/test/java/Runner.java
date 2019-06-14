import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.close;

    @CucumberOptions(
            features = {"src/test/resources"},
            glue = {"classpath:steps"}
    )
    public class Runner extends AbstractTestNGCucumberTests {
        @BeforeMethod
        public void beforeSuite() {
            Configuration.browser = CHROME;
            Configuration.timeout = 5000;
            Configuration.pollingInterval = 300;
            Configuration.startMaximized = true;
        }

        @AfterMethod
        public void closeBrowser() {
            close();
        }

    }
