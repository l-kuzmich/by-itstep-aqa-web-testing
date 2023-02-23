package by.itstep.aqa.web.testing.login_page;

import by.itstep.aqa.web.testing.base.BaseUITestsClass;
import by.itstep.aqa.web.testing.service.LoginService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class LoginPageTest extends BaseUITestsClass {

    private LoginService loginService = new LoginService(driver);

    @BeforeEach
    public void openLoginPage(){
        driver.navigate().to("https://vk.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
    }

    @Test //проверить наличие чекбокса сохранить вход
    public void verifyCheckboxSaveEnterVisibility(){
        loginService = new LoginService(driver);

        Assertions.assertTrue(loginService.getLoginPage().getLoginBlock().checkboxSaveEnter.isEnabled());
    }


    @Test //проверить, что чекбокс по умолчанию включен и снимается
    public void verifyCheckboxSaveEnterIsOn(){
        loginService = new LoginService(driver);

        loginService.getLoginPage().getLoginBlock().checkboxSaveEnter.click();

        Assertions.assertFalse(loginService.getLoginPage().getLoginBlock().checkboxSaveEnter.isSelected());
    }


    @Test // наличие кнопки Google Play, правильность ссылки кнопки Google Play
    public void verifyButtonGooglePlayLink() {
        loginService = new LoginService(driver);
        String expectedLink = "https://play.google.com/store/apps/details?id=com.vkontakte.android";
        String expectedText = "Google Play";

        String actualLink = loginService.getLoginPage().getLoginMobilePromoBlock().buttonGooglePlay.getAttribute("href");
        String actualText = loginService.getLoginPage().getLoginMobilePromoBlock().buttonGooglePlay.getText();

        Assertions.assertTrue(loginService.getLoginPage().getLoginMobilePromoBlock().buttonGooglePlay.isDisplayed());
        Assertions.assertEquals(expectedLink, actualLink);
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test // правильность ссылки кнопки RuStore
    public void verifyButtonRuStoreLink() {
        loginService = new LoginService(driver);
        String expectedLink = "https://apps.rustore.ru/app/com.vkontakte.android";
        String expectedText = "RuStore";

        String actualLink = loginService.getLoginPage().getLoginMobilePromoBlock().buttonRuStore.getAttribute("href");
        String actualText = loginService.getLoginPage().getLoginMobilePromoBlock().buttonRuStore.getText();


        Assertions.assertTrue(loginService.getLoginPage().getLoginMobilePromoBlock().buttonRuStore.isDisplayed());
        Assertions.assertEquals(expectedLink, actualLink);
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test // правильность ссылки кнопки AppStore
    public void verifyButtonAppStoreLink() {
        loginService = new LoginService(driver);
        String expectedLink = "https://itunes.apple.com/ru/app/id564177498";
        String expectedText = "App Store";

        String actualLink = loginService.getLoginPage().getLoginMobilePromoBlock().buttonAppStore.getAttribute("href");
        String actualText = loginService.getLoginPage().getLoginMobilePromoBlock().buttonAppStore.getText();

        Assertions.assertTrue(loginService.getLoginPage().getLoginMobilePromoBlock().buttonAppStore.isDisplayed());
        Assertions.assertEquals(expectedLink, actualLink);
        Assertions.assertEquals(expectedText, actualText);
    }


}
