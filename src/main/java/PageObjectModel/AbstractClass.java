package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public abstract  class  AbstractClass {

    private WebDriver driver = Driver.getDriver();


    WebDriverWait wait = new WebDriverWait(driver,10);

    public void clickFunction(WebElement clickElement){

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(value);


    }

    public void verifyCreated(List<WebElement> tableList,String value){

        boolean result = false;

        for (int i = 0; i <tableList.size() ; i++) {
            if (tableList.get(i).getText().trim().equalsIgnoreCase(value)){

                result=true;
                System.out.println(value + " is displayed." );
                break;
            }
        }
        if (!result){
            Assert.fail();
        }
    }

    public void waitUntilList(List<WebElement>list){
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(list));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

}
