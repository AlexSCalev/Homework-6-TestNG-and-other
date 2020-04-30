package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    WebDriver driver;
    WebElement fullnameInput;
    WebElement iAgreeCheckBox;
    WebElement signInButton;

    public  void RegistrationPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getFullnameInput() {
        return fullnameInput;
    }

    public void setFullnameInput(WebElement fullnameInput) {
        this.fullnameInput = fullnameInput;
    }

    public WebElement getiAgreeCheckBox() {
        return iAgreeCheckBox;
    }

    public void setiAgreeCheckBox(WebElement iAgreeCheckBox) {
        this.iAgreeCheckBox = iAgreeCheckBox;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public void setSignInButton(WebElement signInButton) {
        this.signInButton = signInButton;
    }

}
