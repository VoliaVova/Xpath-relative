package Xpathway;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;








public class linked {
    @Test
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://www.linkedin.com/");


        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-email")));
        email.sendKeys("");


        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-password")));
        password.sendKeys("");

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-submit")));
        button.submit();








    }




}
