package actions;

import pageobjects.HomePage;

public class HomePageActions {
    private HomePage homePage;

    public void openSmartphoneSection() {
        homePage.navigationBar.smartTvElectroSection.click();
        homePage.navigationBar.smartPhonesSection.click();
    }

}
