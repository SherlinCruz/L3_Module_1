package SearchingAndSortingAlgorithms;

import java.util.List;

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

	// Add other methods here
}