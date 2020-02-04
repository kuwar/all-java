package fr.epita.quiz.tests;

import java.util.Arrays;
import java.util.List;

import fr.epita.quiz.datamodel.MCQQuestion;
import fr.epita.quiz.datamodel.MCQQuestionCSVDAO;

public class TestMCQQuestionCSVDAO {

	public static void main(String[] args) {
		MCQQuestionCSVDAO dao = new MCQQuestionCSVDAO();

		MCQQuestion mcqQuestion = new MCQQuestion();
		mcqQuestion.setDifficulty(1);
		mcqQuestion.setQuestion("What is your name?");
		mcqQuestion.setTopics(new String[] { "Saurav", "Kuwar", "Kumar" });
		mcqQuestion.setId(1l);

		dao.create(mcqQuestion);

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
