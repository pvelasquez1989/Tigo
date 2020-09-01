package co.com.reto.steps;


import co.com.reto.pages.HomePage;
import co.com.reto.utilities.WebDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;


public class HomeSteps extends PageObject {

    private HomePage homePage;


    @Step
    public void openTigoUnePage (){

        homePage.getOpenPage(WebDriver.in().tigoune());




    }

}
