//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Properties;
//
//public class TestSelen {
//    @Test
//    public void testDriver() throws IOException {
//        FileReader reader = new FileReader("C:\\Users\\Alexandr\\IdeaProjects\\Homework 6\\src\\ data.properties");
//        Properties data =new Properties();
//        data.load(reader);
//        ChromeDriver drivers = new ChromeDriver();
//        drivers.get("http://demo.guru99.com");
//        WebElement element = drivers.findElement(By.xpath("//input[@name='emailid']"));
//        element.sendKeys("abc@gmail.com");
//        WebElement button = drivers.findElement(By.xpath("//input[@name='btnLogin']"));
//        button.click();
//    }
//}
