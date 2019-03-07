package actions;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.ResultItem;
import pageobjects.SectionResults;

import java.util.List;
import java.util.stream.Collectors;

public class ResultPageActions {
    private SectionResults sectionResults;
    private WebDriver driver;

    public ResultPageActions(WebDriver driver) {
        this.driver = driver;
    }

    private List<ResultItem> findAllResult() {
        return sectionResults.searchResults.resultItems;
    }


    /*
    findTopSellerItems() returns all the items on the page with Top Seller label
     */
    private List<ResultItem> findTopSellerItems() {
        return findAllResult()
                .stream()
                .filter(res -> {
                    WebElement label = res.productLabel;
                    if (null != label && label.getAttribute("class").contains("g-tag-icon-small-popularity")) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    private void navigateToTheSecondPage() {
        sectionResults.paginationPannel.secondPage.click();
        /*
        add wait for loader stop moving
         */
    }

    private void navigateToTheThirdPage() {
        sectionResults.paginationPannel.thirdPage.click();
                /*
        add wait for loader stop moving
         */
    }

    public void checkTopSellers() {
        List<ResultItem> firstPageResults = findTopSellerItems();
        navigateToTheSecondPage();
        List<ResultItem> secondPageResults = findTopSellerItems();
        navigateToTheThirdPage();
        List<ResultItem> thirdPageResults = findTopSellerItems();

        SoftAssertions soft = new SoftAssertions();

        soft.assertThat(firstPageResults.size())
                .as("Inappropriate amount of top sellers on the first page")
                .isEqualTo(3);
        soft.assertThat(secondPageResults.size())
                .as("Inappropriate amount of top sellers on the second page")
                .isEqualTo(3);
        soft.assertThat(thirdPageResults.size())
                .as("Inappropriate amount of top sellers on the third page")
                .isEqualTo(3);
        soft.assertAll();
    }
}
