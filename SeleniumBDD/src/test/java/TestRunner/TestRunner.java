package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)            //testRunner ruleaza cu clasa Cucumber
@CucumberOptions(
        features = {"features"},   //numele folderului features, daca avea alta denumire, se scria denumirea respectiva
        // aceasta instructiune specifica unde poate sistemul sa gaseasca folderul cu features files
        glue = {"Steps"},                            //aceasta instructiune specifica unde sa gasim fisierele de steps definition
        //plugin = {"pretty", "html:reports.html"},   //aceasta instructiune specifica formatul raportului care se va genera (html) si numele raportului (reports.html), pretty - pt a fi aranjat frumos
        plugin = {"pretty", "html:reports/reports.html"}, //aceasta instr. specifica formatul raportului impreuna cu folderul in care trebuie sa se genereze
        // daca folderul nu exista, va fi creat automat
        //plugin = {"pretty", "json:reports/reports.json"} //aceasta inst. genereaza raportul in formatul json
        //plugin = {"pretty", "junit:reports/reports.junit"} //aceasta inst. genereaza raportul in formatul junit
        dryRun = false, // daca este true, nu se va rula cod si se va verifica daca toate fisierele de features au un fisier corespondent de steps
        monochrome = false //elimina info redundante din consola
       // ,tags = "@P1"      //ruleaza doar testele care sunt marcate cu tagul T1, se poate schimba in functie de ce dorim sa rulam
        //,name = "count"     //aceasta inst. ruleaza testele care au acest keyword in numele scenariului
)
public class TestRunner {}