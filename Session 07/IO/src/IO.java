// Skeleton app for IO app(s)
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO {

	private static int lineCount(String path, boolean doDance){
		if ( ! doDance ) return -1;
		  try {
			FileInputStream fis = new FileInputStream(path);
			  int cnt = 0;
			  int b;
				while ((b = fis.read()) != -1) {
				    if (b == '\n') cnt++;
				  }
			  fis.close();
			  return cnt;	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return -1;
	}

	
	public static void main(String[] args) {
		// Measure the call time
		long startTime = System.nanoTime();
		lineCount("", false);
		long dryRun = System.nanoTime() - startTime;
		// Measure compute + call time
		startTime = System.nanoTime();
		int lines = lineCount("input.txt", true);
		long stopTime = System.nanoTime();
		// Print report
		System.out.println("Lines: " + String.valueOf(lines));
		System.out.println("Time to complete: " + (stopTime - startTime - dryRun) + "  " + dryRun);
	}

}
