package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactUs extends WebDriverUniversityBase{
	
	public void reset() {
		driver.navigate().to("https://webdriveruniversity.com/Contact-Us/contactus.html");
		WebElement fname=driver.findElement(By.xpath("//input[@name='first_name']"));
		fname.sendKeys("John");
		WebElement lname=driver.findElement(By.xpath("//input[@name='last_name']"));
		lname.sendKeys("Smith");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("johnsmith@gmail.com");
		WebElement comment=driver.findElement(By.xpath("//textarea[@name='message']"));
		comment.sendKeys("This is a comment.");
		WebElement reset=driver.findElement(By.xpath("//input[@type='reset']"));
		reset.click();
	}
	
	public void submit() {
		WebElement fname=driver.findElement(By.xpath("//input[@name='first_name']"));
		fname.sendKeys("John");
		WebElement lname=driver.findElement(By.xpath("//input[@name='last_name']"));
		lname.sendKeys("Smith");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("johnsmith@gmail.com");
		WebElement comment=driver.findElement(By.xpath("//textarea[@name='message']"));
		comment.sendKeys("This is a comment.");
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	}
	public static void main(String[] args) {
		ContactUs obj=new ContactUs();
		obj.initializeBrowser();
		obj.reset();
		obj.submit();
		obj.closeBrowser();
	}

}
