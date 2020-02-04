/**
 * 
 */
package exampractice.file.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kuwar
 *
 */
public class FileLogger {
	public void print(String formattedMessage) {
		SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		String date = formater.format(new Date());
		File file = new File("/tmp/filelogger.log");
		// print in the file
		PrintWriter writer;
		try {
			FileOutputStream out = new FileOutputStream(file, true);
			writer = new PrintWriter(out);
			writer.println(date + " - " + formattedMessage);
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
