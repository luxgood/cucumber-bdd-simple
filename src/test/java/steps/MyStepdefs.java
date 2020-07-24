package steps;

import io.cucumber.java8.En;

public class MyStepdefs implements En {

    public MyStepdefs() {
        Given("^User navigates to stackoverflow website$", () -> {
            System.out.println("User navigates to stackoverflow website");
        });
        And("^User clicks on the login button$", () -> {
            System.out.println("User clicks on the login button");
        });
        And("^User enters a valid username$", () -> {
            System.out.println("User enters a valid username");
        });
        And("^User enters a valid password$", () -> {
            System.out.println("User enters a valid password");
        });
        Then("^User should be taken to the successful login page$", () -> {
            System.out.println("User should be taken to the successful login page");
        });
    }
}
