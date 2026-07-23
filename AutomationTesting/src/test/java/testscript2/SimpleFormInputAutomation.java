package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class SimpleFormInputAutomation extends Base{

	public void inputTotal() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		// Input values
		WebElement input1=driver.findElement(By.xpath("//input[@id='value-a']"));
		input1.sendKeys("25");
		WebElement input2=driver.findElement(By.xpath("//input[@id='value-b']"));
		input2.sendKeys("15");
		WebElement gettotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		gettotal.click();
		WebElement output=driver.findElement(By.xpath("//div[@id='message-two']"));
		
		// Verify Get Total performs addition
		String x=output.getText();
		if(x.contains("40")) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
		SimpleFormInputAutomation obj=new SimpleFormInputAutomation();
		obj.browserInitialization();
		obj.inputTotal();
		obj.browserQuitAndClose();
	}

}
