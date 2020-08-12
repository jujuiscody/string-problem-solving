package com.string.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write an efficient Java/C/Python program to return the maximum occurring character in the input string,
 *  e.g., if the input string is "Java" then the function should return 'a'.
 *
 */
public class MaxOccurence {
	static Scanner scanner = new Scanner(System.in);
	
	List<String> list = new ArrayList<String>();
	
    public static void main( String[] args )
    {
    	String input = scanner.nextLine();
    	char ch;
    	char cha;
    	int count = 1;
    	String singleChar = "";
    	StringBuilder builder = new StringBuilder();
    	for(int i = 0; i < input.length(); i++) {
    		ch = input.charAt(i);
    		for(int j = 1; j < input.length(); j++) {
    			cha = input.charAt(j);
    			count++;
    			if(ch == cha && input.indexOf(j) == input.length()-1) {
    				builder.append(ch).append(count);
    				count = 0;
    			} if( ch != cha && input.indexOf(j) == input.length()-1) {
    				singleChar = ch + "1";
    				builder.append(singleChar);
    			}
    		}
    	}
    	System.out.println(builder);
    	
    }
}
