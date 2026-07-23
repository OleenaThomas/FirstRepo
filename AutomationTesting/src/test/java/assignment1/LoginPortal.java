package assignment1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPortal extends WebDriverUniversityBase {
	
	public void login() {
		driver.navigate().to("https://webdriveruniversity.com/Login-Portal/index.html");
		WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
		username.sendKeys("johnsmith@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("qwe12");
		WebElement login=driver.findElement(By.xpath("//button[@id='login-button']"));
		login.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public static void main(String[] args) {
		LoginPortal obj=new LoginPortal();
		obj.initializeBrowser();
		obj.login();
		obj.closeBrowser();
	}

}
