/**
 * 
 */
package fr.epita.quiz.tests;

/**
 * @author kuwar
 *
 */
public class ConfigurationTest {
	public static void main(String []args) {
		String fileName = Configuration.getValue("file.name");
		
		System.out.println(fileName);
	}
}
