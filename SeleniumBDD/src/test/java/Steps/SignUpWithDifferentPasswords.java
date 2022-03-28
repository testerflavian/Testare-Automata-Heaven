package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpWithDifferentPasswords {
    WebDriver driver = new Environment().getDriver();
    public SignUpWithDifferentPasswords() {
    }

    @Given("I insert the first password")
    public void Insert_different_password() throws InterruptedException {
        driver.get("https://politrip.com/account/sign-up");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("cookiescript_accept")).click();
        driver.findElement(By.id("first-name")).sendKeys("Flavian");
        driver.findElement(By.id("last-name")).sendKeys("Savu");
        driver.findElement(By.id("email")).sendKeys("flaviansavu@gmail.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("QWERTYuiop1234567890");
    }

    @When("I insert a different confirmation password and press submit button")
    public void I_complete_with_different_password() throws InterruptedException {
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("DifferentPassword");

        Select drpHeard=new Select(driver.findElement(By.name("heard")));
        drpHeard.selectByVisibleText("Other");
        Thread.sleep(2000);
        driver.findElement(By.id(" qa_loader-button")).click();
        Thread.sleep(2000);
    }

    @Then("I get an error")
    public void Passwords_must_match_appears() {

        String expectedText = "Passwords must match";
        String actualText = driver.findElement(By.xpath("//*[@id=\"sign-up-confirm-password-div\"]/app-form-control-error-message/em/span")).getText();

        if(expectedText.equalsIgnoreCase(actualText))
        {
            System.out.println("The test for different Passwords passed");
        }
        else
        {
            System.out.println("The texts are not the same");
        }
    }
}
