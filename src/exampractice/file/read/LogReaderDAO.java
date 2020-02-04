/**
 * 
 */
package exampractice.file.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kuwar
 *
 */
public class LogReaderDAO {

	public List<String> read() {
		File file = new File("/tmp/filelogger.log");

		List<String> results = new ArrayList<String>();

		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(file));
			String line;

			while ((line = br.readLine()) != null) {
				results.add(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return results;

	}
}
