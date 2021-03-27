package com.algorithms;

public class Search {

	public static void main(String[] args) {
		int input[] = {1,4,7,2,3};
		int number = 10;
		System.out.println("hello");
		System.out.println(findSearchedIndex(input, number));
	}
	
	public static int findSearchedIndex(int[] input, int number) {
		for(int i = 0; i < input.length; i++) { // n
			if(input[i] == number) {
				return i;
			}
		}
		return -1;
	}

}
