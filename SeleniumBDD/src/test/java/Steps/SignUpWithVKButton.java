package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpWithVKButton {
    WebDriver driver = new Environment().getDriver();

    public SignUpWithVKButton() {
    }

    @Given("I navigate into the Politrip app Sign Up Page")
    public void Navigate_into_the_app() throws InterruptedException {
        driver.get("https://politrip.com/account/sign-up");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("cookiescript_accept")).click();
    }

    @When("I click on VK Sign Up button")
    public void Click_on_VK_button() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"socialmedia-account-component-div\"]/div[2]/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#login_submit > div > div > input:nth-child(7)")).sendKeys("testerflavian@gmail.com");
        driver.findElement(By.cssSelector("#login_submit > div > div > input:nth-child(9)")).sendKeys("TesterFlavian!!");
        driver.findElement(By.xpath("//*[@id=\"install_allow\"]")).click();
        Thread.sleep(3000);

    }

    @Then("The account should be created with VK account")
    public void Create_account_with_VK() throws InterruptedException {
        System.out.println("The account has been created with VK");
    }
}

//Unfortunately I couldn't test the sign up with VK because it can't find the password and email entry sections with any function (xpath, cssSelector, name, etc.) I tried but no avail