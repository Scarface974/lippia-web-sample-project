package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.AutomationConstants_LOGIN;
import lippia.web.constants.AutomationConstants_REGISTRATION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AutomationPracticeServiceREGISTRATION {


    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void hacerClickMyAccount(){
        click(AutomationConstants_REGISTRATION.MI_CUENTA);

    }

    public static void ingresoEmail(String email){
        setInput(AutomationConstants_REGISTRATION.EMAIL_REGISTRO,email);

    }

    public static void ingresoPassword(String password){
        setInput(AutomationConstants_REGISTRATION.PASSWORD_REGISTRO,password);

    }

    public static void hacerClickREGISTRAR(){
        click(AutomationConstants_REGISTRATION.BUTTON_REGISTRAR);

    }

    public static void comprobarMensajeErrorPassword(){
        WebElement elemento = DriverManager.getDriverInstance().findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li"));
        String textoDelElemento = elemento.getText();
        String textoEsperado = "Error: Please enter an account password."; // Reemplaza con el texto que deseas comparar

       // Usar un assert para verificar si los textos son iguales
        assert textoDelElemento.equals(textoEsperado) : "Los textos no coinciden. Texto esperado: " + textoEsperado + ", Texto real: " + textoDelElemento;

    }

    public static void comprobarMensajeErrorCamposVacio(){
        WebElement elemento = DriverManager.getDriverInstance().findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li"));
        String textoDelElemento = elemento.getText();
        String textoEsperado = "Error: Please provide a valid email address."; // Reemplaza con el texto que deseas comparar

        // Usar un assert para verificar si los textos son iguales
        assert textoDelElemento.equals(textoEsperado) : "Los textos no coinciden. Texto esperado: " + textoEsperado + ", Texto real: " + textoDelElemento;

    }


    public static void signOutLogin(){
        click(AutomationConstants_LOGIN.SiGN_OUT);
    }

    public static void visualizarMyAccount(){
        WebElement elemento = DriverManager.getDriverInstance().findElement(By.xpath("//*[@id=\"themify_builder_content-22\"]/div[1]/div"));
        assert elemento.isDisplayed() : "El elemento no se encuentra visible en la pantalla.";
    }

    public static void clickIconHome(){
        click(AutomationConstants_LOGIN.LOGO_HOME);
    }








    }
