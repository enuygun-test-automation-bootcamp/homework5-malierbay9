package homework5.pages;

import homework5.pages.email_phonenumber_types.EmailType;
import homework5.pages.email_phonenumber_types.NumberType;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


@Getter
public class AddContactPage extends BasePage{   //Add Contact sayfasındaki elementleri ve metotları içerir.

    public AddContactPage(WebDriver driver){
        super(driver);
    }

    @AndroidFindBy(id = "android:id/title")
    private WebElement title;

    @AndroidFindBy(id = "accountSpinner")
    private WebElement targetAccountField;

    @AndroidFindBy(xpath="//android.widget.RelativeLayout")
    private WebElement googleAccount;

    @AndroidFindBy(id = "firstAccountLine")
    private WebElement googleAccountMail;

    @AndroidFindBy(id = "contactNameEditText")
    private WebElement contactNameField;

    @AndroidFindBy(id = "contactPhoneEditText")
    private WebElement contactPhoneField;

    @AndroidFindBy(id = "contactPhoneTypeSpinner")
    private WebElement contactPhoneDrop;

    @AndroidFindBy(id = "android:id/alertTitle")
    private WebElement phoneDropSelectListTitle;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[2]")
    private WebElement selectWorkForPhone;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[3]")
    private WebElement selectMobileForPhone;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[1]")
    private WebElement selectHomeForPhone;

    @AndroidFindBy(id = "contactEmailEditText")
    private WebElement contactEmailField;

    @AndroidFindBy(id = "contactEmailTypeSpinner")
    private WebElement contactEmailDrop;

    @AndroidFindBy(id = "android:id/alertTitle")
    private WebElement emailDropSelectListTitle;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[2]")
    private WebElement selectWorkForEmail;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[3]")
    private WebElement selectMobileForEmail;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[1]")
    private WebElement selectHomeForEmail;

    @AndroidFindBy(id = "contactSaveButton")
    private WebElement contactSaveBtn;

    public String getTitleText(){
        return title.getText();
    }

    public void selectGoogleAccount(){
        targetAccountField.click();
        helper.waitElementVisible(googleAccount,3);
        googleAccount.click();
    }

    public void setContactNameField(String contactName){
        contactNameField.click();
        contactNameField.sendKeys(contactName);
    }

    public void setPhoneNumber(String phoneNumber){
        contactPhoneField.click();
        contactPhoneField.sendKeys(phoneNumber);
    }

    public void selectNumberType(Enum numberType){
        contactPhoneDrop.click();

        helper.waitElementVisible(phoneDropSelectListTitle,3);

        if (numberType.equals(NumberType.WORK)) {
            selectWorkForPhone.click();
        }
        else if (numberType.equals(NumberType.MOBILE)) {
            selectMobileForPhone.click();
        }
        else if (numberType.equals(NumberType.HOME)) {
            selectHomeForPhone.click();
        }
    }

    public void setEmail(String eMail){
        contactEmailField.click();
        contactEmailField.sendKeys(eMail);
    }

    public String getGoogleAccountMail(){
        targetAccountField.click();
        helper.waitElementVisible(googleAccountMail,3);

        return googleAccountMail.getText();
    }

    public void selectEmailType(Enum emailType){
        contactEmailDrop.click();
        helper.waitElementVisible(emailDropSelectListTitle,3);

        if (emailType.equals(EmailType.WORK)) {
            selectWorkForEmail.click();
        }
        else if (emailType.equals(EmailType.MOBILE)) {
            selectMobileForEmail.click();
        }
        else if (emailType.equals(EmailType.HOME)) {
            selectHomeForEmail.click();
        }
    }

    public String getContactNameText(){
        return contactNameField.getText();
    }

    public void clearContactName(){
        contactNameField.clear();
    }

    public String getPhoneDropTitle(){
        contactPhoneDrop.click();
        helper.waitElementVisible(phoneDropSelectListTitle,3);
        return phoneDropSelectListTitle.getText();
    }

    public String getEmailDropTitle(){
        contactEmailDrop.click();
        helper.waitElementVisible(emailDropSelectListTitle,3);
        return emailDropSelectListTitle.getText();
    }

    public void saveAccount(){
        getContactSaveBtn().click();
    }


}
