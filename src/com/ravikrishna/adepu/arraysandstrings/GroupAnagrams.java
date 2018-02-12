package com.ravikrishna.adepu.arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class GroupAnagrams {

	public static void main(String... args) {
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };

		List<List<String>> nestedList = groupAnagrams(arr);

		for (List<String> list : nestedList) {
			System.out.println(Arrays.toString(list.toArray()));
		}

	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		if (strs == null || strs.length == 0)
			return new ArrayList<List<String>>();
		TreeMap<String, List<String>> map = new TreeMap<>();
		List<List<String>> nestedList = new ArrayList<List<String>>();

		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			List<String> list = map.get(String.valueOf(ch)) == null ? new ArrayList<String>()
					: map.get(String.valueOf(ch));
			list.add(s);
			map.put(String.valueOf(ch), list);
		}

		for (Entry<String, List<String>> entry : map.entrySet()) {
			List<String> ls = entry.getValue();
			Collections.sort(ls);
			nestedList.add(ls);
		}
		return nestedList;

	}

}
