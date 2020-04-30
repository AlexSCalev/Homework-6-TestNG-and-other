package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    WebElement radioButton;
    WebElement selectList;
    WebElement eneterBar;
    public void HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getRadioButton() {
        return radioButton;
    }

    public void setRadioButton(WebElement radioButton) {
        this.radioButton = radioButton;
    }

    public WebElement getSelectList() {
        return selectList;
    }

    public void setSelectList(WebElement selectList) {
        this.selectList = selectList;
    }

    public WebElement getEneterBar() {
        return eneterBar;
    }

    public void setEneterBar(WebElement eneterBar) {
        this.eneterBar = eneterBar;
    }

}
