/**
 * 
 */
package playground;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kuwar
 *
 */
public class General {
public static void main(String []args) {
	Date date = new Date();
	
	SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");
	
	String todaysDate = dateFormater.format(date);
	
	System.out.println(todaysDate);
}
}
