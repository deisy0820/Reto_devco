package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.OpenTheBrowser;
import task.ReserverHotelDate;
import userinterfaces.HomePage;

public class TravelocotyStepdefinition {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;
    private Actor user = Actor.named("usuario");
    private HomePage homePage;

    @Before
    @Given("^that user enter to page$")
    public void thatUserEnterToPage() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(OpenTheBrowser.at(homePage));
    }

    @When("^He enter data for search a hotel$")
    public void heEnetrDateForSearchAHotel() {
       // user.attemptsTo(ReserverHotelDate.go());

    }


    @Then("^he should see the options of the different hotels$")
    public void heShouldSeeTheOptionsOfTheDifferentHotels() {

    }


}
