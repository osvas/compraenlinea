package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.sofka.userinterface.Autenticacion.MENSAJE_DE_ERROR;

public class ElMensajeDeValidacion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(MENSAJE_DE_ERROR).viewedBy(actor).asString();
    }

    public static ElMensajeDeValidacion es() {

        return new ElMensajeDeValidacion();
    }
}
