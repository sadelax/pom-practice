package com.sandra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

  private By btnAccountLocator =  By.cssSelector("button#navbarAccount");
  private By btnLoginLocator = By.cssSelector("button#navbarLoginButton");

  public HomePage(WebDriver driver, WebDriverWait wait) {
    super(driver, wait);
  }

  public void clickAccountButton() {
    click(btnAccountLocator);
  }

  public void clickLoginButton() {
    click(btnLoginLocator);
  }



}
