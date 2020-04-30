
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseClasss {
    public WebDriver getDriver() throws IOException {
        FileReader file_date = new FileReader("C:\\Users\\Alexandr\\IdeaProjects\\Homework 6\\src\\ data.properties");
        Properties get_prop = new Properties();
        get_prop.load(file_date);

        if(get_prop.get("browser").equals("Google Chrome")){
            ChromeDriver driver = new ChromeDriver();
            return driver;
        }else if(get_prop.get("browser").equals("Firefox")){
            FirefoxDriver driver = new FirefoxDriver();
            return driver;
        }else if(get_prop.get("browser").equals("Opera")){
            OperaDriver driver = new OperaDriver();
            return driver;
        }
        return null;
    }
}
