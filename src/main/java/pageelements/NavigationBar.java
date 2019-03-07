package pageelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar {

    @FindBy(xpath = ".//a[@href = 'https://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/']")
    public WebElement smartTvElectroSection;

    @FindBy(xpath = ".//a[@href = 'https://rozetka.com.ua/mobile-phones/c80003/preset=smartfon/']")
    public WebElement smartPhonesSection;
}
