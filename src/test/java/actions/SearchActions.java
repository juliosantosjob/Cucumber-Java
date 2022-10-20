package actions;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import pages.SearchPages;
import io.cucumber.datatable.DataTable;
import static org.junit.Assert.assertTrue;

public class SearchActions extends SearchPages {
	WebDriver driver;

	public SearchActions(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void goTo() {
		btnInBetween.isDisplayed();
	}

	public void clickBtnSearch() {
		btnSearch.click();
	}

	public void fillInProducts(DataTable dataTable) {
		List<List<String>> data = dataTable.cells();
		fldFillingItem.sendKeys(data.get(0).get(1));
	}

	public void sendSearch() {
		fldFillingItem.sendKeys(Keys.ENTER);
	}

	public void viewSearch(DataTable dataTable) {	
		List<List<String>> data = dataTable.cells();
		String item = data.get(0).get(1);

		WebElement firstProduct = fldProduct.get(0);

		String fldProduct = firstProduct.getText();
		assertTrue(fldProduct.contains(item));
	}
}
