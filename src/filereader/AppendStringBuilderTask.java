package filereader;

import java.io.*;

/**
 * This class use to read file by file reader append to StringBuilder.
 * @author Katapon Sinpunyawong.
 *
 */
public class AppendStringBuilderTask implements Runnable{
	
	/**Size of chars from file that read in this class*/
	private int size;
	
	public AppendStringBuilderTask() {
		this.size = 0;
	}
	
	/**
	 * read file by file reader append to StringBuilder.
	 * @param filename
	 * @return data
	 */
	public static String readerFileToStringBuilder(String filename) {
		
		StringBuilder data = new StringBuilder();
		InputStreamReader reader = null;
		
		try {
			reader = new InputStreamReader(new FileInputStream(filename));
			
			int c;
			while((c = reader.read()) != -1) 
			{
				data = data.append((char)c);
			}
			reader.close();
			
		}catch(FileNotFoundException fnf) {
			
			System.out.println("File not found "+filename);
			
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		if(reader != null) 
		try{
			reader.close();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		return data.toString();
	}
	
	/**
	 * @return String to describe what this class read, read by 
	 * 		   and chars that read in this class. 
	 */
	@Override
	public String toString() {
		return String.format("Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.\nRead %d chars ",this.size);
	}

	/**
	 * run method to read file.
	 */
	@Override
	public void run() {
		String file = readerFileToStringBuilder("src/filereader/Alice-in-Wonderland.txt");
		this.size = file.length();
	}
	
}