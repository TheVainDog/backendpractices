package com.practices;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class RatiosSolution {
    public static void plusMinus(List<Integer> arr) {
    	double total = arr.size();
        double negatives = arr.stream().filter(x -> x < 0).count();
        double positives = arr.stream().filter(x -> x > 0).count();
        double zeros =  arr.stream().filter(x -> x == 0).count();
       
        System.out.println(String.format("%.6f",(positives/total)));
        System.out.println(String.format("%.6f",(negatives/total)));
        System.out.println(String.format("%.6f",(zeros/total)));
    } 
}

public class Ratios {

	public static void main (String args []) {
		int[] values = {1, 1, 0, -1, -1};
		
		RatiosSolution.plusMinus(Arrays.stream(values).boxed().collect(Collectors.toList()));
	}
}

