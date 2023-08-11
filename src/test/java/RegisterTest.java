import org.junit.jupiter.api.Test;
import com.sandra.pages.HomePage;
import com.sandra.pages.RegisterPage;

public class RegisterTest extends BaseTest {

  @Test
  public void testRegistrationWithExampleValues() {
    RegisterPage registerPage = new RegisterPage(driver, wait);
    HomePage homePage = new HomePage(driver, wait);

    registerPage.visit(URL + "/#/register");

    String email = "test@example.com";
    String password = "password123!";
    String answer = "ExampleAnswer";

    registerPage.setEmail(email);
    registerPage.setPwd(password);
    registerPage.setRepeatPwd(password);
    registerPage.setMatSelect();
    registerPage.setSecurityAnswer(answer);
    registerPage.submit();
  }
}