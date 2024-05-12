package OOP_abstraction;

public abstract class Page {

	
	
	public abstract void title();
	public abstract void url();
	
	
	public void pageloadingtime() {
		System.out.println(" page loadtime");
	}
	
	
		public static void displaylogo()
		{
			System.out.println("logo Displayed");
		}
		
		
		public final void footers() {
			System.out.println("Display footers");
		}
	}

