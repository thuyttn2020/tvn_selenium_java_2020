package locateElements;

import org.openqa.selenium.support.How;
import supports.Browser;

import static supports.Browser.*;

public class CheckboxTest {
    public static void main(String[] args) {
        openBrowser("chrome");
        visit("https://the-internet.herokuapp.com/checkboxes");
        uncheck(How.XPATH, "//form[@id='checkboxes]/input[1]");
        uncheck(How.XPATH, "//form[@id='checkboxes]/input[2:]");

        if (!find(How.XPATH,"//form[@id='checkboxes]/input[1]").isSelected()){
            click(How.XPATH, "//form[@id='checkboxes]/input[1]");
        }
        click(How.XPATH, "//form/*[1]"); // check cb1
        click(How.XPATH, "//form[@id='checkboxes]/input[2]"); //uncheck cb2
        click(How.XPATH, "//form/*[2]"); // check cb1
        click(How.XPATH, "//input[1]"); //-> uncheck cb1

    }
}
