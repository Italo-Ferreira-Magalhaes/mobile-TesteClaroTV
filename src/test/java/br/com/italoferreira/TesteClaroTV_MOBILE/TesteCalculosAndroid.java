package br.com.italoferreira.TesteClaroTV_MOBILE;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TesteCalculosAndroid {

    private static Screen Screen;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", new File("apps/app-android-calculator.apk"));
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("unicodeKeyboard", true);
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        Screen = new Screen(driver);
    }

    @Test
    public void testeSoma() {
        Screen.realizarSoma("5", "8");
        Screen.validarSoma("13");
    }

    @Test
    public void testeSubtracao() {
        Screen.realizarSubtracao("10", "5");
        Screen.validarSubtracao("5");
    }

    @Test
    public void testeMultiplicacao() {
        Screen.realizarMultiplicacao("5", "4");
        Screen.validarMultiplicacao("20");
    }

    @Test
    public void testeDivisao() {
        Screen.realizarDivisao("66", "3");
        Screen.validarDivisao("22");
    }

}
