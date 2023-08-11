import org.junit.jupiter.api.Test;
import com.sandra.pages.LoginPage;

public class LoginTest extends BaseTest {

  @Test
  public void testNavigateToLoginPage(){
    LoginPage loginPage = new LoginPage(driver, wait);

    loginPage.visit(URL + "#/login");
  }
}

