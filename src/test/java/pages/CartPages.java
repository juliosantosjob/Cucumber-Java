package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPages {

    @FindBy(css = "input[placeholder='Digite a sua busca']")
    protected WebElement fldSearch;

    @FindBy(css = "a[class='bf-shelf-item__container']")
    protected List<WebElement> tltProduct;

    @FindBy(xpath = "(//*[contains(@class,'radio-item-')])[1]")
    protected WebElement fldSize;

    @FindBy(css = "td[class='product-name']")
    protected List<WebElement> fdlProduct;

    @FindBy(css = "#cart-title")
    protected WebElement fldMyCart;
}
