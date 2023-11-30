package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutomationPracticeServiceHOME;

public class ProyectoFinalWebStepsHOME extends PageSteps {


/*--------------------------------Proyecto Final  HOME-PAGE - Escenario 1 Pagina de inicio con tres Arrivals------------------------------------------------- */


    @Given("que el usuario se encuentra en el sitio Automation-Practice")
    public void queElUsuarioSeEncuentraEnElSitioAutomationPractice() {
        AutomationPracticeServiceHOME.navegarWeb();
    }

    @When("el usuario hace click en el boton Shop")
    public void hagoClickEnElBotonShop() {
        AutomationPracticeServiceHOME.clickBotonShop();
    }

    @And("el usuario hace click en el boton Menu")
    public void hagoClickEnElBotonMenu()  {
        AutomationPracticeServiceHOME.clickBotonHome();
    }

    @And("el usuario realiza un scroll hasta abajo")
    public void hagoUnScrollHastaAbajo() throws InterruptedException {
        AutomationPracticeServiceHOME.scroll();
    }

    @And("el usuario visualiza los tres arrivals")
    public void seVisualizaLosTresArrivals()  {
        AutomationPracticeServiceHOME.visualizarArrivals();
    }


    /*------------------------------------------------------------------------------------------------------------------------------------ */

    /*-------------------------------------------Proyecto Final  HOME-PAGE - Escenario 2 Agregar producto al carrito------------------------*/

    @When("el usuario hace click en un producto")
    public void hagoClickEnUnProducto() {
        AutomationPracticeServiceHOME.clickProducto();
    }

    @And("el usuario hace click en add to basket")
    public void hagoClickEnAddToBasket() {
        AutomationPracticeServiceHOME.clickAddToBasket();
    }

    @And("el usuario hace click en el carrito")
    public void hagoClickEnElCarrito() {
        AutomationPracticeServiceHOME.clickCarrito();
    }

    @Then("se visualiza el producto en el carrito")
    public void seVisualizaElProductoEnElCarrito() throws InterruptedException {
        AutomationPracticeServiceHOME.visualizarProductoCarrito();
    }

    /*------------------------------------------------------------------------------------------------------------------------------------ */

    /*----------------------------------------Proyecto Final  HOME-PAGE - Escenario 3 Visualizar Detalles de Compra----------------------- */

    @And("el usuario hace click en el boton PROCEED TO CHECKOUT")
    public void hagoClickEnElBotonPROCEEDTOCHECKOUT() {
        AutomationPracticeServiceHOME.clickProceedToCheckout();
    }

    @And("el usuario hace click en el texto Click here to enter your code")
    public void hagoClickEnElTextoClickHereToEnterYourCode()throws InterruptedException {
        AutomationPracticeServiceHOME.clickCodeCupon();
    }

    @Then("el usuario visualiza los detalles para el ingreso del cupon")
    public void seVisualizaLosDetallesParaElIngresoDelCupon() {

        AutomationPracticeServiceHOME.CodeCupon();
    }

    @And("el usuario visualiza los detalles de facturacion")
    public void seVisualizaLosDetallesDeFacturacion() {

        AutomationPracticeServiceHOME.BillingDetails();
    }


    @And("el usuario visualiza informacion adicional")
    public void seVisualizaInformacionAdicional() {

        AutomationPracticeServiceHOME.AdditionalInformation();
    }


    @And("el usuario visualiza detalles de pago")
    public void seVisualizaDetallesDePago() {

        AutomationPracticeServiceHOME.YourOrder();
    }

    /*------------------------------------------------------------------------------------------------------------------------------------ */

    /*----------------------------------------Proyecto Final  HOME-PAGE - Escenario 4 Realizar Pedido------------------------------------- */

    @And("el usuario ingresa (.*) en el campo First Name$")
    public void elUsuarioIngresaNombre(String nombre) {
        AutomationPracticeServiceHOME.ingresoNombre(nombre);
    }

    @And("el usuario ingresa (.*) en el campo Last Name$")
    public void elUsuarioIngresaApellido(String apellido) {
        AutomationPracticeServiceHOME.ingresoApellido(apellido);
    }

    @And("el usuario ingresa (.*) en el campo Company Name$")
    public void elUsuarioIngresaCompañia(String compañia) {
        AutomationPracticeServiceHOME.ingresoCompañia(compañia);
    }

    @And("el usuario ingresa (.*) en el campo Email Address$")
    public void ingresoEmail(String email) {
        AutomationPracticeServiceHOME.ingresoEmail(email);
    }

    @And("el usuario ingresa (.*) en el campo Phone$")
    public void ingresoTelefono(String telefono) {
        AutomationPracticeServiceHOME.ingresoTelefono(telefono);
    }

