package by.itstep.aqa.web.testing.page;

import by.itstep.aqa.web.testing.block.LoginBlock;
import by.itstep.aqa.web.testing.block.LoginMobilePromoBlock;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private LoginBlock loginBlock = new LoginBlock(driver);
    private LoginMobilePromoBlock loginMobilePromoBlock = new LoginMobilePromoBlock(driver);

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginBlock getLoginBlock() {
        return loginBlock;
    }

    public LoginMobilePromoBlock getLoginMobilePromoBlock() {
        return loginMobilePromoBlock;
    }
}
