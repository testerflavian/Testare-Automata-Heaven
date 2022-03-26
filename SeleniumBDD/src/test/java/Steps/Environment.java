package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Environment {
    private static WebDriver driver;    // exista3 modificatori de acces: privat(limiteaza accesul metodei sau variabilei doar la clasa curenta)
    // protected - limiteaza ccesul metodei sau variabilei doar la pachetul curent
    // public - variabila sau metoda poate fi accesat de oriunde
    //am definit variabila driver care sa ne stocheze instanta in care va rula driverul
    //am folosit keywordul static pt a putea accesa variabila driver prin intermediul clasei
    @Before   // tagul Before anunta sistemul ca urmatoarea metoda care este scrisa, trebuie sa fie executata inainte de toate testele
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();  //pornire driver
    }
    @After                                      //anunta sistemul ca urmatorul set de instructiuni trebuie sa fie executat dupa
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }

    public static  WebDriver getDriver(){
        //metoda getDriver este folosita pt a trimite catre exterior variabila privata driversi este declarata statica pt a putea fi accesata prin intermediul clasei
        return driver;
    }
    //o metoda/functie este un set de instructiuni grupate sub un anumit nume
    //atunci cand vrem sa executam instructiunea respectiva nu trebuie sa le rescriem ci doar sa specificam sistemului numele sub care se gasesc
}