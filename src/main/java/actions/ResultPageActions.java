package actions;

import org.openqa.selenium.NoSuchElementException;
import pageelements.ResultItem;
import pageobjects.SectionResults;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResultPageActions {
    private SectionResults sectionResults;

    private List<ResultItem> findAllResult() {
        return sectionResults.searchResults.resultItems;
    }

    private List<ResultItem> findTopSellerItems() {
        List<ResultItem> results = new ArrayList<>();
        try {
            results = findAllResult()
                    .stream()
                    .filter(res -> res.productLabel.getAttribute("class").contains("g-tag-icon-small-popularity"))
                    .collect(Collectors.toList());
        } catch (NoSuchElementException e) {
        }
        return results;
    }

    private void navigateToTheSecondPage() {
        sectionResults.paginationPannel.secondPage.click();
    }

    private void navigateToTheThirdPage() {
        sectionResults.paginationPannel.thirdPage.click();
    }

    public void checkTopSellers() {

    }

}
