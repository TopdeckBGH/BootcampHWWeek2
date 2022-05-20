package java.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

import java.pages.SearchPage;

public class SearchPageSteps {

    SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

    @Then("Search Page in geldigi kontrol edilir")
    public void searchPageInGeldigiKontrolEdilir() {
        searchPage.checkSearchPage();
    }

    @When("{int}. siradaki ayakkabbiya tiklanir")
    public void siradakiAyakkabbiyaTiklanir(int arg0) {
    }
}
