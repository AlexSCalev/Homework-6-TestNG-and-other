import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.HomePage;

import java.io.IOException;

public class HomePageTest extends BaseClasss {
    private static final Logger logger = LogManager.getLogger(HomePageTest.class);
    HomePage page;
    @BeforeMethod
    public void createDriver() throws IOException {
        page = new HomePage(super.getDriver());
    }
    @AfterMethod
    public  void clouseDriver(){
        page.getDriver().close();
    }

    @Test
    public void testDefaultRadioButton(){
        page.getDriver().manage().window().maximize();
        page.getRadioButton().click();
        if(!page.getRadioButton().isSelected()){
            logger.error("Button BMW isn`t selected");
        }else{
            logger.info("ButtonWorked BMW");
        }
        Assert.assertTrue(page.getRadioButton().isSelected());
    }

    @Test
    public  void testDefaultselectList(){
        page.getDriver().manage().window().maximize();
       WebElement elList =  page.getSelectList().findElement(By.xpath("//option[@value='benz']"));
       elList.click();
        if(!elList.isSelected()){
            logger.error("Element in list isn`t Benz selected");
        }else{
            logger.info("ButtonWorked is Benz selected");
        }
        Assert.assertTrue(elList.isSelected());
    }
    @Test
    public void testDefaultSignIn(){
        page.getDriver().manage().window().maximize();
        page.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement signIn = page.getSigInElement();
        signIn.click();
        if(!signIn.isEnabled()){
            logger.error("Link doesn`t worked Sign In");
        }else{
            logger.info("Link worked Sign In");
        }
       Assert.assertTrue(signIn.isEnabled());
    }
}
