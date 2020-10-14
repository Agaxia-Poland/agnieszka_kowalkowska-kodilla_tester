package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsFizzOrBuzzSteps implements En {
    private int number;
    private String answer;

    public IsFizzOrBuzzSteps() {
        Given("the number is 3", () -> {
            this.number = 3;
        });

        Given("the number is 6", () -> {
            this.number = 6;
        });

        Given("the number is 9", () -> {
            this.number = 9;
        });

        Given("the number is 5", () -> {
            this.number = 5;
        });

        Given("the number is 50", () -> {
            this.number = 50;
        });

        Given("the number is 25", () -> {
            this.number = 25;
        });

        Given("the number is 15", () -> {
            this.number = 15;
        });

        Given("the number is 30", () -> {
            this.number = 30;
        });

        Given("the number is 60", () -> {
            this.number = 60;
        });

        Given("the number is 123", () -> {
            this.number = 123;
        });

        Given("the number is 1", () -> {
            this.number = 1;
        });

        When("I ask for the right word to the given number", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfNumber(this.number);
        });

        Then("You should say {string}", (String answer) -> {
            Assert.assertEquals(answer, this.answer);
        });
    }
}

