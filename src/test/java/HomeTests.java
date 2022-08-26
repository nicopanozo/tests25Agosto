import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

public class HomeTests extends BaseTest {

    @Test
    public void verificarCartNumberPlus(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUsernameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickLoginButton();

        HomePage homePage = new HomePage(DriverManager.getDriver().driver);
        homePage.clickOnAddBackPack();
        System.out.println(homePage.getTextItemCarrito());
        Assert.assertEquals(homePage.getTextItemCarrito(),"1");
    }
    @Test
    public void verificarCartNumberLess(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUsernameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickLoginButton();

        HomePage homePage = new HomePage(DriverManager.getDriver().driver);
        homePage.clickOnAddBackPack();
        homePage.clickOnRemoveBackPack();
        System.out.println(homePage.getTextItemCarrito());
        Assert.assertNotEquals(homePage.getTextItemCarrito(),"1");
    }
}
