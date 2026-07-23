package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void id() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("John");
		
		WebElement showmessage=driver.findElement(By.id("button-one"));
		showmessage.click();
		
		WebElement firstmessage=driver.findElement(By.id("message-one"));
		WebElement firstvalue=driver.findElement(By.id("value-a"));
		WebElement secondvalue=driver.findElement(By.id("value-b"));
	}
	
	public void name() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement enterdates=driver.findElement(By.name("daterange"));
		
		driver.navigate().to("https://selenium.qabible.in/jquery-date-picker.php");
		WebElement daterangepickerfrom=driver.findElement(By.name("from"));
		WebElement daterangepickerto=driver.findElement(By.name("to"));
		
		driver.navigate().to("https://selenium.qabible.in/table-filter.php");
		WebElement tablefilter=driver.findElement(By.name("example_length"));	
	}
	
	public void classname() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement enterdates=driver.findElement(By.className("form-control"));
	
		driver.navigate().to("https://selenium.qabible.in/jquery-date-picker.php");
		WebElement datepicker=driver.findElement(By.className("my-2"));
	
		driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
		WebElement navbar=driver.findElement(By.className("navbar-toggler"));
		
		driver.navigate().to("https://selenium.qabible.in/table-filter.php");
		WebElement tablefilter=driver.findElement(By.className("dataTables_filter"));
	}
	
	public void linktext() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement bootstrap=driver.findElement(By.linkText("Bootstrap Date Picker"));
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tablepagination=driver.findElement(By.linkText("Table with Pagination"));
		WebElement tablesortandsearch=driver.findElement(By.linkText("Table Sort And Search"));
		WebElement tabledatadownload=driver.findElement(By.linkText("Table Data Download"));
	}
	
	public void partiallinktext() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement bootstrappartial=driver.findElement(By.partialLinkText("Bootstrap Date"));
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tablepagination=driver.findElement(By.partialLinkText("Table with"));
		WebElement tablesortandsearch=driver.findElement(By.partialLinkText("Sort And Search"));
		WebElement tabledatadownload=driver.findElement(By.partialLinkText("Table Data"));		
	}
	
	public static void main(String[] args) {
		Locators obj=new Locators();
		obj.browserInitialization();
		obj.id();
	}

}
