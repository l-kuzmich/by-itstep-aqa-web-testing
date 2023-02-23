package by.itstep.aqa.web.testing.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMobilePromoBlock extends BaseBlock{

    public LoginMobilePromoBlock(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='LoginMobilePromoStore__link'][1]")
    public WebElement buttonGooglePlay;


    @FindBy(xpath = "//*[@class='LoginMobilePromoStore__link'][2]")
    public WebElement buttonRuStore;

    @FindBy(xpath = "//*[@class='LoginMobilePromoStore__link'][3]")
    public WebElement buttonAppStore;
}
