package yandex.autotests.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandex.autotests.pages.MarketPage;
import yandex.autotests.pages.SaveNameProdukt;

import static org.junit.Assert.assertTrue;

/**
 * Created by Anton on 21.11.2018.
 */

public class MarketSteps {

    SaveNameProdukt saveNameProdukt=new SaveNameProdukt();

    @Step("заголовок страницы - Маркет равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new MarketPage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("выполнено нажатие на кнопку Электроника")
    public void clickElektronika(){
        new MarketPage().elektronikaBtn.click();
    }

    @Step("выполнено нажатие на кнопку Телевизоры")
    public void clickTelevizor(){
        new MarketPage().televizorBtn.click();
    }

    @Step("выполнено нажатие на кнопку Все фильтры")
    public void clickVseFiltri(){
        new MarketPage().vseFiltriBtn.click();
    }

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        new MarketPage().fillField(field, value);
    }

    @Step("выполнено нажатие на кнопку Samsung")
    public void clickSamsungBtn(){
        new MarketPage().samsungBtn.click();
    }

    @Step("выполнено нажатие на кнопку LG")
    public void clickLgBtn(){
        new MarketPage().lgBtn.click();
    }

    @Step("выполнено нажатие на кнопку Показать подходящие")
    public void clickApplyBtn(){
        new MarketPage().applyBtn.click();
    }

    @Step("элементов на странице {0}")
    public void checkNumberVariants(String numberVar){
        String actualNumber = String.valueOf(new MarketPage().numberVariants);
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualNumber, numberVar), actualNumber.contains(numberVar));
    }

    @Step("получен первый элемент в списке")
    public void getNumberFirst(){
        saveNameProdukt.saveName("Телевизор", new MarketPage().numberFirst);
    }


    @Step("в поисковую строку ввести запомненное значение")
    public void inputTextSearch(){
        new MarketPage().inputText.sendKeys(saveNameProdukt.getNameProdukt("Телевизор"));
    }

    @Step("нажать кнопку Найти")
    public void clickSearchBtn(){
        new MarketPage().searchBtn.click();
    }

    @Step("проверить, что наименование товара соответствует запомненному значению")
    public void checkNameTelevizor(){
        String actualTitle = new MarketPage().nameModelFaund.getText();
        String ErrorMessage= saveNameProdukt.getNameProdukt("Телевизор");
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, ErrorMessage), actualTitle.contains(ErrorMessage));
    }

}
