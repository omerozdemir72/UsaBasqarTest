package PageObjectModel;

import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import sun.awt.windows.ThemeReader;
import utilities.Driver;

import java.util.List;

public abstract  class  AbstractClass {

    private WebDriver driver = Driver.getDriver();


    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void clickFunction(WebElement clickElement) {

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value) {

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(value);


    }

    public void verifyCreated(List<WebElement> tableList, String value) {

        boolean result = false;

        for (int i = 0; i < tableList.size(); i++) {
            if (tableList.get(i).getText().trim().equalsIgnoreCase(value)) {

                result = true;
                System.out.println(value + " is displayed.");
                break;
            }
        }
        if (!result) {
            Assert.fail();
        }
    }

    public void waitUntilList(List<WebElement> list) throws InterruptedException {
        Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfAllElements(list));


    } //                                                       hangi listeden silincek?              -  hangi delete butonu?     - değer ne ?           - Yes butonu

    public void deleteFunctionality(List<WebElement> name, List<WebElement> deleteButton, String value, WebElement buttonYes) throws InterruptedException {
        Thread.sleep(1000);


        for (int i = 0; i < name.size(); i++) {

            if (name.get(i).getText().equals(value)) {

                clickFunction(deleteButton.get(i));
                clickFunction(buttonYes);
            }
        }

    }



    public void verifyDeletedAbstractClass(List<WebElement> tableList, String value) throws InterruptedException {
        Thread.sleep(1000);
        boolean result = false;
        for (int i = 0; i < tableList.size(); i++) {
            if (tableList.get(i).getText().trim().equalsIgnoreCase(value)) {
                result = true;
                break;
            }
        }
        if (result) {
            Assert.fail();
        } else {
            System.out.println(value + " is not displayed");
        }
    }

    // bana hata verdigi için spesifik olarak butonları belirliyorum
    public void clickDeleteAndYesForSpesificElement(WebElement deleteButton, WebElement yesButton2) throws InterruptedException {
Thread.sleep(2000);
deleteButton.click();
        Thread.sleep(1000);
        yesButton2.click();

    }



}





