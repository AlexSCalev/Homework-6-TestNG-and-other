package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HomePage {
    WebDriver driver;
    WebElement radioButton;
    WebElement selectList;
    WebElement sigInElement;

    public HomePage(WebDriver driver) throws IOException {
        FileReader file = new FileReader("C:\\Users\\Alexandr\\IdeaProjects\\Homework 6\\src\\ data.properties");
        Properties readProp = new Properties();
        readProp.load(file);
        this.driver = driver;
        this.driver.get(readProp.getProperty("url0"));

        radioButton=driver.findElement(By.id("bmwradio"));
        selectList=driver.findElement(By.id("carselect"));
        sigInElement = driver.findElement(By.id("openwindow"));
    }

    public WebDriver getDriver() {
        return driver;
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

    public WebElement getSigInElement() {
        return sigInElement;
    }

    public void setSigInElement(WebElement sigInElement) {
        this.sigInElement = sigInElement;
    }
}
