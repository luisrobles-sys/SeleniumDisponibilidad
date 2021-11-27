package Definitions;

import PageObjects.Login;
import PageObjects.MenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DisponibilidadDefinitions {

    MenuPage menu;
    Login logincoordinador;

    public DisponibilidadDefinitions() {
        menu = new MenuPage(Hooks.driver);
        logincoordinador = new Login(Hooks.driver);

    }

    @Given("que tengo un MS de mantenimiento de usuarios")
    public void queTengoUnMSDeMantenimientoDeUsuarios() {
        Hooks.driver.get("http://67.219.137.139/");
    }

    @When("doy click en el boton de Sign In")
    public void doyClickEnElBotonDeLogin() {
        menu.clickSignIn();
    }

    @And("colocamos los datos correctos del coordinador")
    public void colocamosLosDatosCorrectosDelCoordinador() {
        logincoordinador.ingresarDatosCorrectosCoordinador();
    }

    @And("colocamos los datos incorrectos del coordinador")
    public void colocamosLosDatosIncorrectosDelCoordinador() {
        logincoordinador.ingresarDatosIncorrectosCoordinador();
    }

    @When("le doy en el boton de Login")
    public void leDoyEnElBotonDeLogin() {
        logincoordinador.ClickBtnLogin();

    }


}
