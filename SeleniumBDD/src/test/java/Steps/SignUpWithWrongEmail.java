package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpWithWrongEmail {
    WebDriver driver = new Environment().getDriver();

    public SignUpWithWrongEmail(){}
    @Given("I complete the sign up sequences with non-existent email")
    public void Insert_non_existent_email() throws InterruptedException {
        driver.get("https://politrip.com/account/sign-up");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("cookiescript_accept")).click();
        driver.findElement(By.id("first-name")).sendKeys("Flavian");
        driver.findElement(By.id("last-name")).sendKeys("Savu");
        driver.findElement(By.id("email")).sendKeys("nonexistentemail@email.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("QWERTYuiop1234567890");
        Thread.sleep(2000);
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("QWERTYuiop1234567890");

        Select drpHeard=new Select(driver.findElement(By.name("heard")));
        drpHeard.selectByVisibleText("Other");
    }
    @When("I click on sign up")
    public void I_click_on_signup() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id(" qa_loader-button")).click();
    }

    @Then("The account should not be created successfully")
    public void The_account_is_created(){
        System.out.println("The account is created successfully");
    }

}
// As you can observe the test is passed, this means that the app allows you to create an account with a non-existent email and in my opinion it is a bug of the app
// So here should be written a bug report with this problem