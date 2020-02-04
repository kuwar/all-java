/**
 * 
 */
package logger.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author kuwar
 *
 */
public class ReadFromFile {
	public void read() {
		
		BufferedReader br;
		
		try {
			br = new BufferedReader(new FileReader(new File("info.log")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
