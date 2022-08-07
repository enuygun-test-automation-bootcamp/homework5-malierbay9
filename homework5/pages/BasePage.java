package homework5.pages;

import homework5.utility.Helper;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;
    protected Helper helper;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.helper = new Helper(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);    //Bunları buradan yapıp diğer sayfa model sınıflarından inherit ederek onların içinde tekrar tekrar yazmak zorunda kalmayız.
    }



}
