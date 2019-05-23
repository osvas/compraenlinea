package co.com.sofka.tasks;

import co.com.sofka.model.Cliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.sofka.userinterface.Autenticacion.BOTON_CREAR_CUENTA;
import static co.com.sofka.userinterface.Autenticacion.CAMPO_CORREO_ELECTRONICO_CREAR;
import static co.com.sofka.userinterface.Home.BOTON_SIGN_IN;

public class IrALaPaginaDeCreacion implements Task {
    private List<Cliente> cliente;

    public IrALaPaginaDeCreacion(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Cliente datosCliente = cliente.get(0);
        actor.attemptsTo(
                Click.on(BOTON_SIGN_IN),
                Enter.theValue(datosCliente.getCorreoElectronico()).into(CAMPO_CORREO_ELECTRONICO_CREAR),
                Click.on(BOTON_CREAR_CUENTA)
        );
    }

    public static IrALaPaginaDeCreacion deCliente(List<Cliente> cliente){
        return Tasks.instrumented(IrALaPaginaDeCreacion.class, cliente);
    }
}
