package co.com.certificacion.stepdefinitions;

import co.com.certificacion.tasks.IngresarIAInformacionCorporativa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TratamientoDatosProveedorStepDefinition {

    @Dado("^Que el proveedor se encuentra dentro de informacion corporativa del portal web$")
    public void queElProveedorSeEncuentraDentroDeInformacionCorporativaDelPortalWeb()  {
        theActorInTheSpotlight().attemptsTo(IngresarIAInformacionCorporativa.conClick());
    }


    @Cuando("^Ingreso al menu proveedores$")
    public void ingresoAlMenuProveedores() throws Exception {

    }

    @Cuando("^Consulto el archivo de politicas de tratemiento y proteccion de datos personales de proveedores$")
    public void consultoElArchivoDePoliticasDeTratemientoYProteccionDeDatosPersonalesDeProveedores()  {

    }

    @Entonces("^Visualizo en una nueva ventana el archivo de tarifas$")
    public void visualizoEnUnaNuevaVentanaElArchivoDeTarifas()  {

    }

}
