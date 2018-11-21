package yandex.autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yandex.autotests.steps.BaseSteps;

/**
 * Created by Anton on 21.11.18.
 */


public class MarketPage extends BasePageObject {

    public MarketPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='logo logo_type_link logo_part_market']")
    public WebElement title;

    @FindBy(xpath = "//a[@class='link topmenu__link'][contains(text(),'Электроника')]")
    public WebElement elektronikaBtn;


////найти меню с основными разделами
//    @FindBy(xpath = "//div[@class='home-arrow__tabs']")
//    WebElement menuItems;
//// найти в меню Маркет и кликнуть по нему
//    public void selectMenuItem(String itemName){
//        menuItems.findElement(By.xpath(".//a[contains(text(),'"+itemName+"')]")).click();
//    }

}
