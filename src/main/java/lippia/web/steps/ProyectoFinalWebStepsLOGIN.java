package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutomationPracticeServiceLOGIN;

public class ProyectoFinalWebStepsLOGIN extends PageSteps {




    @When("el usuario hace click en My Account")
    public void elUsuarioHaceClickEnMyAccount() {
        AutomationPracticeServiceLOGIN.hacerClickMyAccount();
    }

    @And("el usuario ingresa  (.*) en el campo Username or email address$")
    public void ingresoEmailIncorrecto(String email) {
        AutomationPracticeServiceLOGIN.ingresoEmail(email);
    }


    @And("el usuario ingresa  (.*) en el campo Password$")
    public void elUsuarioIngresaPasswordEnElCampoPassword(String password) {
        AutomationPracticeServiceLOGIN.ingresoPassword(password);
    }

    @And("el usuario hace click en el boton LOGIN")
    public void elUsuarioHaceClickEnElBotonLOGIN() {
        AutomationPracticeServiceLOGIN.hacerClickLogin();
    }

    @Then("el usuario visualiza un mensaje Error: A user could not be found with this email address.")
    public void elUsuarioVisualizaUnMensajeErrorAUserCouldNotBeFoundWithThisEmailAddress() {
        AutomationPracticeServiceLOGIN.comprobarMensajeErrorEmail();
    }


    @And("el usuario hace click en el texto Sign out")
    public void elUsuarioHaceClickEnElTextoSignOut() {
        AutomationPracticeServiceLOGIN.signOutLogin();
    }

    @And("el usuario hace click en el icono ubicado en la parte superior izquieda")
    public void elUsuarioHaceClickEnElIconoUbicadoEnLaParteSuperiorIzquieda() {
        AutomationPracticeServiceLOGIN.clickIconHome();
    }


    @Then("el usuario visualiza la pagina principal del sitio")
    public void elUsuarioVisualizaLaSeccionHome() {
        AutomationPracticeServiceLOGIN.visualizarMyAccount();
    }










}

















