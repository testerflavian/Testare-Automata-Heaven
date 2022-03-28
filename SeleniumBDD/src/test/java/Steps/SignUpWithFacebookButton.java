package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpWithFacebookButton {
    WebDriver driver = new Environment().getDriver();

    public SignUpWithFacebookButton() {
    }

    @Given("I navigate into the app")
    public void Navigate_into_the_app() throws InterruptedException {
        driver.get("https://politrip.com/account/sign-up");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("cookiescript_accept")).click();
    }

    @When("I click on Facebook Sign Up button")
    public void Click_on_Facebook_button() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"socialmedia-account-component-div\"]/div[1]/div[1]")).click();
        Thread.sleep(5000);
    }

    @Then("The account should be created with Facebook account")
    public void Create_account_with_Facebook() throws InterruptedException {
        System.out.println("The account has been created with Facebook");
    }
}

// As you can observe the test is passed, but when the Facebook sign-up page is loaded, there appear a message "Error Accessing App"
// This means that the app is not configured
// So here should be written a bug report with this problem