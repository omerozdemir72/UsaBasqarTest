package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginPage extends AbstractClass{


    private WebDriver driver;

    public loginPage(){

        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@data-placeholder='Username']")
    private WebElement username;


    @FindBy(xpath = "//input[@data-placeholder='Password']")
    private WebElement password;



    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    private WebElement loginButton;



    public void typeUserName(){

        sendKeysFunction(username,"daulet2030@gmail.com");
    }

    public void typePassword(){

        sendKeysFunction(password,"TechnoStudy123@");
    }

    public void clickLoginButton(){

        clickFunction(loginButton);
    }

}

