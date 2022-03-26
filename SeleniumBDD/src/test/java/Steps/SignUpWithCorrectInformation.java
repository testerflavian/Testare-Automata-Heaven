package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpWithCorrectInformation {
    WebDriver driver = new Environment().getDriver();

    public SignUpWithCorrectInformation(){}
    @Given("I complete the sign up sequences with correct data")
    public void Insert_correct_data() throws InterruptedException {
        driver.get("https://politrip.com/account/sign-up");
        Thread.sleep(1000);
        driver.findElement(By.id("cookiescript_accept")).click();
        driver.findElement(By.id("first-name")).sendKeys("Flavian");
        driver.findElement(By.id("last-name")).sendKeys("Savu");
        driver.findElement(By.id("email")).sendKeys("flaviansavu@gmail.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("QWERTYuiop1234567890");
        Thread.sleep(2000);
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("QWERTYuiop1234567890");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Select drpHeard=new Select(driver.findElement(By.name("heard")));
        drpHeard.selectByVisibleText("Other");
    }
    @When("I click on Sign Up button")
        public void I_click_on_the_signup_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id(" qa_loader-button")).click();
        }

    @Then("The account is created successfully")
        public void The_account_is_created(){
        System.out.println("The account is created successfully");
    }

    }

