package Tests;

import Base.Base;
import Pages.OfficeLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05_OfficeLinkTest extends Base {



    @Test
    public void OfficeLinkVerification() throws InterruptedException {
        OfficeLink office365Link = homePage.clickOnLink();
        Thread.sleep(3000);
        office365Link.OfficeLink();
        String expectedTitle = "Office 365 Login | Microsoft Office";
        Thread.sleep(3000);
        String undercurrent = driver.getTitle();
        Assert.assertEquals(expectedTitle, undercurrent);

    }
}
