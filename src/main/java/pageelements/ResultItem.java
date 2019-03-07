package pageelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultItem {

    @FindBy(name = "prices_active_element_original")
    public WebElement productLabel;

    @FindBy(css = ".g-price-uah")
    public WebElement productPrice;

    @FindBy(css = ".g-i-tile-i-title.clearfix")
    public WebElement productName;
}
