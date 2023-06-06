package org.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExperimentPage {
    private WebDriver driver;
    private WebElement element;

    private WebElement anotherElement = driver.findElement(By.className(""));

    public ExperimentPage selectElement() {
        anotherElement.click();
        return this;
    }
}
