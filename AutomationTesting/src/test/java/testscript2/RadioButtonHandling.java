package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButtonHandling extends Base{

	public void radioButton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement button1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		button1.click();
		WebElement show=driver.findElement(By.xpath("//button[@id='button-one']"));
		show.click();
	}
	
	public void radioButtonHandling() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement button1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		if(button1.isSelected()) {
			System.out.println("Female radio button selected already");
		}
		else {
			button1.click();
		}
	}
	public static void main(String[] args) {
		RadioButtonHandling obj=new RadioButtonHandling();
		obj.browserInitialization();
		//obj.radioButton();
		obj.radioButtonHandling();

	}

}
