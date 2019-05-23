package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {
    private co.com.sofka.userinterface.AbrirNavegador abrirNavegador;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirNavegador));
    }

    public static AbrirNavegador inicio() {

        return Tasks.instrumented(AbrirNavegador.class);
    }
}
