package example.Object;

import org.openqa.selenium.*;

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


}
