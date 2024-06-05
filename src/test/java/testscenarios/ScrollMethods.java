package testscenarios;

import example.Object.Scoll;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScrollMethods extends AutomationUtilities{
    static WebDriver driver;

    @Test
    public void down() throws InterruptedException {
        driver = super.Initialization();
        Scoll sc = new Scoll(driver);
        sc.scrollupusingarrow();
        sc.scrollupwithoutarrow();
    }
}
