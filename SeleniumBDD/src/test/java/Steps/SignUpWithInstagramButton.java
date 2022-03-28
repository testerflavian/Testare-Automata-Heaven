package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpWithInstagramButton {
    WebDriver driver = new Environment().getDriver();

    public SignUpWithInstagramButton() {
    }

    @Given("I navigate into the app that I am testing")
    public void Navigate_into_the_app() throws InterruptedException {
        driver.get("https://politrip.com/account/sign-up");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("cookiescript_accept")).click();
    }

    @When("I click on Instagram Sign Up button")
    public void Click_on_Instagram_button() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        Thread.sleep(1000);
        driver.findElement(By.id("socialmedia-account-instagram-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/button[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("testerflavian@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("TesterFlavian!!");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
        Thread.sleep(3000);

    }

    @Then("The account should be created with Instagram account")
    public void Create_account_with_Instagram() throws InterruptedException {
        System.out.println("The account has been created with Instagram");
    }
}

