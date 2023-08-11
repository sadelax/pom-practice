package com.sandra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

  protected WebDriver driver;
  protected WebDriverWait wait;

  public BasePage(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void visit(String url) {
    driver.get(url);
  }

  protected void click(By locator) {
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    element.click();
  }

}
