package SearchingAndSortingAlgorithms;

import java.util.List;

import org.junit.runner.Result;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {

		for (int i = 0; i < eggs.size(); i++) {

			String l = eggs.get(i);

			if (l.equals("cracked")) {

				return i;

			}

		}
		return 0;

	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub

		for (int i = 0; i < oysters.size(); i++) {

			Boolean k = oysters.get(i);

			if (k.booleanValue() == true) {
				return i;
			}

		}
		return 0;
	}

	public static Double findTallest(List<Double> heights) {

		Double tallest = 0.0;

		for (Double height : heights) {
			if (height > tallest) {
				tallest = height;
			}
		}

		return tallest;

	}

	public static String findLongestWord(List<String> words) {
		String longest = "";

		for (String word : words) {

			if (word.length() > longest.length()) {

				longest = word;
			}

		}
		return longest;
	}

	public static boolean containsSOS(List<String> messages) {

		for (String message : messages) {

			if (message.contains("... --- ...")) {
				return true;
			}
		}

		return false;
	}

	public static List<Double> sortScores(List<Double> scores) {

		Double ordering = 0.0;

		for (int i = 0; i < scores.size(); i++) {
			for (int j = i + 1; j < scores.size(); j++) {

				if (scores.get(i) > scores.get(j)) {

					ordering = scores.get(i);

					scores.set(i, scores.get(j));

					scores.set(j, ordering);

				}

			}
		}
		return scores;

	}

	// Add other methods here
}