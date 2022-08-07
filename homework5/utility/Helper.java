package homework5.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Helper { //Kolaylık sağlayan bazı metotları içerir.

    private WebDriver driver;
    private WebDriverWait wait;

    public Helper(WebDriver driver){
        this.driver = driver;
    }

    public void waitElementVisible(WebElement element,int seconds){ //Element görünür olana kadar bekletme.
        this.wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementClickable(WebElement element,int seconds){   //Element tıklanabilir olana kadar bekletme.
        this.wait = new WebDriverWait(driver,seconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitElementsVisible(List<WebElement> elements,int seconds){ //Elementler görünür olana kadar bekletme.
        this.wait = new WebDriverWait(driver,seconds);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }


}