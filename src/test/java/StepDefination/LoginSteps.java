package StepDefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		lp = new LoginPage(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@When("User enter Email as {string} and password is {string}")
	public void user_enter_email_as_and_password_is(String email, String password) {
		lp.setUsername(email);
		lp.setPassword(password);

	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		lp.clickLogin();
		Thread.sleep(3000);
	}

	@Then("Page titile should be {string}")
	public void page_titile_should_be(String titile) {
		String exptitile = driver.getTitle();
		Assert.assertEquals(titile, exptitile);
	}

	@Then("User Close browser")
	public void user_close_browser() {
		driver.quit();
	}

}
