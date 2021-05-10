package co.com.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    public static final Target ACERCA_DE_NOSOTROS = Target.the("Acerca de nosotros")
            .located(By.id("header-nosotros"));


    public static final Target INFORMACION_CORPORATIVA = Target.the("Informacion Corporativa")
            .locatedBy("//*[@id='serv']");
}
