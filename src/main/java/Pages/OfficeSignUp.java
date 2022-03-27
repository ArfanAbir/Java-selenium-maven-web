package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfficeSignUp {
    private final WebDriver driver;
    private final By loginIcon = By.id("mectrl_headerPicture");
    private final  By signUp = By.id("signup");
    private final By membarName = By.id("MemberName");
    private final By signUpNextBtn = By.id("iSignupAction");
    private final By signupPassword = By.id("PasswordInput");
    private final By optionEmail = By.id("iOptinEmail");
    private final By passwordNextBtn = By.id("iSignupAction");
    private final By puzzleSolve = By.id("pageControlHost");


    public OfficeSignUp(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnIcon(){
        driver.findElement(loginIcon).click();
    }
    public void createAccount(){
        driver.findElement(signUp).click();
    }
    public void enterYourEmailName(String name){
        driver.findElement(membarName).sendKeys(name);
    }

    public  void membarNameNextButton(){
        driver.findElement(signUpNextBtn).click();
    }

    public void enterYourPassword(String pass){
        driver.findElement(signupPassword).sendKeys(pass);
    }

    public  void optionEmailButton(){
        driver.findElement(optionEmail).click();
    }

    public void passwordNextButton(){
        driver.findElement(passwordNextBtn).click();
    }

    public void puzzleButton(){
        driver.findElement(puzzleSolve).click();
    }



}
