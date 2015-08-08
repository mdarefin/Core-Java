package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console. Use
		 * BufferedReader class. Use try....catch block to handle Exception.
		 */

		// need to change the path in mac
		String textFile = "/Users/WaLiD/Workspaces/WokrSpacePlugIn/SuperSonic/src/data/becoming-a-developer.txt";

		BufferedReader read = null;
		String line;

		try {
			read = new BufferedReader(new FileReader(textFile));

			while ((line = read.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (read != null)
					read.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
