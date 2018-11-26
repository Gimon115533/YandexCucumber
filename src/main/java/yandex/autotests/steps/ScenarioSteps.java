package yandex.autotests.steps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Anton on 20.11.2018.
 */
public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    MarketSteps marketSteps = new MarketSteps();

//    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();
//
    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuName){
        mainPageSteps.selectMenuItem(menuName);
    }

    @Then("^заголовок страницы - Маркет равен \"(.+)\"$")
    public void checkTitleMarketPage(String title){
        marketSteps.checkPageTitle(title);
    }

    @When("^выполнено нажатие на кнопку Электроника$")
    public void clickBtnElektronika(){
        marketSteps.clickElektronika();
    }

    @When("^выполнено нажатие на кнопку Телевизоры$")
    public void clickBtnTelevizor(){
        marketSteps.clickTelevizor();
    }

    @When("^выполнено нажатие на кнопку Все фильтры$")
    public void clickBtnVseFiltri(){
        marketSteps.clickVseFiltri();
    }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> marketSteps.fillField(field, value));

    }

    @When("^выполнено нажатие на кнопку Samsung$")
    public void clickBtnSamsung(){
        marketSteps.clickSamsungBtn();
    }

    @When("^выполнено нажатие на кнопку LG$")
    public void clickBtnLg(){
        marketSteps.clickLgBtn();
    }

    @When("^выполнено нажатие на кнопку Показать подходящие$")
    public void clickBtnApply(){
        marketSteps.clickApplyBtn();
    }

    @Then("^элементов на странице \"(.+)\"$")
    public void checkNumberVar(String numberVar){
        marketSteps.checkNumberVariants(numberVar);

    }

    @When("^получен первый элемент в списке$")
    public void getNumberF(){
        marketSteps.getNumberFirst();
    }

    @When("^в поисковую строку ввести запомненное значение $")
    public void inputTextS(){
        marketSteps.inputTextSearch();

    }

    @When("^нажать кнопку Найти$")
    public void clickBtnSearch(){
        marketSteps.clickSearchBtn();
    }

    @Then("^проверить, что наименование товара соответствует запомненному значению \"(.+)\"$")
    public void checkTelevizorName(){
        marketSteps.checkNameTelevizor();

    }

}

