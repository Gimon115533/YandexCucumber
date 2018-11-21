package yandex.autotests.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandex.autotests.pages.MarketPage;

import static org.junit.Assert.assertTrue;

/**
 * Created by Anton on 21.11.2018.
 */

public class MarketSteps {

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


//   @Step("выбран пункт меню {0}")
//    public void selectMenuItem(String menuItem){
//        new MainPage().selectMenuItem(menuItem);
//    }


}
