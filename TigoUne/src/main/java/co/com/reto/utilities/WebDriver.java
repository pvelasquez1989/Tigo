package co.com.reto.utilities;

import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriver {

    private ChromeDriver driver;

    public WebDriver(){


        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        SerenityWebdriverManager.inThisTestThread().setCurrentDriverTo(driver);

    }

    public ChromeDriver tigoune(){
        driver.get("https://www.tigo.com.co/");
        return driver;
    }
    public static WebDriver in(){
        return new WebDriver();
    }
}

