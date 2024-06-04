package testscenarios;

import example.Object.Product;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProductMethods extends AutomationUtilities {
    static WebDriver driver;

    @Test
    public void VerifyProduct() throws InterruptedException {
        driver = super.Initialization();
        Product pr = new Product(driver);
//        pr.viewcategory();
        pr.viewcartbrand();
        pr.searchproduct();
        pr.review();
        pr.recommendeditem();
    }
}
