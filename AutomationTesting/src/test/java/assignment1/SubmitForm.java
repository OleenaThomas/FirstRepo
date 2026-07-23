package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class SubmitForm extends Base{

	public void form() {
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		WebElement fname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		fname.sendKeys("John");
		WebElement lname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lname.sendKeys("Smith");
		WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		username.sendKeys("johnsmith");
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys("TVM");
		WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		state.sendKeys("Kerala");
		WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zip.sendKeys("111000");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		checkbox.click();
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}
	
	public static void main(String[] args) {
		SubmitForm obj=new SubmitForm();
		obj.browserInitialization();
		obj.form();
		obj.browserQuitAndClose();
	}

}
