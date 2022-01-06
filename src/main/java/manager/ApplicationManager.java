package manager;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    public void init() {

        wd.navigate().to("https://www.tinytap.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public void stop(){

        wd.quit();
    }
}
