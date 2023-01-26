package com.xworkz.interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;
//Campof friends are playing a mind game. In this game each person has to tell a word such that first half of 
//the word and last half of the ward should contain same set of characters. But in each group letter can be in any order.
 //If they find such word then that person has been selected as the winner.
 //Can you design a program which accepta word from a person and whether it pass the game.
// write a java program
 //constraints
 // Input will be case sensitive
// If a word has odd number of characters ignore the middle letter
 //Spaces are not allowed between string
//- If there is space between string then that string is considered as
//invalid input Input Formata single word in one lineOutput Format.Print "YES" if input word clears the consbaints listed else printNO

public class AxisStringProgram {

	public static void main(String[] args) {
		  // check for invalid input (spaces)
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String word = sc.next();
		
        if (word.contains(" ")) {
            System.out.println("NO Invalid input");
            return;
        }
        int len = word.length();
        // ignore middle letter if word has odd number of characters
        if (len % 2 != 0) {
            len--;
        }
        // split word into first half and second half
        String firstHalf = word.substring(0, len / 2);
        String secondHalf = word.substring((len / 2)+1);
        // convert characters to a char array and sort them
        char[] firstHalfChars = firstHalf.toCharArray();
        Arrays.sort(firstHalfChars);
        char[] secondHalfChars = secondHalf.toCharArray();
        Arrays.sort(secondHalfChars);
        // check if first half and second half have the same set of characters
        if (Arrays.equals(firstHalfChars, secondHalfChars)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

	}

}
