package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class applicationPage extends AbstractClass {

    private WebDriver driver ;


    public applicationPage(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(css = "svg[data-icon='plus']" )
    private WebElement plusButton;

    @FindBy(xpath="//span[text()='Save']")
    private WebElement saveButton;


            @FindBy(xpath = "//span[text()=' Yes ']")
            private WebElement buttonYes;

//  todo Sayfalardaki tüm listeler için
            @FindAll({
                    @FindBy(xpath="//tbody//tr//td[2]")
            }  )
            private List<WebElement> tableListofNames;


            //todo     Sayfalardaki ortak liste silme butonu için genel kod
            @FindAll({
                    @FindBy(xpath="//ms-delete-button//button")
    })
    private List<WebElement> listOfDeleteButtons;


            @FindBy(xpath = "//tbody//tr[1]//td[2]")
            private WebElement firstElement;



            @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted'])[1]")
            private WebElement firstElementDeleteButton;
            //todo  PLUS BUTTON
    public void clickPlusButton(){
        clickFunction( plusButton );
    }

    //todo     SAVE BUTTON
    public void clickSaveButton(){
        clickFunction( saveButton );
    }

    //TODO    BUTTON YES
    public void clickYes(){
        clickFunction( buttonYes );
    }


   public void verifyCreatedElement(String value) throws InterruptedException {

        waitUntilList(tableListofNames);
       verifyCreated(tableListofNames,value);
   }

//todo      Abstarct classtaki silme metodu ile listeden eleman silme methodu oluşturdum.
    public void deletingElementFromTable(String value) throws InterruptedException {
        deleteFunctionality( tableListofNames ,listOfDeleteButtons ,value , buttonYes);
    }
//todo     Abstract classtaki verify methodunu listelere özel hale getirdik.
    public void verifingDeleted(String value) throws InterruptedException {
        verifyDeletedAbstractClass( tableListofNames , value );
    }

    public void clickdelete2() throws InterruptedException {

        clickDeleteAndYesForSpesificElement(firstElementDeleteButton,buttonYes);
    }


}
