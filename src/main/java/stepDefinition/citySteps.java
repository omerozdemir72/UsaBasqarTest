package stepDefinition;

import PageObjectModel.applicationPage;
import PageObjectModel.cityPage;
import PageObjectModel.leftNav;
import com.mongodb.DBRef;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class citySteps {

    WebDriver driver= Driver.getDriver();



    leftNav leftNav= new leftNav();
    cityPage cityPage= new cityPage();
    applicationPage applicationPage= new applicationPage();

    @And("^Click on City$")
    public void clickOnCity() {

        leftNav.clickbuttoncities();
    }


    @And("^Choose any value from the dropdown$")
    public void chooseAnyValueFromTheDropdown() {
    cityPage.handlingDropdown();


    }

    @And("^Type in the Name \"([^\"]*)\"$")
    public void typeInTheName(String arg0) throws Throwable {
        cityPage.typeCityName(arg0);
    }

    @When("^Click on save button$")
    public void clickOnSaveButton() {
        applicationPage.clickSaveButton();

    }

    @Then("^\"([^\"]*)\" should be displayed$")
    public void shouldBeDisplayed(String arg0) throws Throwable {
    applicationPage.verifyCreatedElement(arg0);
    }

    @And("^Remove the data \"([^\"]*)\"$")
    public void removeTheData(String arg0) throws Throwable {
      applicationPage.deletingElementFromTable(arg0);
    }

    @Then("^Verify data is removed \"([^\"]*)\"$")
    public void verifyDataIsRemoved(String arg0) throws Throwable {
applicationPage.verifingDeleted(arg0);
    }
}
