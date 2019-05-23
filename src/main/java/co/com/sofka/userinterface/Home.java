package co.com.sofka.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target BOTON_SIGN_IN = Target.the("Botón de inicio de sesión").locatedBy("//a[@class='login']");
    public static final Target NOMBRE = Target.the("Botón de inicio de sesión").locatedBy("//div[@class='header_user_info']/a/span");
}
