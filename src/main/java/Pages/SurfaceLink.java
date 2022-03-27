package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SurfaceLink {
    private final WebDriver driver;

    private  final By surface = By.xpath("//a[@id='uhfCatLogo']");
    private final By alert = By.xpath("//*[@id=\"WF-Modal-1\"]/button");

    public SurfaceLink(WebDriver driver) {
        this.driver = driver;
    }

    public void surfaceVerification(){
        driver.findElement(surface).click();
    }
    public void alertManage(){
         driver.findElement(alert).click();
    }
}
