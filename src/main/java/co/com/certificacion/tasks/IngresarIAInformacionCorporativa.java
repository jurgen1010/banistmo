package co.com.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.userinterfaces.Home.ACERCA_DE_NOSOTROS;
import static co.com.certificacion.userinterfaces.Home.INFORMACION_CORPORATIVA;

public class IngresarIAInformacionCorporativa implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(ACERCA_DE_NOSOTROS, WebElementStateMatchers.isNotPresent()).forNoMoreThan(5).seconds();
        actor.attemptsTo(Click.on(ACERCA_DE_NOSOTROS));
        actor.attemptsTo(Click.on(INFORMACION_CORPORATIVA));
    }

    public static IngresarIAInformacionCorporativa conClick(){
        return Tasks.instrumented(IngresarIAInformacionCorporativa.class) ;
    }
}
