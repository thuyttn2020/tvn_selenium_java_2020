package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenCocCoc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver_v80.exe");
        String CocCoc_path = "C:/Users/WN/AppData/Local/CocCoc/Browser/Application/browser.exe";
        ChromeOptions options = new ChromeOptions();
        options.setBinary(CocCoc_path);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://vnexpress.net");

    }

}
