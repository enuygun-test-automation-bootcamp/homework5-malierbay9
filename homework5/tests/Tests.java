package homework5.tests;

import homework5.pages.email_phonenumber_types.EmailType;
import homework5.pages.email_phonenumber_types.NumberType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test(priority = 0)
    public void openAddContact() {  //home page deki title ı kontrol etme
        Assert.assertEquals(homePage.getHomeTitleText(),"Contact Manager");
    }

    @Test(priority = 1)
    public void checkAddContactTitle(){ //add contact page title ını kontrol etme

        try {
            homePage.clickAddContactBtn();
            Thread.sleep(1000);
            Assert.assertEquals(addContactPage.getTitleText(),"Add Contact");
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 2)
    public void checkContactNameAcceptsNumberOrDigit(){ //contact name alanına karakter ya da numara yazılabilirliğini test etme
        String nameWithDigit = "@>£#$$#<>!\"";
        String nameWithNumber = "1234567890";

        homePage.clickAddContactBtn();
        addContactPage.setContactNameField(nameWithDigit);

        Assert.assertEquals(addContactPage.getContactNameText(),nameWithDigit);

        addContactPage.clearContactName();
        addContactPage.setContactNameField(nameWithNumber);

        Assert.assertEquals(addContactPage.getContactNameText(),nameWithNumber);

    }

    @Test(priority = 3)
    public void checkAccountMailIsRight(){  //google hesabı ekrana geliyor mu testi
        String mail = "hwtest519@gmail.com";

        homePage.clickAddContactBtn();

        Assert.assertEquals(addContactPage.getGoogleAccountMail(),mail);

    }

    @Test(priority = 4)
    public void checkPhoneDropTitle(){  //phone spinner ekrana geliyor mu testi
        homePage.clickAddContactBtn();

        Assert.assertEquals(addContactPage.getPhoneDropTitle(),"Select label");
    }

    @Test(priority = 5)
    public void checkEmailDropTitle(){  //mail spinner ekrana geliyor mu testi
        homePage.clickAddContactBtn();

        Assert.assertEquals(addContactPage.getEmailDropTitle(),"Select label");
    }

    @Test(priority = 6)
    public void saveAndCheckWorkAccount(){  //başarılı iş hesabı kayıt etme testi

        String name = "chukwuemeka";
        String phoneNumber = "0892143";
        String email = "test@gmail.com";

        homePage.clickAddContactBtn();
        addContactPage.selectGoogleAccount();
        addContactPage.setContactNameField(name);
        addContactPage.setPhoneNumber(phoneNumber);
        addContactPage.selectNumberType(NumberType.WORK);
        addContactPage.setEmail(email);
        addContactPage.selectEmailType(EmailType.WORK);
        addContactPage.saveAccount();

        Assert.assertTrue(homePage.checkAccountIfSaved(name));

    }

    @Test(priority = 7)
    public void saveAndCheckMobileAccount(){    //başarılı mobil hesabı kayıt etme testi

        String name = "chukwueze";
        String phoneNumber = "05366714";
        String email = "test2@gmail.com";

        homePage.clickAddContactBtn();
        addContactPage.selectGoogleAccount();
        addContactPage.setContactNameField(name);
        addContactPage.setPhoneNumber(phoneNumber);
        addContactPage.selectNumberType(NumberType.MOBILE);
        addContactPage.setEmail(email);
        addContactPage.selectEmailType(EmailType.MOBILE);
        addContactPage.saveAccount();

        Assert.assertTrue(homePage.checkAccountIfSaved(name));

    }

    @Test(priority = 8)
    public void saveAndCheckHomeAccount(){  //başarılı ev hesabı kayıt etme testi

        String name = "chalobah";
        String phoneNumber = "05456367";
        String email = "test3@gmail.com";

        homePage.clickAddContactBtn();
        addContactPage.selectGoogleAccount();
        addContactPage.setContactNameField(name);
        addContactPage.setPhoneNumber(phoneNumber);
        addContactPage.selectNumberType(NumberType.HOME);
        addContactPage.setEmail(email);
        addContactPage.selectEmailType(EmailType.HOME);
        addContactPage.saveAccount();

        Assert.assertTrue(homePage.checkAccountIfSaved(name));

    }


}
