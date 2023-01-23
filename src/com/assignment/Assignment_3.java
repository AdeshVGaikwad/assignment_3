package com.assignment;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter a Sentence(any English sentence)");
	    String sentence = sc.nextLine();
	    System.out.println("Enter a Letter(any letter from A to Z)");
	    String letter = sc.nextLine();
	    
	    //Here we used String class method indexOf() which will return the last occurrence
	    //Also used toLowerCase() method to convert in lower case so that it will check all letters
	    int index = sentence.toLowerCase().indexOf(letter.toLowerCase());
	    
	    //This will check the index if letter is not available the this condition will execute
	    if(index == -1){
	        System.out.println("The letter does not exist in the sentence");
	    }else{
	        System.out.println(sentence.substring(index+1));
	    }

	}

}
