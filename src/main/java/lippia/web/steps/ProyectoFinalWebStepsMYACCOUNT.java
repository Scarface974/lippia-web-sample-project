package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.AutomationPracticeServiceMYACCOUNT;

public class ProyectoFinalWebStepsMYACCOUNT extends PageSteps {

    @And("el usuario hace click en Account Details")
    public void elUsuarioHaceClickEnAccountDetails() {
        AutomationPracticeServiceMYACCOUNT.clickDetalleCuenta();
    }


    @Then("el usuario viusaliza los detalles de su cuenta")
    public void elUsuarioViusalizaLosDetallesDeSuCuenta() {
        AutomationPracticeServiceMYACCOUNT.visualizarDetalleMyAccount();
    }



}

















