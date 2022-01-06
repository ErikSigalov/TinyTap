package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {

        this.wd = wd;
    }

    public void click(By locator) {

        wd.findElement(locator).click();
    }

    public void connectButton() {
        click(By.xpath("(//div[@class='profileText'])[1]"));
    }
}
