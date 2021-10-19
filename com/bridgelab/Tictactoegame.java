package com.bridgelab;

import java.util.Scanner;

public class Tictactoegame {
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
			
		// message for user 
		System.out.print("Choose X Or O any one to play the game:  ");
			
		// take char from user
		char inputValue = scanner.next().charAt(0);
			
		// check the condition 
		if(inputValue == 'x') {
			// assign value to player variable 
			char player = inputValue;
		}
		else if (inputValue == 'o') {
			// assign value to player variable
			char computer = inputValue;
		}
		else {
			// print invalid message for user if user choose anything without X and O
			System.out.println(" Invalid input. plese inter X and O  any one..");
		}
	}
}