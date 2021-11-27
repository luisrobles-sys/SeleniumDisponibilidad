package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class Login {
    private WebDriver driver;
    private WebDriverWait wait;

    //protected static String tarjeta, cvv, mes, anio, monto;       //Es otra forma.
    protected static String usuario;
    protected static String password;

    @FindBy (xpath = "//*[@id=\"username\"]") private WebElement input_usuario;
    @FindBy (xpath = "//*[@id=\"password\"]") private WebElement input_password;

    //@FindBy(xpath = "//h4[1]")  private WebElement lbl_tarjeta;
    //@FindBy(xpath = "//h4[2]")  private WebElement lbl_cvv;

    public Login(WebDriver d){

        driver=d;
        wait= new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }

    public void CambiarVentana() {
        int ventana = 0;
        Set<String> identificadores = driver.getWindowHandles();         //Todos los identificadores de cada ventana
        for (String identificador : identificadores) {
            ventana++;
            driver.switchTo().window(identificador);
            System.out.println(ventana + " : " + identificador);
        }
    }

    public void Login(){
        wait.until(ExpectedConditions.visibilityOf(input_usuario));
        input_usuario.sendKeys(Login.usuario);
    }


//    public void ClickBtn (){
//        btn_submit.click();
//    }


}

