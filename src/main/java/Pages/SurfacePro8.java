package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SurfacePro8 {
    private final WebDriver driver;
    private final By surfacepro8 = By.xpath("//a[contains(text(),'Surface Pro 8')]");
    private final By alertDelete = By.xpath("//*[@id=\"R1MarketRedirect-1\"]/button");

    public SurfacePro8(WebDriver driver) {
        this.driver = driver;
    }

    public void SurfacePro8Link(){
        driver.findElement(surfacepro8).click();
    }
    public  void AlertDelete(){
        driver.findElement(alertDelete).click();
    }
}
