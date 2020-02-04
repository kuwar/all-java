/**
 * 
 */
package fr.epita.quiz.tests;

import java.util.Arrays;
import java.util.List;

import fr.epita.quiz.datamodel.MCQQuestion;
import fr.epita.quiz.datamodel.MCQQuestionCSVDAO;

/**
 * @author kuwar
 *
 */
public class SortMCQTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MCQQuestionCSVDAO dao = new MCQQuestionCSVDAO();
		
		List<MCQQuestion> allQuestions = dao.readAll();

		for (MCQQuestion question : allQuestions) {
			System.out.println("ID " + question.getId());
			System.out.println("Difficulty " + question.getDifficulty());
			System.out.println(question.getQuestion());
			System.out.println(question.getTopics());
			System.out.println("Options " + Arrays.toString(question.getTopics()));
		}
	}

}
