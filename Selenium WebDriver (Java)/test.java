import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class test extends TestCase {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void test_hackathon(){

        driver.get("http://testerzy.pl");
        driver.findElement(By.id("mod-search-searchword")).sendKeys("hackathon dev qa");
        driver.findElement(By.className("button")).click();

        assertTrue(driver.findElement(By.className("result-title")).getText().contains("Hackathon"));
        driver.quit();
    }
}
