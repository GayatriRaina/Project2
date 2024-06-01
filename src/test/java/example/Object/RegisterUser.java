package example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.AssertJUnit.assertEquals;

public class RegisterUser {
    WebDriver driver;

    public RegisterUser(WebDriver driver) {
        this.driver = driver;
    }

    String url = "https://automationexercise.com/";

    By s1 = By.xpath("//a[@href=\"/login\"]");
    By s2 = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2"); /*verify new user sign up */
    By s3 = By.xpath("//input[@type=\"text\"]");
    By s4 = By.xpath("//input[@data-qa=\"signup-email\"]");
    By s5 = By.xpath("//button[@data-qa=\"signup-button\"]");
    By s6 = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b"); /*verify ENTER ACCOUNT INFORMATION*/
    By s7 = By.xpath("//input[@id=\"id_gender2\"]");
    By s8 = By.xpath("//input[@type=\"password\"]");
    By s9 = By.xpath("//select[@id=\"days\"]");
    By s10 = By.xpath("//select[@id=\"months\"]");
    By s11 = By.xpath("//select[@id=\"years\"]");
    By s12 = By.xpath("//input[@name=\"newsletter\"]");
    By s13 = By.xpath("//input[@name=\"optin\"]");
    By s14 = By.xpath("//input[@data-qa=\"first_name\"]");
    By s15 = By.xpath("//input[@data-qa=\"last_name\"]");
    By s16 = By.xpath("//input[@data-qa=\"company\"]");
    By s17 = By.xpath("//input[@data-qa=\"address\"]");
    By s18 = By.xpath("//input[@data-qa=\"address2\"]");
    By s19 = By.xpath("//input[@data-qa=\"state\"]");
    By s20 = By.xpath("//input[@data-qa=\"city\"]");
    By s21 = By.xpath("//input[@data-qa=\"zipcode\"]");
    By s22 = By.xpath("//input[@data-qa=\"mobile_number\"]");
    By s23 = By.xpath("//button[@data-qa=\"create-account\"]");
    By s24 = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    By s25 = By.xpath("//a[@data-qa=\"continue-button\"]");
    By s26 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
    By s27 = By.xpath("//a[@href=\"/delete_account\"]");
    By s28 = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    By s29 = By.xpath("//a[@data-qa=\"continue-button\"]");
    By s30 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    By s31 = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2");
    By s32 = By.xpath("//input[@data-qa=\"login-email\"]");
    By s33 = By.xpath("//input[@data-qa=\"login-password\"]");
    By s34 = By.xpath("//button[@data-qa=\"login-button\"]");
    By s35 = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
    By s36 = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p");
    By s37 = By.xpath("//a[@href=\"/logout\"]");
    By s38 = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");


    public void verifypage() {
        driver.get(url);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        assertEquals(expectedTitle, actualTitle);
        System.out.println("Verify Automation Exercise");
    }

    public void click() {
        driver.get(url);
        driver.findElement(s1).click();
        driver.findElement(s2).getText();
        System.out.println("Verify New User Signup!");

    }

    public void newuser() throws InterruptedException {
        driver.get(url);
        driver.findElement(s1).click();
        driver.findElement(s3).sendKeys("Gayatri Raina");
        driver.findElement(s4).sendKeys("gayatriraina@gmail.com");
        driver.findElement(s5).click();
        Thread.sleep(4000);
        driver.findElement(s6).getText();
        System.out.println("Verify ENTER ACCOUNT INFORMATION");
    }

    public void fill() throws InterruptedException {
        driver.get(url);
        driver.findElement(s1).click();
        driver.findElement(s3).sendKeys("Gayatri Raina");
        driver.findElement(s4).sendKeys("gayatri.raina@gmail.com");
        driver.findElement(s5).click();
        Thread.sleep(4000);
        WebElement r = driver.findElement(s7);
        r.click();
        driver.findElement(s8).sendKeys("Gayu@12345");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Select dropdown = new Select(driver.findElement(s9));
        dropdown.selectByVisibleText("28");
        Select dropdown1 = new Select(driver.findElement(s10));
        dropdown1.selectByVisibleText("March");
        Select dropdown2 = new Select(driver.findElement(s11));
        dropdown2.selectByVisibleText("1997");
        WebElement check1 = driver.findElement(s12);
        check1.click();
        WebElement check2 = driver.findElement(s13);
        check2.click();
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(s14).sendKeys("Gayatri");
        driver.findElement(s15).sendKeys("Raina");
        driver.findElement(s16).sendKeys("abc");
        driver.findElement(s17).sendKeys("Kharadi");
        driver.findElement(s18).sendKeys("Bypass");
        driver.findElement(s19).sendKeys("Maharashtra");
        driver.findElement(s20).sendKeys("Pune");
        driver.findElement(s21).sendKeys("411014");
        driver.findElement(s22).sendKeys("6006243294");
        driver.findElement(s23).click();
        driver.findElement(s24).getText();
        System.out.println("Verify Account Created!");
        driver.findElement(s25).click();
        driver.findElement(s26).getText();
        System.out.println("Verify Logged in as username");
        driver.findElement(s27).click();
        driver.findElement(s28).getText();
        System.out.println("Verify Account Deleted!");
        driver.findElement(s29).click();
    }

    public void correctlogin() {
        driver.get(url);
        driver.findElement(s30).getText();
        System.out.println("Veirfy Home Page");
        driver.findElement(s1).click();
        driver.findElement(s31).getText();
        System.out.println("Verify Login to your account");
        driver.findElement(s32).sendKeys("gayatriraina@gmail.com");
        driver.findElement(s33).sendKeys("Gayu@12345");
        driver.findElement(s34).click();
        driver.findElement(s35).getText();
        System.out.println("Verify Logged in as Gayatri Raina");
        driver.findElement(s27).click();
        driver.findElement(s28).getText();
        System.out.println("Verify Account Deleted!");
        driver.findElement(s29).click();
    }

    public void incorrectlogin() {
        driver.get(url);
        driver.findElement(s30).getText();
        System.out.println("Veirfy Home Page");
        driver.findElement(s1).click();
        driver.findElement(s31).getText();
        System.out.println("Verify Login to your account");
        driver.findElement(s32).sendKeys("gayatri.raina@gmail.com");
        driver.findElement(s33).sendKeys("Gayu@12345");
        driver.findElement(s34).click();
        driver.findElement(s36).getText();
        System.out.println("Verify error message");
    }

    public void logout() {
        driver.get(url);
        driver.findElement(s30).getText();
        System.out.println("Veirfy Home Page");
        driver.findElement(s1).click();
        driver.findElement(s31).getText();
        System.out.println("Verify Login to your account");
        driver.findElement(s32).sendKeys("gayatriraina@gmail.com");
        driver.findElement(s33).sendKeys("Gayu@12345");
        driver.findElement(s34).click();
        driver.findElement(s35).getText();
        System.out.println("Verify Logged in as Gayatri Raina");
        driver.findElement(s37).click();
        driver.findElement(s1).getText();
        System.out.println("Verify Login page");
    }

    public void registeruserwithexistemail(){
        driver.get(url);
        driver.findElement(s30).getText();
        System.out.println("Veirfy Home Page");
        driver.findElement(s1).click();
        driver.findElement(s2).getText();
        System.out.println("Verify New User Signup!");
        driver.findElement(s3).sendKeys("Gayatri Raina");
        driver.findElement(s4).sendKeys("gayatriraina@gmail.com");
        driver.findElement(s5).click();
        driver.findElement(s38).getText();
        System.out.println("Verify error message already exist");
    }
}