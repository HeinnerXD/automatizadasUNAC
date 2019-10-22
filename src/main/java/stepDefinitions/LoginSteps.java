package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginPage;
import pages.homePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	loginPage LoginPage;
	homePage HomePage;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		LoginPage = new loginPage(driver);
		HomePage = new homePage(driver);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("el usuario esta en la pagina de login")
	public void usuarioEstaEnLogin() {
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	}

	@When("^el usuario ingresa credenciales validas \"(.*)\"$")
	public void usuarioIngresaEmail(String email) {
		LoginPage.setUser(email);

	}

	@And("^y el password \"(.*)\"$")
	public void usuarioIngresaContrasenia(String password) {
		LoginPage.setPassword(password);
		LoginPage.clickLoginButton();
	}

	@Then("^el usuario puede ver su panel de administracion\"(.*)\"$")
	public void usuarioEnElHome(String message) {
		HomePage.logGedInSuccessfullly();

	}

}
