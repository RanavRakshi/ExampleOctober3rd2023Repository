package com.sgtesting.stringassignment;

// the given string is "Bangalore is the capital city of karnataka" WAP to find the 
// no of words in the given String

class WordCount
{
	public static int wordCount(String s)
	{
		String words[]=s.split(" ");
		return words.length;
	}
}
public class Q6NoOfWordsInTheGivenString {

	public static void main(String[] args) {

		String a="Bangalore is the capital city of karnataka";
		int countWord=WordCount.wordCount(a);
		System.out.println("No of words: "+countWord);
	}

}
