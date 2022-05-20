package java.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

import java.pages.HomePage;
import java.pages.HomeWorkPage;

public class HomeWorkSteps {
    WebDriver driver = DriverFactory.getDriver();
    HomeWorkPage homeWorkPage = new HomeWorkPage(driver);

    @Given("Uygulama acilir")
    public void uygulamaAcilir() {
        homeWorkPage.checkLogo();
    }

    @When("\"ERKEK\" menüsünün üzerine gelinir")
    public void erkekMenusu(){ homeWorkPage.hoverMens();}

    @When("\"Polo Yaka Tişört\" butonuna tıklanır")
    public void poloShirt(){ homeWorkPage.hoverPoloShirt();}

    @Then("\"Erkek Polo Yaka Tişört\" sayfasının geldiği kontrol edilir")
    public void poloShirtCheck(){ homeWorkPage.checkPoloShirt();}

    @When("\"Beden Ara\" filtresine \"M\" yazılır")
    public void mSize(){ homeWorkPage.sizeFilter();}

    @When("\"M\" onay kutucuğuna tıklanır")
    public void mBox(){ homeWorkPage.sizeMBox();}

    @When("\"Renk Ara\" filtresine \"Bordo\" yazılır")
    public void maroonColour(){ homeWorkPage.colourFilter();}

    @When("\"Bordo\" onay kutucuğuna tıklanır")
    public void maroonBox(){ homeWorkPage.colourMaroonBox();}





}
