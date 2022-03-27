package Tests;

import Base.Base;
import Pages.SurfaceGo3;
import org.testng.annotations.Test;

public class TC10_SurfaceGo3Test extends Base {

    @Test
    public void SurfaceGo3Test() throws InterruptedException {
        SurfaceGo3 surfaceGo3 = homePage.clickforsufacego3();
        Thread.sleep(3000);
        surfaceGo3.surfaceGo3();
        Thread.sleep(3000);
        surfaceGo3.stayButton();
        Thread.sleep(3000);
        String expectedTitle = "Surface Go 3 - Most portable 2-in-1 tablet & laptop - Microsoft Surface";
        String currentTitle = driver.getTitle();

    }
}
