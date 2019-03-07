package pageelements;

import org.openqa.selenium.support.FindBy;

public class PaginationPannel {

    @FindBy(css = "#page1")
    public PaginationButton firstPage;

    @FindBy(css = "#page2")
    public PaginationButton secondPage;

    @FindBy(css = "#page3")
    public PaginationButton thirdPage;
}
