import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium.ConstantParameters;

public class SeleniumIntroduction {
    /**
     * This class is basic and some kind of base class to invoke
     * webdriver and use the methods which are in it.
     * @param args
     */
    public static void main(String[] args) {
        /*
        invoke driver, the instance is from the WebDriver interface, so now we can use only the methods
        from the interface, methods from the class ChromeDriver are not visible for this instance.
         */

        /*
        Path to the driver and set up the web driver,
        also change the path if you are going to use the project from other local machine,
        and you have to add the extension of the used file, with the name of the file.
         */
//        System.setProperty(org.selenium.ConstantParameters.CHROME_KEY_PROPERTY, org.selenium.ConstantParameters.CHROME_DRIVER_PATH);
        System.setProperty(ConstantParameters.FIREFOX_KEY_PROPERTY, ConstantParameters.FIREFOX_DRIVER_PATH);
//        System.setProperty(org.selenium.ConstantParameters.EDGE_KEY_PROPERTY, org.selenium.ConstantParameters.EDGE_DRIVER_PATH);

        //initialize the driver
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new EdgeDriver();
        driver.get(ConstantParameters.URL);//get and open the target URL site
//        driver.manage().window().fullscreen(); //browser goes to full screen
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cross close")));
        driver.findElement(By.xpath("/html/body/aside/div/div/div/button[1]")).click();
        driver.findElement(By.cssSelector("div.authorization-link > span:nth-child(1)")).click();


        driver.close();//closes the current window, quit method closes all associated windows
    }
}
