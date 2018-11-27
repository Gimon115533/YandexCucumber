package yandex.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yandex.autotests.steps.BaseSteps;

public class HeadPhonesPage extends BasePageObject {

    public HeadPhonesPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='_2qvOOvezty _2x2zBaVN-3 _9qbcyI_fyS'][contains(text(),'Наушники')]")
    public WebElement headPhonesBtn;

    @FindBy(xpath = "//label[@class='checkbox__label'][contains(text(),'Beats')]")
    public WebElement beatsBtn;

    public String numberVariantsHead = String.valueOf(new BaseSteps().driver.findElements(By.xpath("//div[@class='n-snippet-card2__title']/a[contains(text(),'Наушники')]")).size());

    @FindBy(xpath = "//div[@class='n-snippet-card2__title']/a[contains(text(),'Наушники')][1]")
    public WebElement numberFirstHead;

    @FindBy(xpath = "//input[@id='header-search']")
    public WebElement inputText;

    @FindBy(xpath = "//div[@class='n-snippet-card2__title']/a[contains(@title,'Наушники')][1]")
    public WebElement nameModelFaund;

}
