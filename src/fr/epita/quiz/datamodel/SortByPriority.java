/**
 * 
 */
package fr.epita.quiz.datamodel;

import java.util.Comparator;

/**
 * @author kuwar
 *
 */
public class SortByPriority implements Comparator<MCQQuestion> {

	public int compare(MCQQuestion a, MCQQuestion b) {
		return a.getDifficulty() - b.getDifficulty();
	}

}
