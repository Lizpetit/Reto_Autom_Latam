package pa.com.automatizacion.latam.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.automatizacion.latam.userinterface.LatamPagina;

public class LatamStepDefinitions {
    private LatamPagina latamPagina;
    @Before
    public void setState(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario ingresa a la pagina Latam$")
    public void queElUsuarioIngresaALaPaginaLatam()  {
        OnStage.theActorCalled("Usuario").wasAbleTo(Open.browserOn(latamPagina));
    }

    @Cuando("^selecciona la seccion de mis viajes$")
    public void seleccionaLaSeccionDeMisViajes() {

    }

    @Entonces("^deberia validar que el codigo de reserva es de seis digitos$")
    public void deberiaValidarQueElCodigoDeReservaEsDeSeisDigitos() {

    }
}
