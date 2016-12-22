/*
 * A program that takes a key and code and input and returns 
 * an integer value that has been represented by the code.
 * Ex. KEY - lucas CODE - mia; since a is the 4th letter in the
 * key and a is also the only letter in the code the the integer value 
 * returned is 4
 * This was my solution to a practice problem taken from the topcoder.com 
 * website.
 */

import java.util.Scanner;

class Substitute
{
    public static int getValue(String key, String code)
    {	//to create an empty string so that the encrypted string can be stored
    	String sub = "";
    	for(int cPos = 0; cPos < code.length(); cPos++)
    	{
    		for(int kPos = 0; kPos < key.length(); kPos++)
    		{	//when a character that is found in the key that is found in
    			//code, then the character position is input into the encrypted 
    			//string
    			if(code.charAt(cPos) == key.charAt(kPos))
    			{
    				if(kPos == 9)
    				{
    					sub += '0';
    				}
    				else
    				{
    					sub += (kPos + 1);
    				}
    				break;
    			}
    		}
    	}
    	int retSub = Integer.parseInt(sub);
    	return retSub;
    }
}
public class HackerRank
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Key must contain 9 characters or less and code must"
				+ "/ncontain 10 distinct uppercase letters.");
		System.out.print("Input the word that is to act as your key: ");
		String key = in.next();
		System.out.print("Input the word that is to act as your codeword: ");
		String code = in.next(); 
		System.out.println(Substitute.getValue(key, code));
	}
}