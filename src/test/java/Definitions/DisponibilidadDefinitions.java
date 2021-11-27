package Definitions;

import PageObjects.Login;
import PageObjects.MenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DisponibilidadDefinitions {

    MenuPage menu;
    Login logincoordinador;
    Login logindocente;

    public DisponibilidadDefinitions() {
        menu = new MenuPage(Hooks.driver);
        logincoordinador = new Login(Hooks.driver);
        logindocente = new Login(Hooks.driver);

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

    @And("colocamos los datos correctos del docente")
    public void colocamosLosDatosCorrectosDelDocente() {
        logindocente.ingresarDatosCorrectosDocente();

    }

    @And("colocamos los datos incorrectos del docente")
    public void colocamosLosDatosIncorrectosDelDocente() {
        logindocente.ingresarDatosIncorrectosDocente();
    }

    @When("le doy en el boton de Login")
    public void leDoyEnElBotonDeLogin() {
        logincoordinador.ClickBtnLogin();

    }

}
