package OOP_encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launch browser");
		checkBrowserVersion();
		checkOSCompatibility();
		checkRAMSpace();
		checkUpdatesAvailable();
		System.out.println("browser is launched");
	}

	private void checkBrowserVersion() {
		System.out.println("launch browser version");
		
	}

	private void checkOSCompatibility() {
		System.out.println("launch browser with OSCompatibility");
		
	}

	private void checkRAMSpace() {
		System.out.println("checkRAMSpace");
	}

	private void checkUpdatesAvailable() {
		System.out.println("checkUpdatesAvailable");
	}
	
	
	
}