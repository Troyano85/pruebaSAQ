package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static constants.Url.MY_CUENTA;

public class RegistarseSteps {

    Actor actor=Actor.named("user");

    @Managed
    WebDriver MyDriver;

    @Before
    public void setActor(){actor.can(BrowseTheWeb.with(MyDriver));}
    @Given("el usuario se encuentra en la pagina de registro")
    public void elUsuarioSeEncuentraEnLaPaginaDeRegistro() {
        actor.attemptsTo(
                Open.url(MY_CUENTA)
        );

    }
    @When("el usuario escribe su josefernandotroyano y su ZhTLmgTFZU7yn2L")
    public void elUsuarioEscribeSuJosefernandotroyanoYSuZhTLmgTFZU7yn2L() {

    }
    @Then("el usuario ve textoMi cuenta")
    public void elUsuarioVeTextoMiCuenta() {

    }


}
