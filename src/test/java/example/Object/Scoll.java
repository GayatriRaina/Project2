package example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scoll {
    WebDriver driver;

    public Scoll(WebDriver driver) {
        this.driver = driver;
    }

    String url = "https://automationexercise.com/";
    By p1 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    By p26 = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2");
    By a1 = By.xpath("//*[@id=\"scrollUp\"]");
    By a2 = By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");

    public void scrollupusingarrow() throws InterruptedException {
        driver.get(url);
        driver.findElement(p1).getText();
        System.out.println("verify home page");
        Thread.sleep(4000);
        WebElement toScroll = driver.findElement(p1);
        toScroll.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(p26).getText();
        System.out.println("Verify Subscription");
        driver.findElement(a1).click();
        driver.findElement(a2).getText();
        System.out.println("Verify Automation Exercise");
    }

    public void scrollupwithoutarrow() throws InterruptedException {
        driver.get(url);
        driver.findElement(p1).getText();
        System.out.println("verify home page");
        Thread.sleep(4000);
        WebElement toScroll = driver.findElement(p1);
        toScroll.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(p26).getText();
        System.out.println("Verify Subscription");
        toScroll.sendKeys(Keys.PAGE_UP);
        driver.findElement(a2).getText();
        System.out.println("Verify Automation Exercise");
    }

}
