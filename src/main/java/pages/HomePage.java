package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    WebDriver driver;

    @FindBy(className = "app_logo")
    WebElement appLogo;

    @FindBy(className = "shopping_cart_link")
    WebElement iconoCarrito;
////div[text()='Sauce Labs Backpack']
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement sauceLabsBackAddToCartButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement sauceLabsBackPackRemoveButton;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public boolean verifyAppLogo() {
        boolean verifyAppLogo = appLogo.isDisplayed();
        return verifyAppLogo;
    }

    public String getTextItemCarrito(){
        String textoCarrito = iconoCarrito.getText();
        return textoCarrito;
    }

    public void clickOnAddBackPack(){
        sauceLabsBackAddToCartButton.click();
    }
    public void clickOnRemoveBackPack(){
        sauceLabsBackPackRemoveButton.click();
    }
}