    @And("el usuario hace click en el desplegabe de Country")
    public void hagoClickEnElDesplegabeDePais()throws InterruptedException {
        AutomationPracticeServiceHOME.clickCountryDesplegable();
    }

    @And("el usuario ingresa el pais Argentina")
    public void ingresoElPaisArgentina()throws InterruptedException {
        AutomationPracticeServiceHOME.SelectCountry();
    }

    @And("^el usuario ingresa (.*) en el campo Street address$")
    public void ingresoDireccion(String direccion) {
        AutomationPracticeServiceHOME.ingreso_Direcc(direccion);
    }

    @And("^el usuario ingresa (.*) en el campo Apartament,suite,unit etc$")
    public void ingresoDireccion2(String direccion2) {
        AutomationPracticeServiceHOME.ingreso_Direcc2(direccion2);
    }

    @And("^el usuario ingresa  (.*) en el campo Town \\/ City$")
    public void elUsuarioIngresaPueblo_ciudadEnElCampoTownCity(String pueblo_ciudad) {
        AutomationPracticeServiceHOME.ingreso_TownCity(pueblo_ciudad);
    }

    @And("el usuario hace click en el desplegable de State / County$")
    public void hagoClickEnElDesplegabeDeEstadoOPais() throws InterruptedException{
        AutomationPracticeServiceHOME.clickDesplegableStateCountry();
    }

    @And("el usuario ingresa Corrientes en el campo State / County$")
    public void ingresoCorrientes()throws InterruptedException {
        AutomationPracticeServiceHOME.SelectState_Country();

    }

    @And("^el usuario ingresa  (.*) en la campo Postcode \\/ ZIP$")
    public void elUsuarioIngresaPostcodeEnLaCampoPostcodeZIP(String postcode) {
        AutomationPracticeServiceHOME.ingreso_PostCode(postcode);
    }

    @And("el usuario hace click en el boton PLACE ORDER")
    public void hagoClickEnElBotonPLACEORDER()throws InterruptedException {
        AutomationPracticeServiceHOME.clickPlaceOrder();
    }


    /*------------------------------------------------------------------------------------------------------------------------------------ */



    /*-------------------------------------TP_N°3_ REGISTRAR - Escenario 1 Registrar Cuenta -------------------------- */
    @When("hace click en My Account")
    public void haceClickEnMyAccount() {
        AutomationPracticeServiceHOME.ingresarRegistar();
    }

    @And("ingreso correo")
    public void ingresoCorreo() {
        AutomationPracticeServiceHOME.ingresarEmail();
    }

    @And("ingreso password")
    public void ingresoPassword() {
        AutomationPracticeServiceHOME.ingresarPassword();
    }

    @And("hago click en Register")
    public void hagoClickEnRegister() {
        AutomationPracticeServiceHOME.hacacerClickRegistrar();
    }

    @Then("se visualiza un mensaje de bienvenida")
    public void seVisualizaUnMensajeDeBienvenida() {
        AutomationPracticeServiceHOME.mensajeBienvenido();
    }


    /*-------------------------------------Fin Escenario 1 Registrar Cuenta -------------------------- */



    @And("dejo vacio el email")
    public void dejoVacioElEmail() {
        AutomationPracticeServiceHOME.ingresarEmailVacio();
    }

    @Then("se visualiza un mensaje de error")
    public void seVisualizaUnMensajeDeError() {
        AutomationPracticeServiceHOME.mensajeError();
    }
















    @And("ingreso {string}")
    public void ingreso(String compañia) {
        AutomationPracticeServiceHOME.ingresoCompañia(compañia);
    }









    @And("escribo {string}")
    public void escribo(String buscador) {
        AutomationPracticeServiceHOME.clickCountryBuscador(buscador);
    }

















    /*----------------------------------------------------LOGIN--------------------------------------------------*/























































    /*---------------------------------------------Fin de Scenario 1 Sliders--------------------------------------------------------------------------------*/


/*---------------------------------------------Escenario de Prueba---------------------------------------------------------------------------------------*/
   /* @Given("que el usuario se encuentra en la pagina de Automation-Practice")
    public void queElUsuarioSeEncuentraEnLaPaginaDeAutomationPractice() {
        AutomationPracticeService.navegarWeb();
    } */

  /*  @When("hago click en el slider del home page")
    public void hagoClickEnElSliderDelHomePage()  {
        AutomationPracticeService.sliderHome();
    }*/























/*  @When("hace click en el boton {string}")
     public void haceClickEnElBoton(String criteria) {
        AutomationPracticeService.enterSearchCriteria(criteria);
    }  */


}

















