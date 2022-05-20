package java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class HomeWorkPage {
    By logo = By.cssSelector("a.main-header-logo");
    By mens = By.cssSelector("href=\"https://www.lcwaikiki.com/tr-TR/TR/lp/32-33-erkek\"");
    By poloShirt = By.cssSelector("href=\"/tr-TR/TR/etiket/polo-yaka-tisort-erkek\"");
    By poloShirtControl = By.cssSelector(".col-xs-12 h1");
    By size = By.cssSelector("[placeholder=\"Beden Ara\"]");
    By sizeBox = By.cssSelector(".collapsible-filter-container__content-area--size-filter .lcw-checkbox__checkbox");
    By colour = By.cssSelector("placeholder=\"Renk Ara\"");
    By colourBox = By.cssSelector(".collapsible-filter-container__content-area--color-filter .color-filter-option");


    WebDriver driver;
    ElementHelper helper;

    public HomeWorkPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkLogo() {
        helper.checkElementVisible(logo);
    }
    public void hoverMens() { helper.hoverToElement(mens);}
    public void hoverPoloShirt(){ helper.hoverToElement(poloShirt);}
    public void checkPoloShirt(){ helper.checkElementVisible(poloShirtControl);}
    public void sizeFilter(){ helper.sendKey(size, "M");}
    public void sizeMBox(){ helper.click(sizeBox);}
    public void colourFilter(){ helper.sendKey(colour, "Bordo");}
    public void colourMaroonBox() { helper.click(colourBox);}


}
