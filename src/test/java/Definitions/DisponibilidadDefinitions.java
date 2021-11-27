package Definitions;

import PageObjects.Login;
import PageObjects.MenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DisponibilidadDefinitions {

    MenuPage menu;
    Login logincoordinador;

    //CapturarDatosTarjetaPage captura;
    //CheckCreditPage credit;

    public DisponibilidadDefinitions() {
        menu = new MenuPage(Hooks.driver);
        //captura = new CapturarDatosTarjetaPage(Hooks.driver);
        //credit = new CheckCreditPage(Hooks.driver);


    }

    @Given("que tengo un MS de mantenimiento de usuarios")
    public void queTengoUnMSDeMantenimientoDeUsuarios() {
        Hooks.driver.get("http://67.219.137.139/");
    }

    @When("doy click en el boton de login")
    public void doyClickEnElBotonDeLogin() {
        menu.clickSignIn();
    }

    @And("colocamos los datos del coordinador")
    public void colocamosLosDatosDelCoordinador() {
    }
}
