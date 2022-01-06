package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Connect {
    WebDriver wd;

    @BeforeMethod
    public void init() {

            wd = new ChromeDriver();
            wd.navigate().to("https://www.tinytap.com/");
        }

        @Test
        public void connect() {


            WebElement connectBtn = wd.findElement(By.xpath("//div[@class='profileText']"));
            connectBtn.click();
            }

            @AfterMethod
            public void tearDown () {
                //wd.quit();
            }
        }
