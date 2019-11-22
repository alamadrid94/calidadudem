package com.co.pyxis.automatizacion.page;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConsultaProcesosPage extends PageObject {
    public static final Target SELECT_CIUDAD = Target.the("Select Box de Ciudad").located(By.id("ddlCiudad"));
    public static final Target SELECT_ENTIDAD = Target.the("Select Box de Entidad").located(By.id("ddlEntidadEspecialidad"));
    public static final Target SELECT_NRO_RADICADO = Target.the("Select Box de Entidad").located(By.xpath("//div[@id='divNumRadicacion']//tr[.//h1[contains(.,'Número de Radicación')]]/following-sibling::tr[1]//input"));
    public static final Target TEXT_BARRA = Target.the("Text barra").located(By.id("ConsultarNum"));
}
