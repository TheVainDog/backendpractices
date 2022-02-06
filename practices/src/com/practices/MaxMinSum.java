package com.practices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class MaxMinSumSolution {
    public static void miniMaxSum(List<Integer> arr) {
    	long sum = arr.stream().mapToLong(i -> i).sum();
    	long maxSum = sum - Collections.min(arr);
    	long minSum = sum - Collections.max(arr);
    	System.out.print(minSum + " " + maxSum);
    }
}

public class MaxMinSum {

	public static void main(String[] args) {
		//int[] values = {3, 4, 5, 2, 1};
		//int[] values = {256741038, 623958417, 467905213, 714532089, 938071625};
		int[] values = {5, 5, 5, 5, 5};
		MaxMinSumSolution.miniMaxSum(Arrays.stream(values).boxed().collect(Collectors.toList()));

	}

}
