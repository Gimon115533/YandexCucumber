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

    @FindBy(xpath = "//a[@class='_2qvOOvezty _2x2zBaVN-3 _9qbcyI_fyS'][contains(text(),'Телевизоры')]")
    public WebElement televizorBtn;

    @FindBy(xpath = "//span[@class='_28j8Lq95ZZ']")
    public WebElement vseFiltriBtn;

    @FindBy(name = "glf-pricefrom-var")
    public WebElement priseFrom;

    public void fillField(String fieldename, String value) {
        switch (fieldename) {
            case "цена от":
                fillField(priseFrom, value);
                break;
            default: throw new AssertionError("Поле "+fieldename+"не объявлено");
        }

    }

    @FindBy(xpath = "//label[@class='checkbox__label'][contains(text(),'Samsung')]")
    public WebElement samsungBtn;

    @FindBy(xpath = "//label[@class='checkbox__label'][contains(text(),'LG')]")
    public WebElement lgBtn;

    @FindBy(xpath = "//a[@class='button button_size_l button_theme_pseudo i-bem button_action_show-filtered n-filter-panel-extend__controll-button_size_big button_js_inited']")
    public WebElement applyBtn;


////найти меню с основными разделами
//    @FindBy(xpath = "//div[@class='home-arrow__tabs']")
//    WebElement menuItems;
//// найти в меню Маркет и кликнуть по нему
//    public void selectMenuItem(String itemName){
//        menuItems.findElement(By.xpath(".//a[contains(text(),'"+itemName+"')]")).click();
//    }

}
