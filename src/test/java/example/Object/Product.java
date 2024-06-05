package example.Object;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Product {

    WebDriver driver;

    public Product(WebDriver driver) {
        this.driver = driver;
    }

    String url = "https://automationexercise.com/";// url
    By o1 = By.xpath("/html/body/section[2]/div/div/div[1]/div/h2");
    By o2 = By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a/span");
    By o3 = By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/div[1]/div[1]/div[2]/div/ul/li[1]/a");
    By o4 = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    By o5 = By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a/span");
    By o6 = By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/ul/li[1]/a");
    By o7 = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    By o8 = By.xpath("//a[@href=\"/products\"]");
    By o9 = By.xpath("/html/body/section[2]/div/div/div[1]/div/div[2]/h2");
    By o10 = By.xpath("//a[@href=\"/brand_products/H&M\"]");
    By o11 = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    By o12 = By.xpath("//a[@href=\"/brand_products/Polo\"]");
    By o13 = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    By o14 = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    By p23 = By.xpath("//input[@id=\"search_product\"]");
    By p24 = By.xpath("//button[@id=\"submit_search\"]");
    By p25 = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    By o15 = By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/a");
    By o16 = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a");
    By o17 = By.xpath("//*[@id=\"product-3\"]/td[1]/a/img");
    By o18 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    By s32 = By.xpath("//input[@data-qa=\"login-email\"]");
    By s33 = By.xpath("//input[@data-qa=\"login-password\"]");
    By s34 = By.xpath("//button[@data-qa=\"login-button\"]");
    By o19 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
    By o20 = By.xpath("//a[@href=\"/product_details/1\"]");
    By o21 = By.xpath("//a[@href=\"#reviews\"]");
    By o22 = By.xpath("//input[@id=\"name\"]");
    By o23 = By.xpath("//input[@id=\"email\"]");
    By o24 = By.xpath("//textarea[@id=\"review\"]");
    By o25 = By.xpath("//button[@id=\"button-review\"]");
    By o26 = By.xpath("//*[@id=\"review-section\"]/div/div");
    By o27 = By.xpath("/html/body/section[2]/div/div/div[2]/div[2]/h2");
    By o28 = By.xpath("//*[@id=\"recommended-item-carousel\"]/div/div[1]/div[1]/div/div/div/a");
    By o29 = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");
    By o30 = By.xpath("//*[@id=\"product-1\"]/td[2]/h4/a");
    By p1 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    By p37 = By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a");
    By o31 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    By g45 = By.xpath("//a[@href=\"/view_cart\"]");
    By g46 = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");
    By g4 = By.xpath("//a[@class=\"btn btn-default check_out\"]");
    By o32 = By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u");
    By g6 = By.xpath("//input[@type=\"text\"]");
    By g7 = By.xpath("//input[@data-qa=\"signup-email\"]");
    By g8 = By.xpath("//button[@data-qa=\"signup-button\"]");
    By g9 = By.xpath("//input[@id=\"id_gender2\"]");
    By g10 = By.xpath("//input[@type=\"password\"]");
    By g11 = By.xpath("//select[@id=\"days\"]");
    By g12 = By.xpath("//select[@id=\"months\"]");
    By g13 = By.xpath("//select[@id=\"years\"]");
    By g14 = By.xpath("//input[@name=\"newsletter\"]");
    By g15 = By.xpath("//input[@name=\"optin\"]");
    By g16 = By.xpath("//input[@data-qa=\"first_name\"]");
    By g17 = By.xpath("//input[@data-qa=\"last_name\"]");
    By g18 = By.xpath("//input[@data-qa=\"company\"]");
    By g19 = By.xpath("//input[@data-qa=\"address\"]");
    By g20 = By.xpath("//input[@data-qa=\"address2\"]");
    By g21 = By.xpath("//input[@data-qa=\"state\"]");
    By g22 = By.xpath("//input[@data-qa=\"city\"]");
    By g23 = By.xpath("//input[@data-qa=\"zipcode\"]");
    By g24 = By.xpath("//input[@data-qa=\"mobile_number\"]");
    By g25 = By.xpath("//button[@data-qa=\"create-account\"]");
    By g26 = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    By g27 = By.xpath("//a[@data-qa=\"continue-button\"]");
    By g28 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
    By g51 = By.xpath("//*[@id=\"address_delivery\"]/li[1]/h3");
    By g52 = By.xpath("//*[@id=\"address_invoice\"]/li[1]/h3");
    By g30 = By.xpath("//*[@id=\"cart_items\"]/div/div[4]/h2");
    By g31 = By.xpath("//textarea[@class=\"form-control\"]");
    By g32 = By.xpath("//a[@href=\"/payment\"]");
    By g33 = By.xpath("//input[@name=\"name_on_card\"]");
    By g34 = By.xpath("//input[@name=\"card_number\"]");
    By g35 = By.xpath("//input[@name=\"cvc\"]");
    By g36 = By.xpath("//input[@name=\"expiry_month\"]");
    By g37 = By.xpath("//input[@name=\"expiry_year\"]");
    By g38 = By.xpath("//button[@id=\"submit\"]");
    By g39 = By.xpath("//*[@id=\"success_message\"]/div");
    By g40 = By.xpath("//a[@href=\"/delete_account\"]");
    By g41 = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    By g42 = By.xpath("//a[@data-qa=\"continue-button\"]");
    
    public void viewcategory() throws InterruptedException {
        driver.get(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(o1).getText();
        System.out.println("Verify CATEGORY");
        driver.findElement(o2).click();
        driver.findElement(o3).click();
        driver.findElement(o4).getText();
        System.out.println("Verify WOMEN - DRESS PRODUCTS");
        driver.findElement(o5).click();
        driver.findElement(o6).click();
        driver.findElement(o7).getText();
        System.out.println("Verify MEN - TSHIRTS PRODUCTS");
    }

    public void viewcartbrand(){
        driver.get(url);
        driver.findElement(o8).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(o9).getText();
        System.out.println("Verify BRAND");
        driver.findElement(o10).click();
        driver.findElement(o11).getText();
        System.out.println("Verify brand");
        driver.findElement(o12).click();
        driver.findElement(o13).getText();
        System.out.println("Verify 2nd brand");
    }

    public void searchproduct(){
        driver.get(url);
        driver.findElement(o8).click();
        driver.findElement(o14).getText();
        System.out.println("Verify All Products");
        driver.findElement(p23).sendKeys("pants");
        driver.findElement(p24).click();
        driver.findElement(p25).getText();
        System.out.println("Verify Searched Product");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(o2).click();
        driver.findElement(o3).click();
        driver.findElement(o15).click();
        driver.findElement(o16).click();
        driver.findElement(o17).getText();
        System.out.println("Verify the product");
        driver.findElement(o18).click();
        driver.findElement(s32).sendKeys("gayatriraina@gmail.com");
        driver.findElement(s33).sendKeys("Gayu@12345");
        driver.findElement(s34).click();
        driver.findElement(o19).click();
        driver.findElement(o17).getText();
        System.out.println("Verify the product");
    }

    public void review(){
        driver.get(url);
        driver.findElement(o8).click();
        driver.findElement(o14).getText();
        System.out.println("Verify All Products");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(o20).click();
        driver.findElement(o21).getText();
        System.out.println("Verify write a review");
        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(o22).sendKeys("Gayatri");
        driver.findElement(o23).sendKeys("gayatriraina@gmail.com");
        driver.findElement(o24).sendKeys("NICE");
        driver.findElement(o25).click();
        driver.findElement(o26).getText();
        System.out.println("Verify success msg");
    }

    public void recommendeditem(){
        driver.get(url);
        WebElement toScroll = driver.findElement(o27);
        toScroll.sendKeys(Keys.PAGE_DOWN);
        System.out.println("Verify recommend products");
        driver.findElement(o28).click();
        driver.findElement(o29).click();
        driver.findElement(o30).getText();
        System.out.println("Verify recommended product");
    }

    public void downloadinvoice() throws InterruptedException {
        driver.get(url);
        driver.findElement(p1).getText();
        System.out.println("verify home page");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(p37).click();
        driver.findElement(o31).click();
        driver.findElement(g46).click();
        driver.findElement(g45).getText();
        System.out.println("Verify Cart page");
        driver.findElement(g4).click();
        driver.findElement(o32).click();
        driver.findElement(g6).sendKeys("Gayatri Raina");
        driver.findElement(g7).sendKeys("gayatriraina4@gmail.com");
        driver.findElement(g8).click();
        Thread.sleep(4000);
        WebElement r = driver.findElement(g9);
        r.click();
        driver.findElement(g10).sendKeys("Gayu@12345");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1000)");
        Select dropdown = new Select(driver.findElement(g11));
        dropdown.selectByVisibleText("28");
        Select dropdown1 = new Select(driver.findElement(g12));
        dropdown1.selectByVisibleText("March");
        Select dropdown2 = new Select(driver.findElement(g13));
        dropdown2.selectByVisibleText("1997");
        WebElement check1 = driver.findElement(g14);
        check1.click();
        WebElement check2 = driver.findElement(g15);
        check2.click();
        js1.executeScript("window.scrollBy(0,700)");
        driver.findElement(g16).sendKeys("Gayatri");
        driver.findElement(g17).sendKeys("Raina");
        driver.findElement(g18).sendKeys("abc");
        driver.findElement(g19).sendKeys("Kharadi");
        driver.findElement(g20).sendKeys("Bypass");
        driver.findElement(g21).sendKeys("Maharashtra");
        driver.findElement(g22).sendKeys("Pune");
        driver.findElement(g23).sendKeys("411014");
        driver.findElement(g24).sendKeys("6006243294");
        driver.findElement(g25).click();
        driver.findElement(g26).getText();
        System.out.println("Verify Account Created!");
        driver.findElement(g27).click();
        driver.findElement(g28).getText();
        System.out.println("Verify Logged in as username");
        driver.findElement(g46).click();
        driver.findElement(g45).getText();
        System.out.println("Verify Cart page");
        driver.findElement(g4).click();
        driver.findElement(g51).getText();
        System.out.println("Verify Delivery Address");
        driver.findElement(g52).getText();
        System.out.println("Verify Billing address");
        js1.executeScript("window.scrollBy(0,1000)");
        driver.findElement(g30).getText();
        System.out.println("Verify review your order");
        driver.findElement(g31).sendKeys("abcxyz");
        driver.findElement(g32).click();
        Thread.sleep(1000);
        driver.findElement(g33).sendKeys("Gayatri Raina");
        driver.findElement(g34).sendKeys("1234567890098765");
        driver.findElement(g35).sendKeys("999");
        driver.findElement(g36).sendKeys("09");
        driver.findElement(g37).sendKeys("2027");
        driver.findElement(g38).click();
        driver.findElement(g39).getText();
        System.out.println("Verify Success message");
        driver.findElement(g40).click();
        driver.findElement(g41).getText();
        System.out.println("Verify Account Deleted!");
        driver.findElement(g42).click();
    }
}
