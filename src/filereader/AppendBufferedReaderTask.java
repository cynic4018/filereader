package filereader;

import java.io.*;

/**
 * This class use to read file by BufferedReader append to String.
 * @author Katapon Sinpunyawong.
 *
 */
public class AppendBufferedReaderTask implements Runnable{

	/**Size of chars from file that read in this class*/
	private int size;
	
	public AppendBufferedReaderTask() {
		this.size = 0;
	}
	
	/**
	 * read file by BufferedReader append to String.
	 * @param filename
	 * @return data
	 */
	public static String readerBufferedFileToString(String filename) {
		
		BufferedReader reader = null;
		String data = "";
		
		try {
			
			reader = new BufferedReader(new FileReader(filename));
	
			String c;
			while((c = reader.readLine()) != null ) 
			{
				data = data + c + "\n";
			}
			reader.close();
			
		}catch(FileNotFoundException fnf) {
			System.out.println("File not found "+filename);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		return data;
	}

	/**
	 * @return String to describe what this class read, read by 
	 * 		   and chars that read in this class. 
	 */
	@Override
	public String toString() {
		return String.format("Reading Alice-in-Wonderland.txt using BufferedReader, append to String.\nRead %d chars ",this.size);
	}
	
	/**
	 * run method to read file.
	 */
	@Override
	public void run() {
		String file = readerBufferedFileToString("src/filereader/Alice-in-Wonderland.txt");
		this.size = file.length();
	}
}