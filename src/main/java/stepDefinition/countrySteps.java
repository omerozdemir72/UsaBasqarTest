package stepDefinition;

import PageObjectModel.countryPage;
import PageObjectModel.loginPage;
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

    @And("^type a name$")
    public void type_a_name() throws Throwable {
countryPage.typeInputName();
    }

    @And("^type a code$")
    public void type_a_code() throws Throwable {

        countryPage.typeInputCode();
    }

    @When("^click save button$")
    public void click_save_button() throws Throwable {

        countryPage.clickSaveButton();
    }

    @Then("^name should be displayed$")
    public void name_should_be_displayed() throws Throwable {

        countryPage.verifyCreated2();
    }

    @And("^Remove the data$")
    public void remove_the_data() throws Throwable {

    }

    @Then("^verify data is removed$")
    public void verify_data_is_removed() throws Throwable {

    }





}
