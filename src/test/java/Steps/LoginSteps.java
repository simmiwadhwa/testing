package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("userIsOnLoginPage");
    }

    @When("User enters username and password")
    public void userEntersUsernameAnd() {
        System.out.println("userEntersUsernameAndPassword");
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        System.out.println("clickOnLoginButton");
    }

    @Then("User is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("userIsNavigatedToTheHomePage");
    }

}
