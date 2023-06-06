package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium.ConstantParameters;
import org.selenium.common.ExperimentPage;
import org.selenium.common.MethodsDemo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
    private WebDriver driver = new FirefoxDriver();
    private ExperimentPage experimentPage = new ExperimentPage();

    @BeforeMethod
    public void Start() {
        System.setProperty(ConstantParameters.FIREFOX_KEY_PROPERTY, ConstantParameters.FIREFOX_DRIVER_PATH);
        driver.get(ConstantParameters.URL);
    }

    @Test
    public void Experiment() {
        experimentPage.selectElement();
    }

    @AfterMethod
    public void Quit() {
        driver.quit();
    }
}
