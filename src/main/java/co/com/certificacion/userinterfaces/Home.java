package co.com.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    public static final Target ACERCA_DE_NOSOTROS = Target.the("Acerca de nosotros")
            .locatedBy("//ul[@id='menu-sup']/li/a[text() ='Acerca de Nosotros']");


    public static final Target INFORMACION_CORPORATIVA = Target.the("Informacion Corporativa")
            .locatedBy("//*[@id='serv']");

    public static final Target PROVEEDORES = Target.the("Proveedores")
            .locatedBy("//*[@id='menu-sup']/li[4]/ul/div/div/div[1]/div/div[2]/div[2]/div/a");

}
