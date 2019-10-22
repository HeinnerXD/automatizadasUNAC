package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUser(String name) {
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys(name);
	}

	public void setPassword(String password) {
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}

	public void invalidPassword() {
		driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
	}

	public void invalidUser() {
		driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
	}

}
