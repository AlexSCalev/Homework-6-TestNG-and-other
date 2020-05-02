package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class RegistrationPage  {
    WebDriver driver;
    WebElement fullName ;
    WebElement emailAdress;
    WebElement password ;
    WebElement confirmPassword;
    WebElement checkBox0;
    WebElement checBox1;
    WebElement signIn;

    public RegistrationPage(WebDriver driver) throws IOException {
        FileReader file = new FileReader("C:\\Users\\Alexandr\\IdeaProjects\\Homework 6\\src\\ data.properties");
        Properties readProp = new Properties();
        readProp.load(file);
        this.driver = driver;
        this.driver.get(readProp.getProperty("url1"));
        fullName = driver.findElement(By.xpath("//input[@name='user[name]']"));
        emailAdress = driver.findElement(By.xpath("//input[@name='user[email]']"));
        password = driver.findElement(By.xpath("//input[@name='user[password]']"));
        confirmPassword = driver.findElement(By.id("user_password_confirmation"));
        checkBox0 = driver.findElement(By.id("user_unsubscribe_from_marketing_emails"));
        checBox1 = driver.findElement(By.id("user_agreed_to_terms"));
        signIn = driver.findElement(By.xpath("//input[@name='commit']"));
    }

    public WebDriver getDriver() {
        return driver;
    }




    public WebElement getFullName() {
        return fullName;
    }

    public void setFullName(WebElement fullName) {
        this.fullName = fullName;
    }

    public WebElement getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(WebElement emailAdress) {
        this.emailAdress = emailAdress;
    }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(WebElement confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public WebElement getCheckBox0() {
        return checkBox0;
    }

    public void setCheckBox0(WebElement checkBox0) {
        this.checkBox0 = checkBox0;
    }

    public WebElement getChecBox1() {
        return checBox1;
    }

    public void setChecBox1(WebElement checBox1) {
        this.checBox1 = checBox1;
    }

    public WebElement getSignIn() {
        return signIn;
    }

    public void setSignIn(WebElement signIn) {
        this.signIn = signIn;
    }
}
