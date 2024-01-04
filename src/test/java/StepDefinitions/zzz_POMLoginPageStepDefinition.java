/*
 * package StepDefinitions;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import PageObject.LoginPage; import io.cucumber.java.en.*;
 * 
 * public class POMLoginPageStepDefinition {
 * 
 * WebDriver driver; LoginPage login;
 * 
 * @Given("User launches saucedemo webpage") public void
 * user_launches_saucedemo_webpage() { driver = new ChromeDriver();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 * driver.get("https://www.saucedemo.com/v1/"); }
 * 
 * @When("User enter {string}")
 * 
 * public void user_enter(String username){ login = new LoginPage(driver);
 * login.enterUsername(username);
 * 
 * }
 * 
 * @When("User enters {string}") public void user_enters(String password){
 * //login = new LoginPage(); login.enterPassword(password); }
 * 
 * @Then("User clicks on login button") public void
 * user_clicks_on_login_button() { //login = new LoginPage();
 * login.clickLogin();
 * 
 * }
 * 
 * @Then("User navigates to home page") public void
 * user_navigates_to_home_page() { //login = new LoginPage();
 * login.isHomePageDisplayed();
 * 
 * }
 * 
 * @Then("User closes the browser") public void user_closes_the_browser() {
 * driver.close(); }
 * 
 * }
 */
package StepDefinitions;

