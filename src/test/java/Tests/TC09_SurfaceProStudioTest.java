package Tests;

import Base.Base;
import Pages.SurfaceProStudio;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09_SurfaceProStudioTest extends Base {

    @Test
    public void SurfaceProLptop() throws InterruptedException {
        SurfaceProStudio surfaceProStudio = homePage.clickforLaptop();
        Thread.sleep(3000);
        surfaceProStudio.surfaceStudio();
        Thread.sleep(3000);

        String expectedTitle = "New Surface Laptop Studio – Infinitely flexible – Microsoft Surface";

        String currentTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, currentTitle);

    }


}
