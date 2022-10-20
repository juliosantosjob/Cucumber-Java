package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPages {

    @FindBy(xpath = "//*[text()='Entre']")
    protected WebElement btnInBetween;

    @FindBy(xpath = "(//*[@class='el-search-autocomplete__wrapper'])[1]")
    protected WebElement btnSearch;

    @FindBy(xpath = "(//*[@class='bf-search__field'])[1]")
    protected WebElement fldFillingItem;

    @FindBy(xpath = "(//*[@class='bf-shelf-item__title'])[1]")
    protected List<WebElement> fldProduct;
}
