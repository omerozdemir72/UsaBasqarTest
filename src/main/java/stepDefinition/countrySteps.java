package stepDefinition;

import PageObjectModel.applicationPage;
import PageObjectModel.countryPage;
import PageObjectModel.loginPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;


public class countrySteps {

    WebDriver driver;


loginPage loginPage = new loginPage();
countryPage countryPage = new countryPage();
    applicationPage applicationPage= new applicationPage();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
loginPage.typeUserName();
loginPage.typePassword();
loginPage.clickLoginButton();

    }

    @And("^Click on setup on top$")
    public void click_on_setup_on_top() throws Throwable {

        countryPage.clickSetup();
    }

    @And("^Click on parameters$")
    public void click_on_parameters() throws Throwable {
countryPage.clickParameters();
    }

    @And("^Click on countries$")
    public void click_on_countries() throws Throwable {
countryPage.clickCountries();
    }

    @And("^Click on plus icon$")
    public void click_on_plus_icon() throws Throwable {
countryPage.clickPlusIcon();
    }

    @And("^type a name\"([^\"]*)\"$")
    public void typeAName(String name) throws Throwable {
        countryPage.typeInputName(name);
    }


    @And("^type a code\"([^\"]*)\"$")
    public void typeACode(String code) throws Throwable {
        countryPage.typeInputCode(code);
    }

    @When("^click save button$")
    public void click_save_button() throws Throwable {

        applicationPage.clickSaveButton();
    }

    @Then("^name should be displayed \"([^\"]*)\"$")
    public void nameShouldBeDisplayed(String arg0) throws Throwable {
        countryPage.verifyCreated2(arg0);
    }

@And("^Remove the data$")
public void removeTheData() throws InterruptedException {

        applicationPage.clickdelete2();
}

    @Then("^verify data is removed \"([^\"]*)\"$")
    public void verifyDataIsRemoved(String name) throws Throwable {

applicationPage.verifingDeleted(name);



        }


}



