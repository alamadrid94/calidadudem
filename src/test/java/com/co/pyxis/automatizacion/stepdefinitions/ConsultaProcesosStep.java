package com.co.pyxis.automatizacion.stepdefinitions;

import com.co.pyxis.automatizacion.page.RamaJudicialInicioPage;
import com.co.pyxis.automatizacion.question.Texto;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.pyxis.automatizacion.page.ConsultaProcesosPage.*;
import static com.co.pyxis.automatizacion.page.RamaJudicialInicioPage.BTN_CONSULTAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.hamcrest.CoreMatchers.containsString;

public class ConsultaProcesosStep {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que \"(.*)\" esta consultando un proceso judicial")
    public void queEstaConsultandoUnProcesoJudicial(String nombre) {
        theActorCalled(nombre).attemptsTo(
                Open.browserOn().the(RamaJudicialInicioPage.class),
                Scroll.to(BTN_CONSULTAR).andAlignToBottom(),
                Click.on(BTN_CONSULTAR)
        );
    }

    @Cuando("selecciona ciudad \"(.*)\", entidad \"(.*)\" y numero de radicado \"(.*)\"")
    public void ingresarCiudadEntidadRadicado(String ciudad, String entidad, String radicado) {
        theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byVisibleText(ciudad).from(SELECT_CIUDAD),
                SelectFromOptions.byVisibleText(entidad).from(SELECT_ENTIDAD),
                Enter.theValue(radicado).into(SELECT_NRO_RADICADO)
        );
    }

    @Entonces("debe poder activar la consulta")
    public void debePoderActivarLaConsulta() {
        theActorInTheSpotlight().should(seeThat("The displayed username - REPORTSERENITY", Texto.barra(),containsString("Deslice la barra a la derecha para iniciar la consulta.")));
    }

}
