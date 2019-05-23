package co.com.sofka.stepdefinitions;

import co.com.sofka.model.Cliente;
import co.com.sofka.questions.ElMensajeDeValidacion;
import co.com.sofka.questions.ElNombreObtenido;
import co.com.sofka.tasks.AbrirNavegador;
import co.com.sofka.tasks.IrALaPaginaDeCreacion;
import co.com.sofka.tasks.LlenarElFormulario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

public class CrearCuenta {

    @Managed(driver = "chrome")
    private WebDriver suNavegador;
    public static Actor oscar = Actor.named("Oscar");

    @Before
    public void inicializacion() {
        oscar.can(BrowseTheWeb.with(suNavegador));
    }

    @Given("^Que Oscar quiere crear una cuenta$")
    public void queOscarQuiereCrearUnaCuenta() {
        oscar.wasAbleTo(AbrirNavegador.inicio());
    }


    @When("^Creo la cuenta en la página$")
    public void creoLaCuentaEnLaPagina(List<Cliente> cliente) {
        oscar.attemptsTo(
                IrALaPaginaDeCreacion.deCliente(cliente),
                LlenarElFormulario.deInscripcion(cliente)
        );
    }

    @Then("^Verifico que pueda ingresar a ella$")
    public void verificoQuePuedaIngresarAElla(List<Cliente> cliente) {
        String nombreCompleto = cliente.get(0).getNombre() + " " + cliente.get(0).getApellido();
        oscar.should(seeThat(ElNombreObtenido.es(), equalTo(nombreCompleto)));
    }

    @When("^Intento crear una cuenta$")
    public void intentoCrearUnaCuenta(List<Cliente> cliente) {
        oscar.attemptsTo(
                IrALaPaginaDeCreacion.deCliente(cliente)
        );
    }

    @Then("^Verifico que se vea el mensaje de error indicando que el correo ya existe$")
    public void verificoQueSeVeaElMensajeDeErrorIndicandoQueElCorreoYaExiste() {
        oscar.should(
                seeThat(ElMensajeDeValidacion.es(),
                equalTo("An account using this email address has already been registered. Please enter a valid password or request a new one."))
        );
    }
}
