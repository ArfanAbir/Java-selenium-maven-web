package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SurfaceGo3 {
    private final WebDriver driver;
    private final By studio  = By.xpath("//*[@id=\"uhf-footer\"]/nav/div[1]/div[1]/ul/li[4]/a");
    private final By stay = By.xpath("//*[@id=\"R1MarketRedirect-1\"]/button");



    public SurfaceGo3(WebDriver driver) {
        this.driver = driver;
    }
    public void surfaceGo3(){
        driver.findElement(studio).click();
    }

    public void stayButton(){
        driver.findElement(stay).click();
    }




}
