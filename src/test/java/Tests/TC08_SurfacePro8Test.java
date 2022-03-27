package Tests;

import Base.Base;
import Pages.SurfacePro8;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC08_SurfacePro8Test extends Base {

    @Test
    public void SurfacePro8Test() throws InterruptedException {
        SurfacePro8 surfacePro8 = homePage.clickforsurfacepro8();
        Thread.sleep(3000);
        surfacePro8.SurfacePro8Link();
        Thread.sleep(5000);
        surfacePro8.AlertDelete();
        Thread.sleep(3000);
        String expected = "Surface Pro 8 – The most powerful Pro – Microsoft Surface";
        String currentTitle = driver.getTitle();
        Assert.assertEquals(expected, currentTitle);
    }
}
