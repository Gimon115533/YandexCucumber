package yandex.autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import yandex.autotests.steps.BaseSteps;

import java.util.HashMap;
import java.util.Map;

public class SaveNameProdukt extends BasePageObject {
    public SaveNameProdukt(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    public Map<String,String> nameColl = new HashMap<>();

    public void saveName(String n,WebElement x){
        nameColl.put(n, x.getText());
    }
    public String getNameProdukt(String n){
        return nameColl.get(n);
    }
}
