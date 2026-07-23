package testscript2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base{

	public void simplealert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement gbutton=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		gbutton.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public void confirmationAlert() {
		WebElement ybutton=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		ybutton.click();
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
	}
	
	public void promptAlert() {
		WebElement rbutton=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		rbutton.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("John");
		alert.accept();
		//alert.dismiss();
	}
	
	public static void main(String[] args) {
		AlertHandling obj=new AlertHandling();
		obj.browserInitialization();
		obj.simplealert();
		obj.confirmationAlert();
		obj.promptAlert();
	}

}
