package browsers;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OpenFFHeadless {
    public static void main(String[] args) {
        FirefoxBinary ffBn = new FirefoxBinary();
        ffBn.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver","C:/Windows/System32/geckodriver.exe");
        FirefoxOptions ffOpt = new FirefoxOptions();
        ffOpt.setBinary(ffBn);
        new FirefoxDriver(ffOpt);
    }
}
