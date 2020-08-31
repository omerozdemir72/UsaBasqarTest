package stepDefinition;

import PageObjectModel.countryPage;
import PageObjectModel.leftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class nationalitiesSteps {

    countryPage countryPage = new countryPage();
    leftNav leftNav = new leftNav();
    @And("^Click on Nationalities$")
    public void clickOnNationalities() {

        leftNav.clickOnbuttonNatioanlity();
    }

    @And("^type a name \"([^\"]*)\"$")
    public void typeAName(String nationalities) throws Throwable {

        countryPage.typeInputName(nationalities);


    }
}
