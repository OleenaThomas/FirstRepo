package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Base {
	public WebDriver driver;
	public void browserInitialization() {
		driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();	
	}
	
	public void browserQuitAndClose() {
		driver.quit();
		//driver.close();
	}
	public static void main(String[] args) {
		Base obj=new Base();
		obj.browserInitialization();
		
	}

}
