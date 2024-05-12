package Webdriver_Arch;

import Exception.MyException;

public class AmazonTest {

	public static void main(String[] args) {

		

		// ChromeDriver driver = new ChromeDriver();

		// FirefoxDriver driver = new FirefoxDriver();

		// SafariDriver driver = new SafariDriver();

		String browser = "chrome";//user input/xml/excel
		

		//cross browser logic -- with top casting -- switch case/if else
		//init the driver only once
		//parallel run
		
		WebDriver driver = null;
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
//		case "firefox":
//			driver = new FirefoxDriver();
//			break;
//		case "safari":
//			driver = new SafariDriver();
//			break;
		default:
			System.out.println("plz pass the right browser....");
			throw new MyException("no browser found");
		}

		driver.get("https://www.amazon.com");

		String title = driver.getTitle();
		System.out.println("title : " + title);

		if (title.equals("amazon")) {
			System.out.println("title is PASSED");
		} else {
			System.out.println("title is FAILED");
		}

		String url = driver.getURL();
		System.out.println(url);

		driver.findElement("logo");

		driver.sendKeys("username", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("loginbutton");

		driver.close();
		
	}

}
