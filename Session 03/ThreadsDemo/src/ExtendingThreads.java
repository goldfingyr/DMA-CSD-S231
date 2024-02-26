
public class ExtendingThreads extends Thread {

	private String myString="";
	
	public ExtendingThreads( String initString ) {
		myString = initString;
	}
	
	public void run() {
		System.out.println( "ExtendingThreads (" + myString + ")");
	}

}
