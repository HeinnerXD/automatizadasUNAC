package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	WebDriver driver;

	public homePage(WebDriver driver) {
		this.driver = driver;
	}

	public void logGedInSuccessfullly() {
		driver.findElement(By.id("conf_message")).getText();
	}

}
