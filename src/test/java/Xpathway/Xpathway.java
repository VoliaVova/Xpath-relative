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



public class Xpathway {

    @Test
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://google.com");


        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        input.sendKeys("wix");

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
        button.submit();

        WebElement firstResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='LC20lb']")));
        firstResult.click();

        WebElement wixLogo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='_1QuYK']")));
        Assert.assertTrue(wixLogo.isDisplayed());





    }

}
