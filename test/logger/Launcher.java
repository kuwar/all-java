/**
 * 
 */
package logger;

import logger.dao.WriteToAFile;

/**
 * @author kuwar
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WriteToAFile writer = new WriteToAFile();
		
		writer.write("Beginning of the program");

	}

}
