package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base{

	public void tagAndId() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement button1=driver.findElement(By.cssSelector("button#button-one"));
		WebElement input1=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement input2=driver.findElement(By.cssSelector("input#single-input-field2"));
		WebElement button2=driver.findElement(By.cssSelector("button#button-two"));
	}
	
	public void tagAndClass() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement inputdate=driver.findElement(By.cssSelector("input.form-control"));
		WebElement message=driver.findElement(By.cssSelector("div.my-2"));
		driver.navigate().to("https://selenium.qabible.in/table-filter.php");	
		WebElement tablefilter=driver.findElement(By.cssSelector("div.dataTables_filter"));
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement inputmessage=driver.findElement(By.cssSelector("input.form-control"));
		
	}
	
	public void tagAndAttribute() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement showdate1=driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement inputdate1=driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement inputdate2=driver.findElement(By.cssSelector("input[id='single-input-field2']"));
		WebElement showdate2=driver.findElement(By.cssSelector("button[id='button-two']"));
	}
	
	public void tagClassAndAttribute() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement datepicker1=driver.findElement(By.cssSelector("input.form-control.datepicker[id='single-input-field']"));
		WebElement showdates1=driver.findElement(By.cssSelector("button.btn.btn-primary[id='button-one']"));
		WebElement datepicker2=driver.findElement(By.cssSelector("input.form-control[id='single-input-field2']"));
		WebElement showdates2=driver.findElement(By.cssSelector("button.btn.btn-primary[id='button-two']"));
	}
	
	public static void main(String[] args) {
		CssSelector obj=new CssSelector();
		obj.browserInitialization();
		obj.tagAndAttribute();
		System.out.println("1st method executed");
		obj.tagClassAndAttribute();
		System.out.println("2nd method executed");
	}

}
