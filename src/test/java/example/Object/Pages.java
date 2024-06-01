package example.Object;

import org.openqa.selenium.*;

import static org.testng.AssertJUnit.assertEquals;

public class Pages {

    WebDriver driver;
    public Pages(WebDriver driver) {
        this.driver = driver;
    }

    String url = "https://automationexercise.com/"; // url
    By p1 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"); // verify home page
    By p2 = By.xpath("//a[@href=\"/contact_us\"]"); // contact us button
    By p3 = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2"); //verify get in touch
    By p4 = By.xpath("//input[@data-qa=\"name\"]");
    By p5 = By.xpath("//input[@data-qa=\"email\"]");
    By p6 = By.xpath("//input[@data-qa=\"subject\"]");
    By p7 = By.xpath("//textarea[@data-qa=\"message\"]");
    By p8 = By.xpath("//input[@name=\"upload_file\"]");
    By p9 = By.xpath("//input[@data-qa=\"submit-button\"]");
    //alert
    By p10 = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]"); // verify success msg
    By p11 = By.xpath("//a[@class=\"btn btn-success\"]"); // click home button
    By p12 = By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/a[1]/button");
    By p13 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"); // verify test cases page
    By p14 = By.xpath("//a[@href=\"/products\"]"); // click
    By p15 = By.xpath("//a[@href=\"/product_details/1\"]"); //click
    By p16 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2"); // verify product name
    By p17 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]"); // varify category
    By p18 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span"); // verify price
    By p19 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b"); // verify availability
    By p20 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b"); // verify condition
    By p21 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b"); // verify brand
    By p22 = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2"); // verify all products
    By p23 = By.xpath("//input[@id=\"search_product\"]");
    By p24 = By.xpath("//button[@id=\"submit_search\"]");
    By p25 = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    By p26 = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2"); // verify subscription
    By p27 = By.xpath("//input[@id=\"susbscribe_email\"]");
    By p28 = By.xpath("//button[@id=\"subscribe\"]");
    By p29 = By.xpath("//*[@id=\"success-subscribe\"]/div");
    By p30 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
//    By p31 = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")
    public void contactus() throws InterruptedException {
        driver.get(url);
        driver.findElement(p1).getText();
        System.out.println("verify home page");
        driver.findElement(p2).click();
        driver.findElement(p3).getText();
        System.out.println("verify get in touch");
        driver.findElement(p4).sendKeys("Gayatri Raina");
        driver.findElement(p5).sendKeys("gayatriraina@gmail.com");
        driver.findElement(p6).sendKeys("abc");
        driver.findElement(p7).sendKeys("xyz");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(p8).sendKeys("C:\\Users\\HP\\Desktop\\ids.txt");
        driver.findElement(p9).click();
        Thread.sleep(4000);
        driver.switchTo().alert().accept();
        driver.findElement(p10).getText();
        System.out.println("verify success msg");
        driver.findElement(p11).click();
        driver.findElement(p1).getText();
        System.out.println("verify home page");

    }

    public void verifytestcasespage(){
        driver.get(url);
        driver.findElement(p1).getText();
        System.out.println("verify home page");
        driver.findElement(p12).click();
        driver.findElement(p13).getText();
        System.out.println("verify test cases page");
    }

    public void productdetailpage() throws InterruptedException {
        driver.get(url);
        driver.findElement(p1).getText();
        System.out.println("verify home page");
        driver.findElement(p14).click();
        driver.findElement(p22).getText();
        System.out.println("Verify All Products");
        driver.findElement(p15).click();
        driver.findElement(p16).getText();
        System.out.println("Verify Product name");
        driver.findElement(p17).getText();
        System.out.println("Verify Category");
        driver.findElement(p18).getText();
        System.out.println("Verify Price");
        driver.findElement(p19).getText();
        System.out.println("Verify Availability");
        driver.findElement(p20).getText();
        System.out.println("Verify Condition");
        driver.findElement(p21).getText();
        System.out.println("Verify Brand");
    }

    public void searchproduct(){
        driver.get(url);
        driver.findElement(p1).getText();
        System.out.println("verify home page");
        driver.findElement(p14).click();
        driver.findElement(p22).getText();
        System.out.println("Verify All Products");
        driver.findElement(p23).sendKeys("pants");
        driver.findElement(p24).click();
        driver.findElement(p25).getText();
        System.out.println("Verify Searched Product");

    }

    public void HomePageSubscription() throws InterruptedException {
        driver.get(url);
        driver.findElement(p1).getText();
        System.out.println("verify home page");
        Thread.sleep(4000);
        WebElement toScroll = driver.findElement(p1);
        toScroll.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(p26).getText();
        System.out.println("Verify Subscription");
        driver.findElement(p27).sendKeys("gayatri.raina@gmail.com");
        driver.findElement(p28).click();
        driver.findElement(p29).getText();
        System.out.println("Verify alert msg");
    }

    public void CartSubscription(){
        driver.get(url);
        driver.findElement(p1).getText();
        System.out.println("verify home page");
        driver.findElement(p30).click();
        driver.findElement(p26).getText();
        System.out.println("Verify Subscription");
        driver.findElement(p27).sendKeys("gayatri.raina@gmail.com");
        driver.findElement(p28).click();
        driver.findElement(p29).getText();
        System.out.println("Verify alert msg");
    }

}
