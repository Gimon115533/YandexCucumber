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


//    @When("^выбран вид страхования \"(.+)\"$")
//    public void selectMenuInsurance(String menuName){
//        mainPageSteps.selectMenuInsurance(menuName);
//    }
//
//    @When("^выполнить переход на новую вкладку$")
//    public void goToNewOpenPage(){
//        choiceInsuranceSteps.goToNewPage();
//    }
//
//    @Then("^заголовок страницы - Страхование путешественников равен \"(.+)\"$")
//    public void checkTitleTravelInsurancePage(String title){
//        travelInsuranceSteps.checkPageTitle(title);
//    }
//
//    @When("^выполнить нажатие на кнопку Минимальная$")
//    public void clickBtnMin(){
//        travelInsuranceSteps.BtnMin();
//    }
//
//    @When("^выполнить нажатие на кнопку Оформить$")
//    public void clickBtnFormalize(){
//        travelInsuranceSteps.BtnFormalize();
//    }
//
//    @Then("^появилось поле на вкладке Оформление равное \"(.+)\"$")
//    public void checkPoleTravelInsurancePage(String pole){
//        travelInsuranceSteps.checkPagePole(pole);
//    }
//
//    @When("^заполняются поля:$")
//    public void fillForm(DataTable fields){
//        fields.asMap(String.class, String.class)
//                .forEach((field, value) -> travelInsuranceSteps.fillField(field, value));
//
//    }
//
//    @When("^выполнить нажатие на кнопку Продолжить$")
//    public void clickBtnNext(){
//        travelInsuranceSteps.BtnNext();
//    }
//
//    @Then("^значения полей равны:$")
//    public void checkFillForm(DataTable fields){
//        fields.asMap(String.class, String.class)
//                .forEach((field, value) -> travelInsuranceSteps.checkFillField(field, value));
//    }
//
//    @Then("^присутствует сообщение об ошибке \"(.+)\"$")
//    public void checkErrorMessage(String errorMessage){
//        travelInsuranceSteps.checkErrorMessageField(errorMessage);
//
//    }
//
}

