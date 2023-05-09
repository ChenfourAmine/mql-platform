package org.mql.platform.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Examples {

	public Examples() {
		exp01();
	}
	
	public void exp01() {
		System.setProperty("webdriver.chrome.driver", "/Users/elmehdichenfourmac/browser-drivers/chromedriver_mac64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/elmehdichenfourmac/Workspace/Amine/MQL/Pr%C3%A9sentations/workspace/Gradle/mql-platform/src/main/resources/static/index.html");
		WebElement title = driver.findElement(By.tagName("h1"));
		System.out.println("title : " + title.getText());
	    driver.quit();
	}
	
	public void exp02() {

	}
	
	public static void main(String[] args) {
		new Examples();
	}

}
