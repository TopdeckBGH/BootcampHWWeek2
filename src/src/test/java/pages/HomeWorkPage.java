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
    By sortBox = By.cssSelector("[data-name=\"Path 2118\"]");
    By cheapest = By.cssSelector(".dropdown-button__option:nth-child(2)");
    By mSelection = By.cssSelector(".lcw-checkbox__checkbox--checked");
    By maroonSelection = By.cssSelector("src=\"http://akstatic.lcwaikiki.com/Resource/Images/icon/bordo.png\"");
    By productPrice = By.cssSelector(".product-price__main-price-container");
    By productCheapest = By.cssSelector(".product-price__main-price-container:nth-child(1)");
    By shareButton = By.cssSelector(".col-xs-3 .interaction-share");
    By copyLinkButton = By.cssSelector(".new-share");


    WebDriver driver;
    ElementHelper helper;

    //Sayfanın anlık URL'idir
    public String currentURL = driver.getCurrentUrl();
    //İşlemin sonunda bulunan URL'dir.
    public String pageLink = helper.getAttribute((By.cssSelector(".new-share[value]")), "value");

    public HomeWorkPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkLogo() { helper.checkElementVisible(logo);}
    public void hoverMens() { helper.hoverToElement(mens);}
    public void hoverPoloShirt(){ helper.hoverToElement(poloShirt);}
    public void checkPoloShirt(){ helper.checkElementVisible(poloShirtControl);}
    public void sizeFilter(){ helper.sendKey(size, "M");}
    public void sizeMBox(){ helper.click(sizeBox);}
    public void colourFilter(){ helper.sendKey(colour, "Bordo");}
    public void colourMaroonBox(){ helper.click(colourBox);}
    public void clickSortBox(){ helper.click(sortBox);}
    public void clickCheapest(){ helper.click(cheapest);}
    public void checkMSelection(){ helper.checkElementVisible(mSelection);}
    public void checkMaroonSelection(){ helper.checkElementVisible(maroonSelection);}
    public void checkCheapestToMostExpensive(){ helper.checkElementVisible(productPrice);}
    public void clickCheapestProduct(){ helper.click(productCheapest);}
    public void clickShareButton(){ helper.click(shareButton);}
    public void clickCopyButton(){ helper.click(copyLinkButton);}



}
