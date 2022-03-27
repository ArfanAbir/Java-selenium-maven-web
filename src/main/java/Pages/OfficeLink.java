package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfficeLink {

    private final WebDriver driver;
    private final By officeLink = By.xpath("//*[@id=\"uhfCatLogo\"]");

    public OfficeLink(WebDriver driver) {
        this.driver = driver;
    }

    public void OfficeLink(){
        driver.findElement(officeLink).click();
    }
}
