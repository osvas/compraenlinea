package co.com.sofka.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Autenticacion {
    public static final Target CAMPO_CORREO_ELECTRONICO_CREAR = Target.the("Campo del correo electronico el cual se va a registrar").located(By.id("email_create"));
    public static final Target BOTON_CREAR_CUENTA = Target.the("Boton para crear la cuenta").located(By.id("SubmitCreate"));
    public static final Target MENSAJE_DE_ERROR = Target.the("Boton para crear la cuenta").locatedBy("//div[@id='create_account_error']/ol/li");
    public static final Target CAMPO_CORREO_ELECTRONICO_INGRESAR = Target.the("Campo del correo electronico con el cual se va a ingresar a la aplicacion").located(By.id("email"));
    public static final Target CAMPO_CONTRASENA = Target.the("Campo donde se ingresa la contrasena").located(By.id("passwd"));
    public static final Target BOTON_INGRESAR = Target.the("Boton para ingresar a la aplicacion").located(By.id("SubmitLogin"));
}
