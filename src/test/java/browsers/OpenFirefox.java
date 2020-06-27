package browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
    public static void main(String[] args) {

        new FirefoxDriver().navigate().to("https://vnexpress.net/");
    }
}
