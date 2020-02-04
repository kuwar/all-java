/**
 * 
 */
package fr.epita.quiz.datamodel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author kuwar
 *
 */
public class WriteMCQQuestion {

	public void writeQuestion(String question) {
		
		String fileName = "questions.txt";
	    BufferedWriter writer;
		try {
			// Append mode
			writer = new BufferedWriter(new FileWriter(fileName, true));
			
		    writer.append(question);
		    writer.append('\n');
		    
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
