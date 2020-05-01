
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RegistrationTest extends BaseClasss {

    WebDriver driver;
    RegistrationPage reg;

    @BeforeMethod
    public void createDriver() throws IOException {
        reg = new RegistrationPage(super.getDriver());
        this.driver = reg.getDriver();
    }

    @AfterMethod
    public void clouseDriver(){
        driver.close();
    }

    @Test
    public void regTest() throws IOException {
        reg.getDriver().manage().window().maximize();
        reg.getFullName().sendKeys("Migels");
        reg.getEmailAdress().sendKeys("Migels@gimao.com");
        reg.getPassword().sendKeys("Migel1234");
        reg.getConfirmPassword().sendKeys("Migel1234");
        reg.getCheckBox0().click();
        reg.getChecBox1().click();
        reg.getSignIn().submit();
        Assert.assertEquals(reg.getDriver().getCurrentUrl(),"https://learn.letskodeit.com/");

    }

    @DataProvider(name = "DataProvid")
    public Object[][] dataPoviderMethod(){
        return new Object[][] { { "Carl","guru@mail.ru","Migel5678","Migel5678" }, {  "Alexey","misaSupa@gmail.com","Alexey1234","Alexey1234" } };
    }

    @Test(dataProvider = "DataProvid")
    public void testDoubleDate(String fullName,String email,String password,String confirmPassWord){
        reg.getDriver().manage().window().maximize();
        reg.getFullName().sendKeys(fullName);
        reg.getEmailAdress().sendKeys(email);
        reg.getPassword().sendKeys(password);
        reg.getConfirmPassword().sendKeys(confirmPassWord);
        reg.getCheckBox0().click();
        reg.getChecBox1().click();
        reg.getSignIn().submit();
        Assert.assertEquals(reg.getDriver().getCurrentUrl(),"https://learn.letskodeit.com/");
    }

//    Test date only Excel Provide
    @Test(dataProvider = "Excel")
    public void testExcel(String fullName,String email,String password,String confirmPassword){
        reg.getDriver().manage().window().maximize();
        reg.getFullName().sendKeys(fullName);
        reg.getEmailAdress().sendKeys(email);
        reg.getPassword().sendKeys(password);
        reg.getConfirmPassword().sendKeys(confirmPassword);
        reg.getCheckBox0().click();
        reg.getChecBox1().click();
        reg.getSignIn().submit();
        Assert.assertEquals(reg.getDriver().getCurrentUrl(),"https://learn.letskodeit.com/");
    }

    @DataProvider(name = "Excel")
    public Object[][] getDate(){
        Object[][]arrayObject = getDateExcel("C:\\Users\\Alexandr\\IdeaProjects\\Homework 6\\Book1.xls","Лист1");
        return arrayObject;
    }

    public String[][]getDateExcel(String fileName,String sheetName){
        String[][]date=null;
        try {
            FileInputStream fs = new FileInputStream(fileName);
            Workbook wb = Workbook.getWorkbook(fs);
            Sheet sh = wb.getSheet(sheetName);

            int totalNoCols = sh.getColumns();
            int totalNoRows = sh.getRows();

            date = new String[totalNoRows-1][totalNoCols];

            for(int i = 1;i<totalNoRows;i++){
                for(int j=0;j<totalNoCols;j++){
                    date[i-1][j]=sh.getCell(j,i).getContents();
                }
            }

        } catch (IOException | BiffException e) {
            e.printStackTrace();
        }

        return date;
    }

}

