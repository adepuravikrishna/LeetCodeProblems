package com.ravikrishna.adepu.arraysandstrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Overlapping {

	public static void main(String... args) {
		int[][] callTimes = new int[][] { new int[] { 1, 2 }, new int[] { 3, 2 }, new int[] { 5, 7 } };

		howManyAgentsToAdd(1, callTimes);
	}

	static int howManyAgentsToAdd(int noOfCurrentAgents, int[][] callsTimes) {

		int totalCalls = callsTimes.length;

		List<List<Integer>> ls = new ArrayList<>();

		for (int j = 0; j < 2; j++) {
			List<Integer> tempList = new ArrayList<>();
			for (int i = 0; i < totalCalls; i++) {
				tempList.add(callsTimes[i][j]);
			}
			ls.add(tempList);
		}

		Collections.sort(ls.get(0));
		Collections.sort(ls.get(1));

		int customers = 1, max_customer_overlap = 1;
		int i = 1, j = 0;

		while (i < ls.get(0).size() && j < ls.get(0).size()) {

			if (ls.get(0).get(i) <= ls.get(1).get(j)) {
				customers++;

				if (customers > max_customer_overlap) {
					max_customer_overlap = customers;
				}
				i++;
			} else {
				customers--;
				j++;
			}
		}

		return max_customer_overlap - noOfCurrentAgents;

	}

}
