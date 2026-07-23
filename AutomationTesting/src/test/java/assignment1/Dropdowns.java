package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns extends WebDriverUniversityBase {
	
	public void dropdown() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement language=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select languageselect=new Select(language);
		languageselect.selectByVisibleText("Python");
		
		WebElement tool=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select toolselect=new Select(tool);
		toolselect.selectByValue("junit");
		
		WebElement frontend=driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select frontendselect=new Select(frontend);
		frontendselect.selectByIndex(1);
	}
	
	public void checkbox() {
		WebElement checkboxoption3=driver.findElement(By.xpath("//input[@value='option-3']"));
		if(checkboxoption3.isSelected()) {
			System.out.println("Checkbox- Option 3 selected by default.");
		}
		else {
			System.out.println("Checkbox- Option 3 not selected by default.");
		}
		WebElement checkboxoption4=driver.findElement(By.xpath("//input[@value='option-4']"));
		checkboxoption4.click();
	}
	
	public void radiobutton() {
		// Selecting color
		WebElement colorradiobutton=driver.findElement(By.xpath("//input[@value='yellow']"));
		colorradiobutton.click();
		
		// Selecting vegetables from disabled and default radio buttons
		WebElement vegbutton2=driver.findElement(By.xpath("//input[@value='cabbage']"));
		if(!(vegbutton2.isEnabled())) {
			System.out.println("Radio button- Option 2 Cabbage is not enabled.");
		}
		WebElement vegbutton3=driver.findElement(By.xpath("//input[@value='pumpkin']"));
		if(vegbutton3.isSelected()) {
			System.out.println("Radio button- Option 3 pumpkin selected by default.");
		}
		WebElement vegbutton1=driver.findElement(By.xpath("//input[@value='lettuce']"));
		vegbutton1.click();
		
		// Selecting fruits from default and disabled drop-down menu
		WebElement grape=driver.findElement(By.xpath("//option[@value='grape']"));
		if(grape.isSelected()) {
			System.out.println("Dropdown- Grape selected by default.");
		}
		WebElement orange=driver.findElement(By.xpath("//option[@value='orange']"));
		if(!(orange.isEnabled())) {
			System.out.println("Dropdown- Orange is not enabled.");
		}
		WebElement fruit=driver.findElement(By.xpath("//select[@id='fruit-selects']"));
		Select fruitselect=new Select(fruit);
		fruitselect.selectByVisibleText("Apple");
	}
	
	public static void main(String[] args) {
		Dropdowns obj=new Dropdowns();
		obj.initializeBrowser();
		obj.dropdown();
		obj.checkbox();
		obj.radiobutton();
		obj.closeBrowser();
	}

}
