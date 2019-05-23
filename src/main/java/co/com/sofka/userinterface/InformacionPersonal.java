package co.com.sofka.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionPersonal {
    public static final Target TITULO = Target.the("Radio para seleccionar el titulo de senor").locatedBy("//input[@id='id_gender{0}']");
    public static final Target NOMBRE = Target.the("Nombre del cliente").located(By.id("customer_firstname"));
    public static final Target APELLIDO = Target.the("Apellido del cliente").located(By.id("customer_lastname"));
    public static final Target CORREO_ELECTRONICO = Target.the("Correo electronico del cliente").located(By.id("email"));
    public static final Target CONTRASENA = Target.the("Contrasena del cliente").located(By.id("passwd"));
    public static final Target DIA_NACIMIENTO = Target.the("Dia de nacimiento").located(By.id("days"));
    public static final Target MES_NACIMIENTO = Target.the("Mes de nacimiento").located(By.id("months"));
    public static final Target ANO_NACIMIENTO = Target.the("Año de nacimiento").located(By.id("years"));
    public static final Target NOTICIAS = Target.the("Suscripcion a las noticias").located(By.id("newsletter"));
    public static final Target OFERTAS = Target.the("Suscripcion a las ofertas").located(By.id("optin"));
    public static final Target PRIMER_NOMBRE = Target.the("Primer nombre").located(By.id("firstname"));
    public static final Target PRIMER_APELLIDO = Target.the("Primer apellido").located(By.id("lastname"));
    public static final Target COMPANIA = Target.the("Nombre de la empresa").located(By.id("company"));
    public static final Target DIRECCION = Target.the("Direccion").located(By.id("address1"));
    public static final Target DIRECCION_2 = Target.the("Complemento de la direccion").located(By.id("address2"));
    public static final Target CIUDAD = Target.the("Ciudad").located(By.id("city"));
    public static final Target ESTADO = Target.the("Estado").located(By.id("id_state"));
    public static final Target CODIGO_POSTAL = Target.the("Codigo postal").located(By.id("postcode"));
    public static final Target PAIS = Target.the("Pais").located(By.id("id_country"));
    public static final Target INFORMACION_ADICIONAL = Target.the("Informacion adicional").located(By.id("other"));
    public static final Target TELEFONO = Target.the("Telefono").located(By.id("phone"));
    public static final Target CELULAR = Target.the("Celular").located(By.id("phone_mobile"));
    public static final Target SEGUNDA_DIRECCION = Target.the("Segunda direccion").located(By.id("alias"));
    public static final Target BOTON_REGISTRAR = Target.the("Boton registrar").located(By.id("submitAccount"));
}
