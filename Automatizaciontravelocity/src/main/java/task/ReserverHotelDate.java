package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import userinterfaces.ReserverHotel;
import org.openqa.selenium.support.ui.Select;

public class ReserverHotelDate implements Task {
    WebDriver driver;

    @Override
    public <T extends Actor> void performAs(T actor) {
                    actor.attemptsTo(
                          //  WaitUntil.the(ReserverHotel.GOING_TO, WebElementStateMatchers.isVisible()),
                            Click.on(ReserverHotel.GOING_TO),
                            Enter.keyValues("medellin").into(ReserverHotel.GOID_TO_DESTINATION),
                            Click.on(ReserverHotel.LIST),
                    Enter.keyValues("").into(ReserverHotel.GOING_TO).thenHit(Keys.ENTER),
                    //SelectFromOptions.byVisibleText("Medellin (MDE - Jose Maria Cordova Intl.)").from(ReserverHotel.GOING_TO),
                    SelectFromOptions.byVisibleText("22").from(ReserverHotel.CHECK_IN),
                    SelectFromOptions.byVisibleText("23").from(ReserverHotel.CHECK_ON));

        }


    public static ReserverHotelDate go(){
        return new ReserverHotelDate();
    }
}
