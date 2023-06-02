import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        System.setProperty(ConstantParameters.CHROME_KEY_PROPERTY, ConstantParameters.CHROME_DRIVER_PATH);
//        System.setProperty(ConstantParameters.FIREFOX_KEY_PROPERTY, ConstantParameters.FIREFOX_DRIVER_PATH);
//        System.setProperty(ConstantParameters.EDGE_KEY_PROPERTY, ConstantParameters.EDGE_DRIVER_PATH);

        //initialize the driver
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new EdgeDriver();
        driver.get(ConstantParameters.URL);//get and open the target URL site
        driver.manage().window().fullscreen(); //browser goes to full screen
        driver.close();//closes the current window, quit method closes all associated windows
    }
}
