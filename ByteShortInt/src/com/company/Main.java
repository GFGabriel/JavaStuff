package com.company;

public class Main {

    public static void main(String[] args) {
	int myMinValue = -2_147_483_648;
	int myMaxValue = 2_147_483_647;

	byte myMinByteValue = -128;
	byte myMaxByteValue = 127;

	short myMinShortValue = -32768;
	short myMaxShortValue = 32767;

	byte myByteValue = 120;
	short myShortValue = 30_000;
	int myIntValue = 1_987_654_321;
	long myLongValue = (long) (50_000 + 10*(myByteValue + myShortValue + myIntValue));

	System.out.println(myLongValue);

	int myNewInt = 5/3;
	float myNewFloat = 5f / 3;
	double myNewDouble = 5d / 3;

	System.out.println(myNewInt);
	System.out.println(myNewFloat);
	System.out.println(myNewDouble);

	double myPounds = 5d;
	double kiloConversion = myPounds * 0.45359237d;

	System.out.println(kiloConversion);

	char myChar = '\u00AE';

	System.out.println(myChar);

	String myString = "This is my string!";
	System.out.println(myString);

	double firstValue = 20;
	double secondValue = 80;
	double firstResult = (firstValue + secondValue) * 25;
	double firstOutput = firstResult % 40;
	if (firstOutput <= 20)
		System.out.println("Total was over the limit");


	boolean gameOver = true;
	int score = 800;
	int levelCompleted = 5;
	int levelBonus = 100;

	calculateScore(true, 800, 5, 100);

	score = 10_000;
	levelBonus = 200;
	levelCompleted = 8;

	calculateScore(gameOver, score, levelCompleted, levelBonus);

	displayHighScorePosition("Joe", calculateHighScorePosition(1500));
	displayHighScorePosition("Bob", calculateHighScorePosition(900));
	displayHighScorePosition("Jim", calculateHighScorePosition(400));
	displayHighScorePosition("Jay", calculateHighScorePosition(50));

		System.out.println("12 feet 8 inches is " + calcFeetAndInchesToCentimeters(0,18) + " centimeters.");

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int levelBonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * levelBonus);
			finalScore += 2000;
			System.out.println("You're final score is " + finalScore);
			return finalScore;
		} else {
			return -1;
		}
	}

	public static void displayHighScorePosition(String name, int position) {
		System.out.println(name + " managed to get into position " + position + " on the high score table!");
	}

	public static int calculateHighScorePosition(int score) {
    	if (score > 1000) {
    		return 1;
		} else if (score > 500 && score < 1000){
    		return 2;
		} else if (score > 100 && score < 500) {
    		return 3;
		} else {
    		return 4;
		}
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches){
    	if (feet >= 0 && (inches >= 0 && inches <= 12)) {
    		double totalInches = (feet * 12) + inches;
    		return calcFeetAndInchesToCentimeters(totalInches);
		} else {
    		return -1;
		}
	}

	public static double calcFeetAndInchesToCentimeters(double inches){
    	return inches * 2.54;
	}

}
