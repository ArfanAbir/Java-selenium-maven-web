package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfficeSignIn {
    private final WebDriver driver;
    private final By loginIcon = By.id("mectrl_headerPicture");
    private final By signInEmail = By.id("i0116");
    private final By signinNextBtn = By.id("idSIButton9");
    private final By signinPassword = By.id("i0118");
    private final By passwordNextBtn = By.id("idSIButton9");
    private final By stayTurn = By.id("KmsiCheckboxField");
    private final By backBtn = By.id("idBtn_Back");

    public OfficeSignIn(WebDriver driver) {
        this.driver = driver;
    }
    public void accountIcon(){
        driver.findElement(loginIcon).click();
    }
    public void enterYourEmail(String email){
        driver.findElement(signInEmail).sendKeys(email);
    }
    public void signInNextButton(){
        driver.findElement(signinNextBtn).click();
    }
    public void enterYourPassword(String pass){
        driver.findElement(signinPassword).sendKeys(pass);
    }
    public void passwordNextButton(){
        driver.findElement(passwordNextBtn).click();
    }

    public  void remembarPassword(){
        driver.findElement(stayTurn).click();
    }

    public  void backButton(){
        driver.findElement(backBtn).click();
    }

}
