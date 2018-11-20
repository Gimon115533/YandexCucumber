package yandex.autotests.steps;

import yandex.autotests.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Anton on 20.11.2018.
 */
public class MainPageSteps {



    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }


}
