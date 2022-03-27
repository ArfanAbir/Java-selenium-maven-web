package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Office365Link {

    private final WebDriver driver;
    private final By officeLink = By.xpath("//*[@id=\"uhfCatLogo\"]");

    public Office365Link(WebDriver driver) {
        this.driver = driver;
    }

    public void Office365Link(){
        driver.findElement(officeLink).click();
    }
}
