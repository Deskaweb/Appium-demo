import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculadoraTest {


    static AppiumDriver<MobileElement> driver;


    public static void main(String[] args) {

        try {
            abrirCalculadora();
        } catch (Exception exp){
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            System.out.println(exp.fillInStackTrace());

        }

    }

    public static void abrirCalculadora() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "Redmi Note 5");
        cap.setCapability("udid", "3d20c8b");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9");

        cap.setCapability("appPackage", "com.miui.calculator");
        cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("Aplicacion funcionando...");

        MobileElement BTN_SALIR = driver.findElement(By.id("android:id/button1"));
        MobileElement BTN_UNO = driver.findElement(By.id(""));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout")));
        BTN_SALIR.click();





    }

}
