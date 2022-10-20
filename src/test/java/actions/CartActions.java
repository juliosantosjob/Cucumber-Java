package actions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import pages.CartPages;

import static utils.Helpers.*;

public class CartActions extends CartPages {
    WebDriver driver;

    public CartActions(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void searchForItem(String Sneakers) {
        fldSearch.sendKeys(Sneakers, Keys.ENTER);
    }

    public void findFavoriteItem() {
        WebElement title = tltProduct.get(1);
        title.isDisplayed();
    }

    public void IClickBuy() {
        WebElement titleItem = tltProduct.get(0);
        titleItem.click();
    }

    public void selectSize() {
        fldSize.click();
    }

    public void clickBuy(String Buy) {
        waitForText(Buy, 10);
        clickText(Buy);
    }

    public void finalizePurchase(String FinalPurchase) {
        clickText(FinalPurchase);
    }

    public String seeSneakers() {
        WebElement firstProduct = fdlProduct.get(0);
        return firstProduct.getText();
    }

    public String seeMyCart() {
        return fldMyCart.getText();
    }
}
