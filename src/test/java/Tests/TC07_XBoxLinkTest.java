package Tests;

import Base.BaseXbox;
import Pages.XboxLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07_XBoxLinkTest extends BaseXbox {

    @Test
    public void XboxLinkTest() throws InterruptedException {
        XboxLink xboxLink = homePage.clickOnXbox();
        Thread.sleep(3000);
        xboxLink.XboxLink();
        Thread.sleep(4000);
        String expectedTitle = "Xbox Official Site: Consoles, Games, and Community | Xbox";
        String currentTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, currentTitle);
        System.out.println("Your Current Title is: " + currentTitle);
        System.out.println("Your Expected Title is: " + expectedTitle);

    }
}
