package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contact_Us_Steps {
    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        System.out.println("Test1");
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        System.out.println("Test2");
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        System.out.println("Test3");
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        System.out.println("Test4");
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        System.out.println("Test5");
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        System.out.println("Test6");
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        System.out.println("Test7");
    }
}