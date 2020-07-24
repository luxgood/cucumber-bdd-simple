package steps;

import io.cucumber.java8.En;
import org.junit.Assert;

public class ShoppingStepsDef implements En {

    private int budget = 0;

    public ShoppingStepsDef() {
        Given("I have {int} in my wallet", (Integer money) -> budget = money);

        When("I buy {word} with {int}", (String product, Integer price) -> budget -= price);

        Then("I should have {int} in my wallet", (Integer finalBudget) ->
                Assert.assertEquals(budget, finalBudget.intValue()));

        When("I buy {int} {word} with {int}", (Integer numberOfItems, String product, Integer price) -> {
            budget -= (numberOfItems*price);
        });
    }
}
