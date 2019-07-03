import java.util.ArrayList;
import java.util.Random;

/*
 * This program illustrates the use of threads
 * to print out and process a (large) file.
 * 
 * @author Aishwareeya Rath
 */

public class FileProcessor {

	public static void main(String[] args) {
		ArrayList<String> contentArrayList = readFile("example.txt");
		ArrayList<ArrayList<String>> chunksArrayList = chunk(contentArrayList, 8);

		for (ArrayList<String> chunk : chunksArrayList) {
			processChunk(chunk);
		}

	}

	private static void processChunk(ArrayList<String> chunk) {
		class ThreadExecutor implements Runnable {
			public ThreadExecutor() {
			}

			@Override
			public void run() {
				for (String string : chunk) {
					System.out.println(string);
				}
			}
		}

		Thread t = new Thread(new ThreadExecutor());
		t.start();
	}

	private static ArrayList<String> readFile(String string) {
		ArrayList<String> strings = new ArrayList<String>();
		String abcString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < 33000; i++) {
			sBuilder.append(abcString.charAt(random.nextInt(25))).append(abcString.charAt(random.nextInt(25)))
					.append(abcString.charAt(random.nextInt(25)));
			strings.add(sBuilder.toString());
			sBuilder.setLength(0);
		}

		return strings;
	}

	public static ArrayList<ArrayList<String>> chunk(ArrayList<String> content, int chunks) {
		int size = content.size();
		int delim = (int) Math.ceil(size / chunks);
		ArrayList<ArrayList<String>> chunkedList = new ArrayList<ArrayList<String>>();
		ArrayList<String> aChunk = new ArrayList<>();

		for (int i = 0; i < size - 1; i += delim) {
			for (int j = 0; j < delim - 1; j++) {
				aChunk.add(content.get(j));
			}

			chunkedList.add(aChunk);
		}

		return chunkedList;
	}
}
