package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckboxHandling extends Base {

	public void checkbox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement box1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
			boolean x=box1.isEnabled();
			System.out.println("Enabled: " +x);
			boolean y=box1.isDisplayed();
			System.out.println("Displayed: " +y);
		box1.click();
		WebElement message=driver.findElement(By.xpath("//div[contains(text(), 'Success - Check box is checked')]"));
		String actMessage=message.getText();
		System.out.println("Actual message: "+actMessage);
	}
	
	public void checkboxselected() {
		//driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement box1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		if(box1.isSelected()) {
			System.out.println("Checkbox already selected");
		}
		else {
			box1.click();
		}
	}
	public static void main(String[] args) {
		CheckboxHandling obj=new CheckboxHandling();
		obj.browserInitialization();
		obj.checkbox();
		obj.checkboxselected();
		obj.browserQuitAndClose();
	}

}
