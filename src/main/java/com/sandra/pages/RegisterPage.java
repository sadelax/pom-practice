package com.sandra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {

  private By emailInputLocator =  By.cssSelector("input#emailControl");
  private By pwdInputLocator = By.cssSelector("input#passwordControl");
  private By pwd2InputLocator = By.cssSelector("input#repeatPasswordControl");
  private By matSelectLocator = By.cssSelector("span.mat-select-placeholder.mat-select-min-line.ng-tns-c30-15.ng-star-inserted");
  private By firstOptLocator = By.cssSelector("span.mat-option-text");
  private By securityAnswerInputLocator = By.cssSelector("input#securityAnswerControl");
  private By registerBtnLocator = By.cssSelector("span.mat-button-wrapper > i.material-icons");

  public RegisterPage(WebDriver driver, WebDriverWait wait) {
    super(driver, wait);
  }

  public void clickRegisterBtn() {
    click(registerBtnLocator);
  }

  public void setEmail(String email) {
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emailInputLocator));
    element.clear();
    element.sendKeys(email);
  }

  public void setPwd(String pwd) {
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pwdInputLocator));
    element.clear();
    element.sendKeys(pwd);
  }

  public void setRepeatPwd(String pwd){
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pwd2InputLocator));
    element.clear();
    element.sendKeys(pwd);
  }

  public void setSecurityAnswer(String answer){
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
        securityAnswerInputLocator));
    element.clear();
    element.sendKeys(answer);
  }

  public void setMatSelect(){
    WebElement matSelectElement = wait.until(ExpectedConditions.elementToBeClickable(matSelectLocator));
    matSelectElement.click();
    WebElement optElement = wait.until(ExpectedConditions.elementToBeClickable(firstOptLocator));
    optElement.click();
  }

  public void submit() {
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(registerBtnLocator));
    element.click();
  }
}
