package filereader;

import java.io.*;

/**
 * This class use to read file by file reader append to String.
 * @author Katapon Sinpunyawong.
 *
 */
public class AppendStringTask implements Runnable{
	
	/**Size of chars from file that read in this class*/
	private int size;
	
	public AppendStringTask() {
		this.size = 0;
	}
	
	/**
	 * read file by file reader append to String.
	 * @param filename
	 * @return data
	 */
	public static String readerFileToString(String filename) {
		
		String data = "";
		InputStreamReader reader = null;

		try {
			reader = new InputStreamReader(new FileInputStream(filename));
			
			int c;
			while((c = reader.read()) != -1) 
			{
				data = data + (char)c;
			}
			reader.close();
			
		}catch(FileNotFoundException fnf) {
			System.out.println("File not found "+ filename);
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		return data;
	}
	
	/**
	 * @return String to describe what this class read, read by 
	 * 		   and chars that read in this class. 
	 */
	@Override
	public String toString() {
		return String.format("Reading Alice-in-Wonderland.txt using FileReader, append to String.\nRead %d chars ",this.size);
	}

	/**
	 * run method to read file.
	 */
	@Override
	public void run() {
		String file = readerFileToString("src/filereader/Alice-in-Wonderland.txt");
		this.size = file.length();
	}
}
