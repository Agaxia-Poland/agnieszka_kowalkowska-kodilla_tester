package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;
    private static GoogleResults googleResults;

    @FindBy(css = "input[value='Szczęśliwy traf']")
    static List<WebElement> searchButtonFluke;
    private static GoogleResultsFluke googleResultsFluke;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResults() {
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();

        googleResultsFluke = loadResultsFluke(driver);
        googleResultsFluke.iSeeResultsByFluke();
    }

    public static GoogleResults loadResults(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }

    public static GoogleResultsFluke loadResultsFluke(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButtonFluke.get(0))).click();
        GoogleResultsFluke googleResultsFluke = new GoogleResultsFluke(driver);
        return googleResultsFluke;
    }
}
