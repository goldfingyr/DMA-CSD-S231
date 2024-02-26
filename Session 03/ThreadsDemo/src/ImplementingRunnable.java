
public class ImplementingRunnable implements Runnable{

	private String myString="";
	
	public ImplementingRunnable( String initString ) {
		myString = initString;
	}
	
	public void run() {
		System.out.println( "ImplementingRunnable (" + myString + ")" );
		// The next section of dead code shows how a thread may be set sleeping
		if (false) {
			try {
				Thread.sleep(5000); // mS
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
