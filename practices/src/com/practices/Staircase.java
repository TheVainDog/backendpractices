package com.practices;


class StaircaseSolution {

    public static void staircase(int n) {
    	
    	for (int i = 0; i <= n-1; i++) {
    		for (int j = 1; j <= n; j++){
    			if ((n-i) > j)
    				System.out.print(" ");
    			else
    			if ((n-i) <= j)
    				System.out.print("#");
    		}
    		System.out.println();
    	}
    }

}



public class Staircase {
	public static void main (String args []) {
		StaircaseSolution.staircase(6);
	}
}
