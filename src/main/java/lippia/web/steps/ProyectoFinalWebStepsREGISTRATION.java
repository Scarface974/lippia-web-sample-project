package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutomationPracticeServiceREGISTRATION;

public class ProyectoFinalWebStepsREGISTRATION extends PageSteps {



    @When("el usuario hace click en la seccion My Account")
    public void elUsuarioHaceClickEnMyAccount() {
        AutomationPracticeServiceREGISTRATION.hacerClickMyAccount();
    }

    @And("el usuario ingresa  (.*)  en el campo Email address de la seccion Register$")
    public void elUsuarioIngresaEmailEnElCampoEmailAddressDeLaSeccionRegister(String email) {
        AutomationPracticeServiceREGISTRATION.ingresoEmail(email);
    }

    @And("el usuario ingresa  (.*) en el campo Password de la seccion Register$")
    public void elUsuarioIngresaPasswordEnElCampoPasswordDeLaSeccionRegister(String password) {
        AutomationPracticeServiceREGISTRATION.ingresoPassword(password);
    }

    @And("el usuario hace click en el boton REGISTER")
    public void elUsuarioHaceClickEnElBotonREGISTER() {
        AutomationPracticeServiceREGISTRATION.hacerClickREGISTRAR();
    }


    @Then("el usuario visualiza un mensaje Error: Please enter an account password.")
    public void elUsuarioVisualizaUnMensajeErrorAUserCouldNotBeFoundWithThisEmailAddress() {
        AutomationPracticeServiceREGISTRATION.comprobarMensajeErrorPassword();
    }


    @Then("el usuario visualiza un mensaje Error: Please provide a valid email address.")
    public void elUsuarioVisualizaUnMensajeErrorPleaseProvideAValidEmailAddress() {
        AutomationPracticeServiceREGISTRATION.comprobarMensajeErrorCamposVacio();
    }


}

















