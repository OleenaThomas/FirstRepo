package testscript;

public class NavigationCommands extends Base {

	public void navigationCommands(){
		driver.navigate().to("https:amazon.ca");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	
	public static void main(String[] args) {
		NavigationCommands obj=new NavigationCommands();
		obj.browserInitialization();
		obj.navigationCommands();
		//obj.browserQuitAndClose();
	}

}
