package Tests;

import Base.BaseSurface;
import Pages.SurfaceLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06_surfaceLinkTest extends BaseSurface {

    @Test
    public  void SurfaceLinkTest() throws InterruptedException {
        SurfaceLink surfaceLink = homePage.clickOnSurface();
        Thread.sleep(5000);
        Thread.sleep(3000);
        surfaceLink.surfaceVerification();
        Thread.sleep(3000);
        String expetTitle ="Official Home of Microsoft Surface PCs, Computers, Laptops, 2-in-1s, Dual-Screen & All-in-Ones";
        String curtTitle = driver.getTitle();
        Assert.assertEquals(expetTitle, curtTitle);

    }

}
