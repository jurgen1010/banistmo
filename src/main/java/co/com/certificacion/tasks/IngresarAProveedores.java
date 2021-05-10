package co.com.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.certificacion.userinterfaces.Home.PROVEEDORES;

public class IngresarAProveedores implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PROVEEDORES));
    }

    public static IngresarAProveedores conClick(){
        return Tasks.instrumented(IngresarAProveedores.class) ;
    }
}
