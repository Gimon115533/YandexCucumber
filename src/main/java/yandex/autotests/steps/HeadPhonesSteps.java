package yandex.autotests.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandex.autotests.pages.HeadPhonesPage;
import yandex.autotests.pages.SaveNameProdukt;

import static org.junit.Assert.assertTrue;

public class HeadPhonesSteps {
    SaveNameProdukt saveNameProdukt = new SaveNameProdukt();


    @Step("выполнено нажатие на кнопку Наушники")
    public void clickHeadPhones() {
        new HeadPhonesPage().headPhonesBtn.click();
    }

    @Step("выполнено нажатие на кнопку Beats")
    public void clickBeatsBtn() {
        new HeadPhonesPage().beatsBtn.click();
    }

    @Step("элементов на странице наушники {0}")
    public void checkNumberVariantsHead(String numberVar) {
        String actualNumber = String.valueOf(new HeadPhonesPage().numberVariantsHead);
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualNumber, numberVar), actualNumber.contains(numberVar));
    }

    @Step("получен первый элемент в списке наушники")
    public void getNumberFirstHead() {

        saveNameProdukt.saveName("Наушники", new HeadPhonesPage().numberFirstHead);

    }

    @Step("в поисковую строку ввести запомненное значение наушники")
    public void inputTextSearchHead(){
        new HeadPhonesPage().inputText.sendKeys(saveNameProdukt.getNameProdukt("Наушники"));
    }

    @Step("проверить, что наименование товара соответствует запомненному значению наушники")
    public void checkNameHeadPhones(){
        String actualTitle = new HeadPhonesPage().nameModelFaund.getText();
        String ErrorMessage= saveNameProdukt.getNameProdukt("Наушники");
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, ErrorMessage), actualTitle.contains(ErrorMessage));
    }


}
