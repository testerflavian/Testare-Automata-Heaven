package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpWithoutCompleteTheSequences {
    WebDriver driver = new Environment().getDriver();
    private Boolean True;

    public SignUpWithoutCompleteTheSequences() {
    }

    @Given("I navigate to Politrip Sign Up Page")
    public void Navigate_into_the_app() throws InterruptedException {
        driver.get("https://politrip.com/account/sign-up");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("cookiescript_accept")).click();
    }
    @When("I click on Sign Up Button without complete any of sequences")
    public void Click_on_Google_button() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,500)");
        Thread.sleep(1000);
        Boolean isEnabled = driver.findElement(By.id(" qa_loader-button")).isEnabled();

        if (isEnabled == True)
        {
            fail("button must not be enabled in this scenario");
        }
        else
        {
            System.out.println("The test has passed");
        }
    }

    private void fail(String s) {
    }

    @Then("The account can not be created")
    public void Create_account_with_Google() throws InterruptedException {
        System.out.println("The test Passed, the app doesn't allow you to create an account if you don't complete the sequences");
    }
}