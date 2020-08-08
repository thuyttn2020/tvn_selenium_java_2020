package supports;

import com.google.gson.internal.$Gson$Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
    private static WebDriver driver;
    private static final int TIME_OUT_IN_SECONDS = 60;
    public static WebDriverWait wait;
    public static WebDriver openBrowser(String ...browser) {
        String name = browser[0];
        switch (name.toLowerCase()) {
            case "chrome": {
                if (browser.length == 2 && browser[1].equalsIgnoreCase("headless")) {
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--headless");
                    return driver = new ChromeDriver(chromeOptions);
                }

            }
                return driver = new ChromeDriver();

            case "firefox":
                return driver = new FirefoxDriver();
            case "edge":
                return driver = new EdgeDriver();
            case "ie":
                return driver = new InternetExplorerDriver();
            case "safari":
                return driver = new SafariDriver();
            case "coccoc":
            {
                System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver_v80.exe");
                String CocCoc_path = "C:/Users/WN/AppData/Local/CocCoc/Browser/Application/browser.exe";
                ChromeOptions options = new ChromeOptions();
                options.setBinary(CocCoc_path);
                return driver = new ChromeDriver(options);
            }
        }
        wait = new WebDriverWait(getDriver(),TIME_OUT_IN_SECONDS);

        throw new IllegalArgumentException("The browser " + name + " is not supported");

    }
    public static WebDriver getDriver(){
        return driver;
    }
    public static String getText(How by, String locator){
        return wait
                .until(
                        ExpectedConditions
                                .visibilityOfElementLocated(by.buildBy(locator)))
                .getText();

    }
    public static String getText(By by){
        return find(by).getText();
    }
    public static void visit (String url){
        driver.get(url);
    }
    public static WebElement find (How by, String locator){
        return driver.findElement(by.buildBy(locator));
    }
    public static WebElement find (By by){ return driver.findElement(by);}
    public static void fill (How by, String locator, String txt){
        driver.findElement(by.buildBy(locator)).sendKeys(txt);
    }
    public static void fill (By by, String txt){
        driver.findElement(by).sendKeys(txt);
    }
    public static void click (How by, String locator){
        driver.findElement(by.buildBy(locator)).click();
    }
    public static void click (By by){
        driver.findElement(by).click();
    }
    public static void main(String[] args) {
        openBrowser("ie");
        openBrowser("coccoc");
    }
    public static void tearDown(){
        driver.quit();
    }
}
