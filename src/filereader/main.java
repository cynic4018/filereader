package filereader;

public class main {

	public static void main(String[] args) {
			
			TaskTimer.run(new AppendStringTask());
			TaskTimer.run(new AppendStringBuilderTask());
			TaskTimer.run(new AppendBufferedReaderTask());

	}

}
