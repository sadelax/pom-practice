package com.sandra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

  private By registerLinkLocator = By.cssSelector(".primary-link[routerlink='/register']");
  private By btnAccount =  By.cssSelector("button#navbarAccount");
  private By btnLogin = By.cssSelector("button#navbarLoginButton");
  private By emailInput =  By.cssSelector("input#emailControl");
  private By pwdInput = By.xpath("//*[@id=\"password\"]");


  public LoginPage(WebDriver driver, WebDriverWait wait) {
    super(driver, wait);
  }

  public void clickRegisterLink() {
    click(registerLinkLocator);
  }
  public void setEmail(String email) {
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emailInput));
    element.clear();
    element.sendKeys(email);
  }

  public void setPwd(String pwd) {
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pwdInput));
    element.clear();
    element.sendKeys(pwd);
  }

  /*public void submit() {
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
    element.click();
  }*/
}
