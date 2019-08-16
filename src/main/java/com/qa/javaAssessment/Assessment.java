package com.qa.javaAssessment;

import java.util.ArrayList;

public class Assessment {

	
	public static void main(String[] args) {
		//getBert("bertclivebert");
		
		//evenlySpaced(4,6,2);
		superBlock("aaaaavvvssss");
	}
	
	
	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		
		
		
		
		String bert = "";
		String middle = "";
		for (int i =0; i< input.length();i++) {
			bert ="";
			if (input.substring(i,i+1).equalsIgnoreCase("b") || input.substring(i,i+1).equalsIgnoreCase("e") || input.substring(i,i+1).equalsIgnoreCase("r")|| input.substring(i,i+1).equalsIgnoreCase("t") ) {
				
				bert += input.substring(i,i+1);
				
				
			}
			
	
			System.out.print(bert);
			
			if (!bert.equalsIgnoreCase("bert"))
			{
				middle += input.substring(i,i+1);
				
			}
		}
		
		System.out.print ("             "  + middle);
		
		return middle;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		
		
		ArrayList<Integer> numbs= new ArrayList<Integer>();
		
		int large = 0;
		int medium = 0;
		int small= 0;
		
		int result=0;
		
		
		
		for (int i = 0; i< 3; i++)
		{
			if (i == 0) {
			numbs.add(a);
			
			}
			if (i==1) {
				numbs.add(b);}
			if (i==2) {
				numbs.add(c);}
		}
		
		
		
		for (int i =0;i<numbs.size();i++) {
			
			
			if (numbs.get(i) < numbs.get(i+1)) {
				for (int k=0; k<numbs.size();k++)
				{
					if (numbs.get(i) < numbs.get(k)) {
						medium = a;
						
					}
					
				}
				
			}
			
			i++;
			
		}
		if ((large - medium) == (medium -small)) {
			return true;
		}
		
		
		System.out.println(large +  " " + medium + " " + small + " "+ result);
		
		
		return true;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		
		
		int middle = (input.length()/2);
		String finalStr= "";
		for (int i = 0; i<input.length(); i++) {
			
			if (i==(middle-1) ) {
				
				i = (middle-1) + a;
				finalStr += input.substring(i,i+1);
			}
			
			else {
			finalStr += input.substring(i,i+1);
			}
			
		}
		System.out.println( finalStr);
		
		return finalStr;
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public static int superBlock(String input) {
		
		ArrayList<String> charTemp = new ArrayList<String>();
		String tempLetter = "";
		int lenghtLarge=0;
		int tempNumb = 0;
		for (int i =0; i < input.length(); i++) {
			
			tempLetter = input.substring(i,i+1);
			charTemp.add(tempLetter);
			for (int k=i; k<input.length(); k++) {
				if (tempLetter.equals(input.substring(k,k+1))) {
			
					
				}
				else {
					System.out.println(" not equals" );
				}
			}
			
		}
		int i =0;
		for (String stnr : charTemp) {
			
			System.out.println(stnr);
		// get next in array compare to previous, if same then add +1 to the tempNumb
			if (i>=charTemp.size()) {
				
			}
			if (stnr == charTemp.get(i+1))
			{
				tempNumb += 1;
			}
			
			i++;
			
		}
		// if tempNumb is greater than the other tempNumbs from groups then this group of chars are the final answer.
		
		
		return lenghtLarge;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		return -1;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		
		
		
		return null;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		
		
		
		return -1;
	}
}
