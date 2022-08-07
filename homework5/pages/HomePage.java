package homework5.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


@Getter
public class HomePage extends BasePage{     //Ana sayfadaki elementleri ve metotları içerir.

    public HomePage(WebDriver driver){
        super(driver);
    }

    @AndroidFindBy(id = "android:id/title")
    private WebElement homePageTitle;

    @AndroidFindBy(id="addContactButton")
    private WebElement addContactButton;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"false\"])")  //kayıt olan contactlar
    private List<WebElement> SavedContacts;

    public String getHomeTitleText(){
        return homePageTitle.getText();
    }

    public void clickAddContactBtn(){
        addContactButton.click();
    }

    public boolean checkAccountIfSaved(String accountName){
        helper.waitElementsVisible(SavedContacts,3);

        for(WebElement element : SavedContacts){
            if(element.getText().equals(accountName)){
                return true;
            }
        }

        return false;
    }


}