package homework5.utility;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

//Bu sınıfta driver üretiyoruz.

public class DriverManager {
    private static DesiredCapabilities capabilities;
    private static WebDriver driver;
    private static URL url ;

    public static WebDriver setupDriver() {

        try {
            url=new URL("http://127.0.0.1:4723/wd/hub");
            capabilities = CapabilitySettings.getDesiredCapsFromJson(CapabilityPaths.CAPSET1.path);
            driver = new AndroidDriver(url,capabilities);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

        return driver;
    }

}
