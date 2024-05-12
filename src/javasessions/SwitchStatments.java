package javasessions;

public class SwitchStatments {

	public static void main(String[] args) {
		String browser="CHROME";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "Edge":
			System.out.println("launch Edge");
			break;

		default:
			System.out.println("Pass right browser");
			break;
		}
		
		
		
		}

	}

