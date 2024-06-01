package testscenarios;

import example.Object.RegisterUser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegisterUserMethod extends AutomationUtilities {
    static WebDriver driver;

@Test
    public void Register() throws InterruptedException {
    driver = super.Initialization();
    RegisterUser ru = new RegisterUser(driver);
    ru.verifypage();
    ru.click();
    ru.newuser();
    ru.fill();
    ru.correctlogin();
    ru.incorrectlogin();
    ru.logout();
    ru.registeruserwithexistemail();
}
}
