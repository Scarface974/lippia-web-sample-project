package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.AutomationPracticeServiceSHOP;

public class ProyectoFinalWebStepsSHOP extends PageSteps {


/*--------------------------------Proyecto Final  HOME-PAGE - Escenario 1 Pagina de inicio con tres Arrivals------------------------------------------------- */




    @Then("se visualiza los detalles del pedido")
    public void seVisualizaLosDetallesDelPedido() {
        AutomationPracticeServiceSHOP.visualizarOrderDetail();
    }

    @And("el usuario ingresa el pais India en el campo Country")
    public void elUsuarioIngresaElPaisIndiaEnElCampoCountry()throws InterruptedException {
        AutomationPracticeServiceSHOP.SelectCountry2();
    }

    @And("el usuario ingresa Rajasthan en el campo State \\/ County$")
    public void elUsuarioIngresaRajasthanEnElCampoStateCounty()throws InterruptedException {
        AutomationPracticeServiceSHOP.SelectState_Country2();
        
    }

    @Then("el usuario visualiza la taza de impuesto correspondiente a la India")
    public void elUsuarioVisualizaLaTazaDeImpuestoCorrespondienteASuPais() {
        AutomationPracticeServiceSHOP.verificarImpuestoIndia();

    }

    @Then("el usuario visualiza la taza de impuesto correspondiente al extranjero$")
    public void elUsuarioVisualizaLaTazaDeImpuestoExtranjero() {
        AutomationPracticeServiceSHOP.verificarImpuestoExtranjero();

    }




    /*------------------------------------------------------------------------------------------------------------------------------------ */









}

















