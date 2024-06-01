package testscenarios;

import example.Object.Pages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PagesMethods extends AutomationUtilities{
    static WebDriver driver;

    @Test
    public void verify() throws InterruptedException {
        driver = super.Initialization();
        Pages page = new Pages(driver);
//        page.contactus();
//        page.verifytestcasespage();
        page.productdetailpage();
//        page.searchproduct();
//        page.HomePageSubscription();
//        page.CartSubscription();
    }
}
