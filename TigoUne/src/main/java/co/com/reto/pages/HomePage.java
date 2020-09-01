package co.com.reto.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {


   private WebElementFacade openPage;



    public WebElementFacade getOpenPage(ChromeDriver tigoune) {
        return openPage;
    }
}
