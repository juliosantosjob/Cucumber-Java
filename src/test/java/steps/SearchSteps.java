package steps;

import actions.SearchActions;
import io.cucumber.java.en.*;
import utils.DriverFactory;
import io.cucumber.datatable.DataTable;

public class SearchSteps extends DriverFactory {
	SearchActions SearchPage = new SearchActions(driver);

	@Given("that the user accesses the website home")
	public void that_the_user_accesses_the_website_home() {
		SearchPage.goTo();
	}

	@And("click the search button")
	public void click_the_search_button() {
		SearchPage.clickBtnSearch();
	}

	@When("he fill:")
	public void he_fill(DataTable dataTable) {
		SearchPage.fillInProducts(dataTable);
	}

	@When("submit your survey")
	public void submit_your_survey() {
		SearchPage.sendSearch();
	}

	@Then("it sees:")
	public void it_sees(DataTable dataTable) {
		SearchPage.viewSearch(dataTable);
	}
}
