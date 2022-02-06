package com.practices;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class SumElemetsSolution {
	
    public static int simpleArraySum(List<Integer> ar) {
    	IntSummaryStatistics stats = ar.stream().mapToInt((x)->x).summaryStatistics();
    	return (int) stats.getSum();

    }
}

public class SumElements {
	
	public static void main (String args []) {
		int[] elemets = {9317, 7796, 3352, 7068, 9500};
		System.out.println(SumElemetsSolution.simpleArraySum(Arrays.stream(elemets).boxed().collect(Collectors.toList())));
	}
}
