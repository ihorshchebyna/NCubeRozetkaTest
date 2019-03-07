package actions;

import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;

public class HomePageActions {
    private HomePage homePage;
    private WebDriver driver;

    public void openSmartphoneSection() {
        homePage = new HomePage(driver);
        homePage.navigationBar.smartTvElectroSection.click();
        homePage.navigationBar.smartPhonesSection.click();
    }

    public HomePageActions(WebDriver driver) {
        this.driver = driver;
    }
}
