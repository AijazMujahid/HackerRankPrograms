package com.mujahid.anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AnagramDemo1 {
	
	public static int NUMBER_LETTERS = 26;
	
	public static int getDelta(int[] array1,int[] array2) {
		if(array1.length != array2.length) {
			return -1;//better error handling code
		}
		System.out.println("Executed if loop"+"\n");
		int delta = 0;
		System.out.print("array1 len = "+ array1.length+"\n");
		System.out.print("array2 len = "+ array2.length+"\n");
		for(int i=0;i<array1.length;i++) {
			int difference = Math.abs(array1[i]-array2[i]);
			System.out.print("array1["+i+"] = "+ array1[i]+"\t");
			System.out.print("array2["+i+"] = "+ array2[i]+"\t");
			System.out.print("difference = "+ difference+", \t");
			delta += difference;
			System.out.print("delta = "+ delta+"\n");
		}
		return delta;
	}
	
	public static int[] getCharCounts(String s) {
		int[] charCounts = new int[NUMBER_LETTERS];
		System.out.print("For String : "+s+"\n");

		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			System.out.print("c : "+c+"\t");
			int offset = (int)'a';
			System.out.print("offset : "+offset+"\t");
			int code = c - offset;
			System.out.print("code : "+code+"\t");
			System.out.print("charCounts["+code+"] : "+charCounts[code]+"\t");
			charCounts[code]++;
			System.out.print("charCounts : "+charCounts+"\n");
		}
		return charCounts;
	}
	
	public static int numberNeeded(String first, String second) {

		int[] charCount1 = getCharCounts(first);
		int[] charCount2 = getCharCounts(second);
		return getDelta(charCount1,charCount2);
	}

	public static void main(String[] args) throws Exception {

		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * String first = br.readLine(); String second = br.readLine();
		 */
		String first = "hello";
		String second = "billion";
		System.out.println(numberNeeded(first,second));
	}

}
