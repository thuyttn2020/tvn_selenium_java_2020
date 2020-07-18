package locateElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;

public class RedirectorTest {

    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.getInstance(CHROME).setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/redirector");
        driver.findElement(By.id("redirect")).click();

        driver.findElement(By.linkText("200")).click();
        driver.findElement(By.xpath("//*[.='here']")).click();

        driver.findElement(By.xpath("//a[.='301']")).click();
        driver.findElement(By.linkText("here")).click();

        driver.findElement(By.linkText("404")).click();
        driver.findElement(By.linkText("here")).click();

        driver.findElement(By.linkText("500")).click();
        driver.findElement(By.linkText("here")).click();

        driver.findElement(By.linkText("here")).click();


    }
}
