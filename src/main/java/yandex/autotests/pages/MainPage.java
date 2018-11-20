package yandex.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yandex.autotests.steps.BaseSteps;


/**
 * Created by Anton on 20.11.18.
 */
public class MainPage extends BasePageObject{

//найти меню с основными разделами
    @FindBy(xpath = "//div[@class='home-arrow__tabs']")
    WebElement menuItems;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
// найти в меню Маркет и кликнуть по нему
    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath(".//a[contains(text(),'"+itemName+"')]")).click();
    }

}

