package testscript;

public class BrowserCommands extends Base {
	public void browserCommands() {
		//String title= driver.getTitle();
		//System.out.println(title);
		//String currentURL=driver.getCurrentUrl();
		//System.out.println(currentURL);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}
	public static void main(String[] args) {
		BrowserCommands bc=new BrowserCommands();
		bc.browserInitialization();
		bc.browserCommands();
		bc.browserQuitAndClose();
	}

}
