package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultsFluke extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> resultsFluke;

    public GoogleResultsFluke(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResultsByFluke() {
        System.out.println("I see results by fluke");
        System.out.println(resultsFluke.size());
    }
}
