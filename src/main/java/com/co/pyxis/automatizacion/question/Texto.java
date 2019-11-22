package com.co.pyxis.automatizacion.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.pyxis.automatizacion.page.ConsultaProcesosPage.TEXT_BARRA;

public class Texto implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TEXT_BARRA.resolveFor(actor).getText();
    }

    public static Texto barra(){
        return new Texto();
    }
}
