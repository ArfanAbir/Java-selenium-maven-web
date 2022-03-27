package Tests;

import Base.Base;
import Pages.OfficeSignIn;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_OfficeSignIn extends Base {

    @Test
    public void OfficeSignInTest() throws InterruptedException {
        OfficeSignIn officeSignIn = homePage.clickToSignIn();
        Thread.sleep(3000);
        officeSignIn.accountIcon();
        Thread.sleep(4000);
        officeSignIn.enterYourEmail("nazrul.qups@outlook.com");
        Thread.sleep(3000);
        officeSignIn.signInNextButton();
        Thread.sleep(4000);
        officeSignIn.enterYourPassword("asdfgh123");
        Thread.sleep(3000);
        officeSignIn.passwordNextButton();
        Thread.sleep(2000);
        officeSignIn.remembarPassword();
        Thread.sleep(2000);
        officeSignIn.backButton();
        Thread.sleep(4000);

        String expectedTitle = "Microsoft Office Home";
        String currentTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, currentTitle);

        Thread.sleep(5000);


    }
}
