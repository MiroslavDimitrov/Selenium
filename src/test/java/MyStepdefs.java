import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver = new ChromeDriver();
    @io.cucumber.java.en.Given("Open site Home page")
    public void openSiteHomePage() {
        System.setProperty(ConstantParameters.CHROME_KEY_PROPERTY, ConstantParameters.CHROME_DRIVER_PATH);
        driver.get(ConstantParameters.URL);//get and open the target URL site
    }
}
