import org.junit.jupiter.api.Test;
import com.sandra.pages.HomePage;

public class HomeTest extends BaseTest{

  @Test
  public void testNavigateToRegisterPage(){
    HomePage homePage = new HomePage(driver, wait);

    homePage.visit(URL);

    homePage.clickAccountButton();
    homePage.clickLoginButton();
  }
}
