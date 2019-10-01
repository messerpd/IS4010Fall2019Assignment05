/*
 * 10/1/2019
 * IS4010 - App Dev w/ Java - Fall 2019
 * Assignment 05
 * Paul Messerly
 * messerpd@ucmail.uc.edu
 * Purpose: create a method that returns a string that describes a football score.
 * If the program returns: "All tests passed", there exists no errors and the method meets the requirements.
 * If the program returns: "At least one test failed", the method did not properly handle the football score.
 * Citations: http://web.engr.oregonstate.edu/~rookert/cs162/ecampus-video/CS161/template/chapter_4/ifelse.html
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		//Test scoring inputs in translateScore method
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");		//Output when all test values pass
		} else {
			System.out.println("At least one test failed");		//Output when one of the test values doesnt work
		}
	}
	/**
	 * This method takes a football score and returns a string that describes that score
	 * @param score
	 * @return string that describes the score input
	 */
	public static String translateScore (int score) {		

		if(score == 2) {						//output when safety
			return("safety");}
		else if(score == 3) {					//output when field goal
			return("field goal");}
		else if(score == 6) {					//output when touchdown
			return("touchdown");}
		else if(score == 7) {					//output when touchdown and extra point
			return("touchdown and extra point");}
		else if(score == 8) {					//output when touchdown and 2-point conversion
			return("touchdown and 2-point conversion");}
		else if(score == 10) {					//output when you must be playing Quidditch
			return("you must be playing Quidditch ");}		//extra space because there is extra space in test
		else if(score >= 0) {					//output when the score is negative
			return("invalid");}
		else {									//output for all other cases
			return("");}
		
	}
}
