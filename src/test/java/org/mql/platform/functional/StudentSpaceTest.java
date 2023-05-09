package org.mql.platform.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentSpaceTest {
	@Test
	void testTitle() {
		System.setProperty("webdriver.chrome.driver", "/Users/elmehdichenfourmac/browser-drivers/chromedriver_mac64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/elmehdichenfourmac/Workspace/Amine/Projects/Tazec-Games-Project/tazec-games/src/webApp/index.html");
		//WebElement title = driver.findElement(By.tagName("h1"));
	    assertEquals(driver.getTitle(), "Tazec Games");
	    driver.quit();
	}
}
