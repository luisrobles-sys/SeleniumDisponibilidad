package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
    private WebDriver driver;
    private WebDriverWait wait;

    //@FindBy(linkText = "Sign In") private WebElement lnk_signIn;  //Generador
    @FindBy(xpath = "/html/body/app-root/app-header/nav/div/ul/li/a") private WebElement lbl_login;
    //@FindBy (linkText = "Check Credit Card Limit") private WebElement lnk_checkCredit;


    public MenuPage(WebDriver d) {      //Constructor
        driver = d;
        wait = new WebDriverWait(driver,30); //30 segundos de espera
        PageFactory.initElements(driver,this);
    }

    public void clickSignIn(){
        //Espera que cargue la pagina con el wait
        wait.until(ExpectedConditions.elementToBeClickable(lbl_login));
        lbl_login.click();
    }



    //public void clickCheckCredit(){        //Wait ya ingresó anteriormente
    //    lnk_checkCredit.click();
    //}



}
