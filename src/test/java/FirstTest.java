import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void testLoginPage() {
        System.setProperty(ConstantParameters.CHROME_KEY_PROPERTY, ConstantParameters.CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get(ConstantParameters.URL);
        driver.findElement(By.className("icon-link")).click();
    }
}
