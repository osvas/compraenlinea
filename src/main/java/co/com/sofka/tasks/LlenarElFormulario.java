package co.com.sofka.tasks;

import co.com.sofka.model.Cliente;
import co.com.sofka.userinterface.OpcionMes;
import co.com.sofka.userinterface.OpcionTitulo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.sofka.userinterface.InformacionPersonal.*;

public class LlenarElFormulario implements Task {
    private List<Cliente> cliente;

    public LlenarElFormulario(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Cliente datosCliente = cliente.get(0);
        actor.attemptsTo(
                Click.on(TITULO.of(OpcionTitulo.valueOf(datosCliente.getTitulo().toUpperCase()).opcion())),
                Enter.theValue(datosCliente.getNombre()).into(NOMBRE),
                Enter.theValue(datosCliente.getApellido()).into(APELLIDO),
                Enter.theValue(datosCliente.getCorreoElectronico()).into(CORREO_ELECTRONICO),
                Enter.theValue(datosCliente.getContrasena()).into(CONTRASENA),
                SelectFromOptions.byValue(datosCliente.getDiaNacimiento()).from(DIA_NACIMIENTO),
                SelectFromOptions.byValue(OpcionMes.valueOf(datosCliente.getMesNacimiento().toUpperCase()).opcion()).from(MES_NACIMIENTO),
                SelectFromOptions.byValue(datosCliente.getAnoNacimiento()).from(ANO_NACIMIENTO),
                Click.on(NOTICIAS),
                Click.on(OFERTAS),
                Enter.theValue(datosCliente.getNombre()).into(PRIMER_NOMBRE),
                Enter.theValue(datosCliente.getApellido()).into(PRIMER_APELLIDO),
                Enter.theValue(datosCliente.getCompania()).into(COMPANIA),
                Enter.theValue(datosCliente.getDireccion()).into(DIRECCION),
                Enter.theValue(datosCliente.getDireccion2()).into(DIRECCION_2),
                Enter.theValue(datosCliente.getCiudad()).into(CIUDAD),
                SelectFromOptions.byVisibleText(datosCliente.getEstado()).from(ESTADO),
                Enter.theValue(datosCliente.getCodigoPostal()).into(CODIGO_POSTAL),
                SelectFromOptions.byVisibleText(datosCliente.getPais()).from(PAIS),
                Enter.theValue(datosCliente.getInfoAdicional()).into(INFORMACION_ADICIONAL),
                Enter.theValue(datosCliente.getTelefono()).into(TELEFONO),
                Enter.theValue(datosCliente.getCelular()).into(CELULAR),
                Enter.theValue(datosCliente.getSegundaDireccion()).into(SEGUNDA_DIRECCION),
                Click.on(BOTON_REGISTRAR)
        );
    }

    public static LlenarElFormulario deInscripcion(List<Cliente> cliente) {
        return Tasks.instrumented(LlenarElFormulario.class, cliente);
    }
}
