package browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        new EdgeDriver().navigate().to("https://vnexpress.net/");
    }
}
