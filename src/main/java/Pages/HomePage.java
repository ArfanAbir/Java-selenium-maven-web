package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public OfficeHomePage clickToOpen(){
        return  new OfficeHomePage(driver);
    }

    public OfficeSignUp clickToSignUp(){
        return  new OfficeSignUp(driver);
    }

    public  OfficeSignIn clickToSignIn(){
        return  new OfficeSignIn(driver);
    }

    public Office365Link clickOn365Link(){
        return new Office365Link(driver);
    }

    public OfficeLink clickOnLink(){
        return  new OfficeLink(driver);
    }

    public SurfaceLink clickOnSurface(){
        return new SurfaceLink(driver);
    }

    public XboxLink clickOnXbox(){
        return new XboxLink(driver);
    }


    public SurfacePro8 clickforsurfacepro8(){
        return new SurfacePro8(driver);
    }

    public SurfaceProStudio clickforLaptop(){
        return new SurfaceProStudio(driver);
    }

    public SurfaceGo3 clickforsufacego3(){
        return new SurfaceGo3(driver);
    }



}
