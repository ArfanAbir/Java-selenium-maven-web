package Tests;

import Base.Base;
import Pages.OfficeHomePage;
import org.testng.annotations.Test;

public class TC01_OfficeHomeTest extends Base {

    @Test
    public void OfficeOpen(){
        OfficeHomePage officeHomePageTest = homePage.clickToOpen();
    }

}
