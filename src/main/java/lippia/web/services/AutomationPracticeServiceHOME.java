package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.AutomationConstants_HOME;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static junit.framework.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AutomationPracticeServiceHOME {
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickProducto(){click(AutomationConstants_HOME.PRODUCTO_HOME);}

    public static void clickBotonShop() {click(AutomationConstants_HOME.BUTTON_SHOP);}

    public static void clickBotonHome() {click(AutomationConstants_HOME.BUTTON_HOME);}


    public static void scroll() throws InterruptedException {
        WebDriver driver = DriverManager.getDriverInstance();

        driver.getCurrentUrl();

        if (driver instanceof JavascriptExecutor) {
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("window.scrollBy(0, 700);");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void visualizarArrivals ()  {

        DriverManager.getDriverInstance().getCurrentUrl();

        WebElement container = DriverManager.getDriverInstance().findElement((By.xpath("//*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]")));
        List<WebElement> elements = container.findElements(By.xpath("./*"));

        int totalElements = 3;
        int count = 0;

        for (WebElement element : elements) {
            count++;
        }

        System.out.println("Total elements: " + totalElements);
        System.out.println("Image elements: " + count);

        boolean equal = totalElements == count;
        System.out.println("Equal elements and images: " + equal);
        assert equal == true;





        DriverManager.getDriverInstance().close();

    }

    public static void clickAddToBasket(){click(AutomationConstants_HOME.ADD_TO_BASKET);}

    public static void clickCarrito(){click(AutomationConstants_HOME.CARRITO_MENU);}

    public static void visualizarProductoCarrito()throws InterruptedException{
        DriverManager.getDriverInstance().getCurrentUrl();
        WebElement parrafo = DriverManager.getDriverInstance().findElement((By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[3]/a")));

        Assert.assertTrue(parrafo.isDisplayed());
    }

    public static void clickProceedToCheckout(){click(AutomationConstants_HOME.PROCED_TO_CHECKOUT_BUTTON);}

    public static void clickCodeCupon()throws InterruptedException{
        click(AutomationConstants_HOME.CUPON_CODE);
        Thread.sleep(5000);
    }

    public static void CodeCupon(){

        DriverManager.getDriverInstance().getCurrentUrl();
        WebElement cupon = DriverManager.getDriverInstance().findElement((By.xpath("//*[@id=\"page-35\"]/div/div[1]/form[2]")));

        Assert.assertTrue(cupon.isDisplayed());

    }

    public static void BillingDetails(){

        DriverManager.getDriverInstance().getCurrentUrl();
        WebElement factura = DriverManager.getDriverInstance().findElement((By.xpath("//*[@id=\"customer_details\"]/div[1]/div")));

        Assert.assertTrue(factura.isDisplayed());
    }

    public static void AdditionalInformation(){
        DriverManager.getDriverInstance().getCurrentUrl();
        WebElement informacion = DriverManager.getDriverInstance().findElement((By.xpath("//*[@id=\"customer_details\"]/div[2]/div")));

        Assert.assertTrue(informacion.isDisplayed());

    }

    public static void YourOrder(){
        DriverManager.getDriverInstance().getCurrentUrl();
        WebElement informacion = DriverManager.getDriverInstance().findElement((By.xpath("//*[@id=\"order_review\"]")));

        Assert.assertTrue(informacion.isDisplayed());

    }

    public static void ingresoNombre(String nombre){
        setInput(AutomationConstants_HOME.FIRST_NAME,nombre);

    }

    public static void ingresoApellido(String apellido){
        setInput(AutomationConstants_HOME.LAST_NAME,apellido);

    }

    public static void ingresoCompañia(String compañia){
        setInput(AutomationConstants_HOME.COMPANY_NAME,compañia);


    }

    public static void ingresoEmail(String email){
        setInput(AutomationConstants_HOME.EMAIL_ADDRESS,email);

    }

    public static void ingresoTelefono(String telefono){
        setInput(AutomationConstants_HOME.PHONE,telefono);

    }

    public static void clickCountryDesplegable()throws InterruptedException{
        click(AutomationConstants_HOME.COUNTRY_DESPLEGABLE);
        Thread.sleep(3000);
    }


    public static void SelectCountry()throws InterruptedException{

        WebDriver driver = DriverManager.getDriverInstance();
        WebElement parentElement = driver.findElement(By.xpath("//*[@id=\"select2-results-1\"]"));


        java.util.List<WebElement> childElements = parentElement.findElements(By.tagName("li"));


        if (childElements.size() >= 10) {

            WebElement secondElement = childElements.get(10);
            secondElement.click();
        } else {
            System.out.println("No hay suficientes elementos");
        }
        Thread.sleep(3000);





    }

    public static void ingreso_Direcc(String direccion){
        setInput(AutomationConstants_HOME.ADDRESS,direccion);

    }

    public static void ingreso_Direcc2(String direccion2){
        setInput(AutomationConstants_HOME.ADDRESS2,direccion2);

    }

    public static void ingreso_TownCity(String pueblo_ciudad){
        setInput(AutomationConstants_HOME.TOWN_CITY,pueblo_ciudad);

    }

    public static void clickDesplegableStateCountry()throws InterruptedException{
        click(AutomationConstants_HOME.STATE_COUNTRY_DESPLEGABLE);
        Thread.sleep(5000);
    }

    public static void SelectState_Country()throws InterruptedException{

        WebDriver driver = DriverManager.getDriverInstance();
        WebElement parentElement = driver.findElement(By.xpath("//*[@id=\"select2-results-2\"]"));


        java.util.List<WebElement> childElements = parentElement.findElements(By.tagName("li"));


        if (childElements.size() >= 6) {

            WebElement secondElement = childElements.get(6);
            secondElement.click();
        } else {
            System.out.println("No hay suficientes elementos");
        }
        Thread.sleep(3000);


    }


    public static void ingreso_PostCode(String postcode){
        setInput(AutomationConstants_HOME.POSTCODE,postcode);

    }

    public static void clickPlaceOrder()throws InterruptedException{
        click(AutomationConstants_HOME.PLACE_ORDER_BUTTON);
        Thread.sleep(5000);
    }





    /*----------------------------------------------------------------------------------------------------------------------------------*/
    public static void enterSearchCriteria(String text) {
        setInput(AutomationConstants_HOME.INPUT_SEARCH_XPATH, text);
    }

    public static void clickSearchButton() {click(AutomationConstants_HOME.SEARCH_BUTTON_NAME);
    }





    public static void clickFirstSlider(){click(AutomationConstants_HOME.IMAGE_SLIDER1);}















    public static void ingresarRegistar(){click(AutomationConstants_HOME.MI_CUENTA);}

    public static void ingresarEmail(){
        WebElement elemento = DriverManager.getDriverInstance().findElement(By.cssSelector(AutomationConstants_HOME.EMAIL_REGISTRO));
        elemento.sendKeys("ScarfaceUltra123@gmail.com");
    }

    public static void ingresarPassword(){
        WebElement elemento = DriverManager.getDriverInstance().findElement(By.cssSelector(AutomationConstants_HOME.PASSWORD_REGISTRO));
        elemento.sendKeys("Scarface18001432114**");
    }

    public static void mensajeBienvenido(){
        WebElement elemento = DriverManager.getDriverInstance().findElement(By.cssSelector(AutomationConstants_HOME.MENSAJE_BIENVENIDA));


        assertTrue(elemento.isDisplayed(), "El elemento no es visible.");


        elemento.click();
    }

    public static void ingresarEmailVacio(){
        WebElement elemento = DriverManager.getDriverInstance().findElement(By.cssSelector(AutomationConstants_HOME.EMAIL_REGISTRO));
        elemento.sendKeys("");
    }

    public static void mensajeError(){
        WebElement elemento = DriverManager.getDriverInstance().findElement(By.cssSelector(AutomationConstants_HOME.ERROR_MENSAJE));
        String textoDelElemento = elemento.getText();
        String textoEsperado = "Texto esperado"; // Reemplaza con el texto que deseas comparar

// Usar un assert para verificar si los textos son iguales
        assertEquals(textoDelElemento, textoEsperado, "Texto incorrecto");

    }


    public static void hacacerClickRegistrar(){click(AutomationConstants_HOME.BUTTON_REGISTRAR);}






        public static void clickCountryBuscador(String buscador){
        setInput(AutomationConstants_HOME.BUSCADOR_COUNTRY,buscador);
         }

        public static void clickCountry(){click(AutomationConstants_HOME.COUNTRY_ARGENTINA);}





















    }
