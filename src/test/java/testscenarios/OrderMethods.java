package testscenarios;

import example.Object.Order;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OrderMethods extends AutomationUtilities {
    static WebDriver driver;

    @Test
    public void Products() throws InterruptedException {
        driver = super.Initialization();
        Order obj = new Order(driver);
        obj.registerwhilecheckout();
        obj.registerbeforecheckout();
        obj.loginbeforecheckout();
    }
}
