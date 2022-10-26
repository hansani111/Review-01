package com.bl.bridgelabz;

public class ReverseString {

	public static void main(String[] args) {
		String[] str = { "Pallavi", "Pratiksha", "Renuka", "Priyanka" };
		reverseArray(str);

	}

	private static void reverseArray(String[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i].toUpperCase());
		}

	}

}
