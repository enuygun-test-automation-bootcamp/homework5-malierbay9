package homework5.tests;

import homework5.pages.AddContactPage;
import homework5.pages.HomePage;
import homework5.utility.AppiumLocalStarter;
import homework5.utility.DriverManager;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.*;


public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;
    protected AddContactPage addContactPage;

    @BeforeClass
    public void setUp(){


        try {
            //AppiumLocalStarter.start(); //appium u local olarak çalıştırma
        }
        catch (AppiumServerHasNotBeenStartedLocallyException e){
            System.out.println(e.getMessage());
        }

    }

    @BeforeMethod
    public void setMethod(){

        try{

            driver = DriverManager.setupDriver();   //driver ı burda başlattığımızda her test öncesi uygulama baştan açılıyor.
                                                    // Böylece testlerin birbirinden bağımsızlığını sağlayabiliriz.

            homePage = new HomePage(driver);
            addContactPage = new AddContactPage(driver);    //sayfa sınıflarından nesne oluşturma

        }
        catch (UnreachableBrowserException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Driver is null. Please initiate the driver.");
        }


    }

    @AfterMethod
    public void afterMethod(){

        try{
            Thread.sleep(1000);
            driver.quit();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    @AfterClass
    public void tearDown(){

        //AppiumLocalStarter.stop();

    }



}
