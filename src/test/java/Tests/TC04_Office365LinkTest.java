package Tests;

import Base.BaseOffice365;
import Pages.Office365Link;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04_Office365LinkTest extends Base.BaseOffice365 {



    @Test
    public void Office365LinkVerification() throws InterruptedException {
        Office365Link office365Link = homePage.clickOn365Link();
        Thread.sleep(3000);
        office365Link.Office365Link();
        String expectedTitle = "Microsoft 365 - Subscription for Office Apps | Microsoft 365";
        Thread.sleep(3000);
        String undercurrent = driver.getTitle();
        Assert.assertEquals(expectedTitle, undercurrent);

    }
}
