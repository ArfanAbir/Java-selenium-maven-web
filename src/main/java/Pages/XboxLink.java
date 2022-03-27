package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XboxLink {
    private final WebDriver driver;
    private final By xbox = By.xpath("//*[@id=\"uhfCatLogo\"]");

    public XboxLink(WebDriver driver) {
        this.driver = driver;
    }

    public void XboxLink(){
        driver.findElement(xbox).click();
    }
}
