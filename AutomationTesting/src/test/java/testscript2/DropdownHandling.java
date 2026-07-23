package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropdownHandling extends Base{

	public void visibleText() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement colordrop=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selobj=new Select(colordrop);
		selobj.selectByVisibleText("Red");
	}
	
	public void value() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement colordrop=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selobj=new Select(colordrop);
		selobj.selectByValue("Yellow");
	}
	
	public void index() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement colordrop=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selobj=new Select(colordrop);
		selobj.selectByIndex(3);
	}
	
	public static void main(String[] args) {
		DropdownHandling obj=new DropdownHandling();
		obj.browserInitialization();
		obj.visibleText();
		obj.value();
		obj.index();
	}

}
