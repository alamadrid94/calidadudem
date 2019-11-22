package com.co.pyxis.automatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/consultar_procesos.feature",
        glue = {"com.co.pyxis.automatizacion.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class ConsultarProcesosRunner {
}
