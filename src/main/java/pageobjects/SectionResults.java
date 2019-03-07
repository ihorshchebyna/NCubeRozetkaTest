package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pageelements.PaginationPannel;
import pageelements.SearchResults;

public class SectionResults {

    private WebDriver driver;

    @FindBy(css = "#navigation_block")
    public PaginationPannel paginationPannel;

    @FindBy(name = "goods_list")
    public SearchResults searchResults;

    public SectionResults(WebDriver driver) {
        this.driver = driver;
    }
}
