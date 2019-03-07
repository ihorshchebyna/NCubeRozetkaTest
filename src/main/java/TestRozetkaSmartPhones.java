import actions.HomePageActions;
import actions.ResultPageActions;
import org.junit.jupiter.api.Test;

public class TestRozetkaSmartPhones extends BaseTest{
    private HomePageActions homePageActions;
    private ResultPageActions resultPageActions;

    @Test
    void testTopSellerCount() {
        homePageActions = new HomePageActions(driver);
        resultPageActions = new ResultPageActions(driver);

        homePageActions.openSmartphoneSection();
        resultPageActions.checkTopSellers();
    }
}
