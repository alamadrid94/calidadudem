package com.co.pyxis.automatizacion.page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.ramajudicial.gov.co")
public class RamaJudicialInicioPage extends PageObject {

    public static final Target BTN_CONSULTAR = Target.the("Boton consulta de procesos").locatedBy("//*[text()=' Consulta de Procesos ']");

}
