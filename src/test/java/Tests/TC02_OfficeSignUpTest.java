package Tests;

import Base.Base;
import Pages.OfficeSignUp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_OfficeSignUpTest  extends Base {

    @Test
    public void OfficeSignUpTest() throws InterruptedException {
        OfficeSignUp officeSignUp = homePage.clickToSignUp();
        String actualTitle = "Office 365 Login | Microsoft Office";
        String currentTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, currentTitle);
        Thread.sleep(4000);


        officeSignUp.clickOnIcon();
        String expectedTitle = "Sign in to your account";
        String newTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, newTitle);
        Thread.sleep(4000);

        officeSignUp.createAccount();
        Thread.sleep(3000);

        officeSignUp.enterYourEmailName("arfan.abir@outlook.com");
        Thread.sleep(3000);
        officeSignUp.membarNameNextButton();
        Thread.sleep(3000);


        officeSignUp.enterYourPassword("asdfgh123");
        Thread.sleep(3000);

        officeSignUp.optionEmailButton();
        Thread.sleep(3000);

        officeSignUp.passwordNextButton();
        Thread.sleep(3000);

        officeSignUp.puzzleButton();
        Thread.sleep(3000);







    }

}
