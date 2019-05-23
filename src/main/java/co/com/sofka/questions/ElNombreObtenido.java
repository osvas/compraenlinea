package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.sofka.userinterface.Home.NOMBRE;

public class ElNombreObtenido implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(NOMBRE).viewedBy(actor).asString();
    }

    public static ElNombreObtenido es() {
        return new ElNombreObtenido();
    }
}
