package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class leftNav extends AbstractClass {

    private WebDriver driver ;

    public leftNav(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(css = "fuse-navigation .group-items > .nav-item:nth-child(1)")
    private WebElement dropdownSetup;

    @FindBy(xpath = "(//span[contains(text(),'Parameters')])[1]")
    private WebElement dropdownParameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement buttonCountries;

    @FindBy(xpath="//span[contains(text(),'Citizenships')]")
    private WebElement buttonCitizenship;

    @FindBy(xpath="//span[contains(text(),'Nationalities')]")
    private WebElement buttonNatioanlity;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement buttonSubjectCategories;
    @FindBy(xpath = "//span[contains(text(), 'Cities')]")
    private WebElement buttonCities;


    public void clickondropdownSetup(){
        clickFunction( dropdownSetup );
    }

    public void clickOnbuttonNatioanlity(){
        clickFunction( buttonNatioanlity );
    }

    public void clickondropdownParameters(){
        clickFunction( dropdownParameters );
    }

    public void clickonbuttonCountries(){
        clickFunction(buttonCountries);
    }

    public void clickbuttonCitizenship(){
        clickFunction(buttonCitizenship);
    }

    public void clickSubjectCategories(){
        clickFunction(buttonSubjectCategories);
    }


    public void clickbuttoncities(){
        clickFunction(buttonCities);
    }

    public void clickOnbuttonCity(){ clickFunction(buttonCities);}

//    return the current websiteURL
    public String getURL(){
        String url = driver.getCurrentUrl();
        return url;
    }
}
