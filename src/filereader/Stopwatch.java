package filereader;
/**
 * Stopwatch class use to count the time 
 * that elapsed when reading text file.
 * 
 * @author Katapon Sinpunyawong.
 *
 */
public class Stopwatch {
	
	private final double NANOSECOND = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean running;
	
	/**
	 * Start timer of stopwatch.
	 */
	public void start() {
		if(running) return;
		running = true;
		startTime = System.nanoTime();
	}
	
	/**
	 * Stop timer of stopwatch.
	 */
	public void stop() {
		if(!running) return;
		running = false;
		stopTime = System.nanoTime();
	}
	
	/**
	 * Check status of stopwatch is running.
	 * @return running status.
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * Get elapsed time 
	 * @return time that count from start if stopwatch is running.
	 * 		   time that count starttime until stoptime if stopwatch is not running(stop).
	 */
	public double getElapsed() {
		
		if(running) return (System.nanoTime() - startTime)*NANOSECOND;
		else return (stopTime - startTime)*NANOSECOND;
	}
}
