/**
 * 
 */
package exampractice.launcher;

import java.util.List;

import exampractice.file.read.LogReaderDAO;
import exampractice.file.write.FileLogger;

/**
 * @author kuwar
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileLogger logWritter = new FileLogger();

		logWritter.print("This is from Launcher");

		LogReaderDAO logMessage = new LogReaderDAO();

		List<String> logs = logMessage.read();

		System.out.println(logs.toString());

	}

}
