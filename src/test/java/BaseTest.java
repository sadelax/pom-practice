import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

  protected WebDriver driver;
  protected WebDriverWait wait;
  protected static final String URL = "http://localhost:3000";

  @BeforeEach
  public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    System.out.println("entra?");
    driver.get(URL);
    System.out.println("sip");
  }

  @AfterEach
  public void teardown() {
    //driver.quit();
  }

}
