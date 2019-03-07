import actions.HomePageActions;
import actions.ResultPageActions;
import org.junit.jupiter.api.Test;

public class TestRozetkaSmarthPhones  extends BaseTest{
    private HomePageActions homePageActions;
    private ResultPageActions resultPageActions;

    @Test
    void testTopSellerCount() {
        homePageActions = new HomePageActions();
        resultPageActions = new ResultPageActions();

        homePageActions.openSmartphoneSection();
        resultPageActions.checkTopSellers();
    }
}
