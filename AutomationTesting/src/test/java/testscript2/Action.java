package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class Action extends Base{

	public void dragDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dragbox=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actobj=new Actions(driver);
		actobj.dragAndDrop(drag1, dragbox).perform();
	}
	
	public void rightclick() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actobj=new Actions(driver);
		actobj.contextClick(drag1).perform();
	}
	
	public void mousehover() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement others=driver.findElement(By.xpath("//a[@id='others']"));
		Actions actobj=new Actions(driver);
		actobj.moveToElement(others).perform();
	}
	
	public void dblclick() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragtext=driver.findElement(By.xpath("//h4[text()='Draggable Items List']"));
		Actions actobj=new Actions(driver);
		actobj.doubleClick(dragtext).perform();
	}
	
	public void click() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("John");
		
		WebElement showmessage=driver.findElement(By.id("button-one"));
		Actions actobj=new Actions(driver);
		actobj.click(showmessage).perform();
	}
	
	public static void main(String[] args) {
		Action obj=new Action();
		obj.browserInitialization();
		obj.dragDrop();
		obj.rightclick();
		obj.mousehover();
		obj.dblclick(); 
		obj.click();

	}

}
