package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;

public class countryPage extends AbstractClass {

private WebDriver driver;

public countryPage(){

    driver= Driver.getDriver();
    PageFactory.initElements(driver,this);
}



@FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setup;


@FindBy(xpath = "(//span[text()='Parameters'])[1]")
    private WebElement parameters;



@FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;


@FindBy(css = "svg[data-icon='plus']")
    private WebElement plusIcon;



@FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input)[2]")
    private WebElement inputName;


@FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input)[2]")
private WebElement inputCode;


@FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;


@FindAll({
        @FindBy(xpath = "//tbody//tr//td[2]")
})
private List<WebElement> tableListOfNames;


public void clickSetup(){

    clickFunction(setup);
}

public void clickParameters(){

    clickFunction(parameters);
}

public void clickCountries(){

    clickFunction(countries);
}


public void clickPlusIcon(){

    clickFunction(plusIcon);
}

public void typeInputName(){

    sendKeysFunction(inputName,"Turkey");
}

public void typeInputCode(){

    sendKeysFunction(inputCode,"TR01");
}


public void clickSaveButton(){

    clickFunction(saveButton);
}

public void verifyCreated2(){

    waitUntilList(tableListOfNames);

    verifyCreated(tableListOfNames,"Turkey");
}


}
