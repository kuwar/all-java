/**
 * 
 */
package logger.dao;

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
public class WriteToAFile {
	public void write(String message) {
		System.out.println(this.formatMessage(message));

		File file = new File("info.log");
		PrintWriter printWriter;

		FileOutputStream out;
		try {
			out = new FileOutputStream(file);
			printWriter = new PrintWriter(out, true);
			printWriter.println(this.formatMessage(message));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String formatMessage(String message) {

		return this.getDate() + " " + message;
	}

	public String getDate() {
		SimpleDateFormat dateformater = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss.SSS");

		return dateformater.format(new Date());
	}
}
