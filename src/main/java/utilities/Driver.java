package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {


    private static WebDriver driver;


    public static WebDriver getDriver(){
        if (driver==null){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\omero\\Selenium\\ChromeDriver\\chromedriver.exe");
            driver=new ChromeDriver();
        }

        return driver;
    }

}
