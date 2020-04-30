import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class RegistrationTest extends BaseClasss {

    WebDriver driver;

    @BeforeMethod
    public void createDriver() throws IOException {
      driver = super.getDriver();
    }

    @AfterMethod
    public void clouseDriver(){
        driver.close();
    }
    @Test
    public void registartionTest() throws IOException {
        FileReader file = new FileReader("C:\\Users\\Alexandr\\IdeaProjects\\Homework 6\\src\\ data.properties");
        Properties date = new Properties();
        date.load(file);
        String registrationPage = date.getProperty("url1");
        driver.get(registrationPage);

       WebElement fullName = driver.findElement(By.xpath("//input[@name='user[name]']"));
       WebElement emailAdress = driver.findElement(By.xpath("//input[@name='user[email]']"));
       WebElement password = driver.findElement(By.xpath("//input[@name='user[password]']"));
       WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='user[password]']"));
       WebElement checkBox0 = driver.findElement(By.id("user_unsubscribe_from_marketing_emails"));
       WebElement checBox1 = driver.findElement(By.id("user_agreed_to_terms"));
       WebElement signIn = driver.findElement(By.xpath("//input[@name='commit']"));

       fullName.sendKeys("Alexandr");
       emailAdress.sendKeys("guru@mail.ru");
       password.sendKeys("Migel");
       confirmPassword.sendKeys("Migel");
       checkBox0.click();
       checBox1.click();
       signIn.click();

    }

    @DataProvider(name = "DataProvid")
    public Object[][] dataPoviderMethod(){
        return new Object[][] { { "Alexandr","guru@mail.ru","Migel","Migel" }, {  "Alexey","guru@mail.ru","Alexey","Alexey" } };
    }

    @Test(dataProvider = "DataProvid")
    public void testDoubleDate(String fullNamee,String emaile,String passworde,String confirmPassWorde) throws IOException, InterruptedException {
        FileReader file = new FileReader("C:\\Users\\Alexandr\\IdeaProjects\\Homework 6\\src\\ data.properties");
        Properties date = new Properties();
        date.load(file);
        String registrationPage = date.getProperty("url1");
        driver.get(registrationPage);

        WebElement fullName = driver.findElement(By.xpath("//input[@name='user[name]']"));
        WebElement emailAdress = driver.findElement(By.xpath("//input[@name='user[email]']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='user[password]']"));
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='user[password]']"));
        WebElement checkBox0 = driver.findElement(By.id("user_unsubscribe_from_marketing_emails"));
        WebElement checBox1 = driver.findElement(By.id("user_agreed_to_terms"));
        WebElement signIn = driver.findElement(By.xpath("//input[@name='commit']"));

        fullName.sendKeys(fullNamee);
        emailAdress.sendKeys(emaile);
        password.sendKeys(passworde);
        confirmPassword.sendKeys(confirmPassWorde);
        checkBox0.click();
        checBox1.click();
        signIn.click();
//        new Thread().wait(2000);
    }
}
