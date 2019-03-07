package pageelements;

import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResults {

    @FindBy(css = ".g-i-tile.g-i-tile-catalog")
    public List<ResultItem> resultItems;
}
