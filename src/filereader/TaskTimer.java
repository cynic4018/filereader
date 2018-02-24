package filereader;

/**
 * This class use run method in task classes(that implements from Runnable) 
 * to run step follow this run method.
 *    
 * @author Katapon Sinpunyawong.
 *
 */
public class TaskTimer {

	public static void run(Runnable runnable) {
	
		Stopwatch timer = new Stopwatch();
		
		timer.start();
		runnable.run();
		timer.stop();
		System.out.printf("%s in %.6f sec. \n", runnable.toString(), timer.getElapsed());
	}
}
