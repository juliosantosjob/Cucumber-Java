package steps;

import io.cucumber.java.en.*;
import actions.CartActions;
import utils.DriverFactory;

import static org.junit.Assert.assertTrue;

public class CartSteps extends DriverFactory {
    CartActions CartPage = new CartActions(driver);

    @And("search for the item {string}")
    public void search_for_the_item(String Sneakers) {
        CartPage.searchForItem(Sneakers);
    }

    @And("find the item of your choice")
    public void find_the_item_of_your_choice() {
        CartPage.findFavoriteItem();
    }

    @When("he clicks buy on the item of his choice")
    public void he_clicks_buy_on_the_item_of_his_choice() {
        CartPage.IClickBuy();
    }

    @And("choose the size")
    public void choose_the_size() {
        CartPage.selectSize();
    }

    @And("click {string} again")
    public void click_again(String Buy) {
        CartPage.clickBuy(Buy);
    }

    @And("click {string}")
    public void click(String FinalPurchase) {
        CartPage.finalizePurchase(FinalPurchase);
    }

    @Then("he visualizes the {string} he has chosen in the {string} section")
    public void he_visualizes_the_he_has_chosen_in_the_section(String Sneakers, String myCart) {
        assertTrue(CartPage.seeSneakers().contains(Sneakers.toLowerCase()));
        assertTrue(CartPage.seeMyCart().contains((myCart)));
    }
}
