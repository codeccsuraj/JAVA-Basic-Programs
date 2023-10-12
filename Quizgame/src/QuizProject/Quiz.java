package QuizProject;

//welcome to codeccsuraj zone here i am providing you the basic java projects. please support so we can try hard to
//to give our passion and experience for solving your problems makes learning easy for you

//This is JAVA Quiz Game program

import java.util.*;
public class Quiz {
	// this is our main method
	public static void main(String[] args) {
		
	// Starting code with creating an 2D array of String for storing the questions and answer.
		
		String[][] quiz = new String[10][3]; // here i create an 2D array which have 10 row and 3 column.
		// we are going to store our questions and answer in this array boxes which indexes are like {(0,0), (0,1) , (0,2), (1,0), (1,2), (1,3), ...so on till (9,2).}
		
		// now we start storing our questions and answers 
		
		quiz[0][0] = "To scale Mount Everest, mountaineers need to go to _____ ?"; // in box (0,0) we store our question
		quiz[0][1] = "c"; // in box (0,1) we store answer
		quiz[0][2] = " a) Afghanistan \n b) Bhutan \n c) Nepal \n d) Myanmar"; // in box (0,2) we store option choice
		
		quiz[1][0] = "New Delhi's Lotus Temple was designed by an architect from _____ ?";
		quiz[1][1] = "b";
		quiz[1][2] = " a) Germany \n b) Iran \n c) UAE \n d) Japan";
		
		quiz[2][0] = "In Vienna, there's a statue of Indian hockey player _____ holding four hockey sticks in four Hands ?";
		quiz[2][1] = "a";
		quiz[2][2] = " a) Dhyan Chand  \n b) Dhanraj Pillay \n c) Udham Singh Kular \n d) Bharat Kumar Chettri ";
		
		quiz[3][0] = "Which of the following is the second largest artificial lake in Asia ?";
		quiz[3][1] = "d";
		quiz[3][2] = " a) Chilika Lake in Odisha \n b) Chandubi Lake in Assam  \n c) Kolleru Lake in Andhra Pradesh \n d) Dhebar Lake in Rajasthan";
		
		quiz[4][0] = "The National Game of Bhutan is ?";
		quiz[4][1] = "a";
		quiz[4][2] = " a) archery \n b) shooting \n c) taekwondo \n d) wrestling";
		
		quiz[5][0] = "Which country is called the ‘Coffee Bowl of the World’ ?";
		quiz[5][1] = "d";
		quiz[5][2] = " a) Serbia \n b) Mexico \n c) India \n d) Brazil";
		
		quiz[6][0] = "World's largest field hockey stadium based on the seating capacity is located in which Country ?";
		quiz[6][1] = "b";
		quiz[6][2] = " a) Australia \n b) Pakistan \n c) Netherlands \n d) India";
		
		quiz[7][0] = "Which is the largest uranium producing country in the world ?";
		quiz[7][1] = "b";
		quiz[7][2] = " a) Uzbekistana \n b) Kazakhstan \n c) USA \n d) India";
		
		quiz[8][0] = "When was the constitution of Pakistan enforced ?";
		quiz[8][1] = "a";
		quiz[8][2] = " a) 1973 \n b) 1947 \n c) 1965 \n d) 1952";
		
		quiz[9][0] = "The currency of Japan is _________ ?";
		quiz[9][1] = "c";
		quiz[9][2] = " a) Renminbi \n b) Euro \n c) Yen \n d) Dollar";
		
		Scanner sc = new Scanner(System.in); // to input from user
		
		int score = 0; // to show your score
		
		// initiating loop to access all the index of the array.
		for(int i = 0; i < quiz.length; i++) {
			// now store the value of array items in variable
			String question = quiz[i][0]; // storing the value of question which on i th row and 0 th position for each and every row.
			String answer = quiz[i][1]; //storing answer similarly
			String option = quiz[i][2]; // for options
			
			System.out.println("Question" + (i + 1) + ":" + question); // print all the questions (i+1) is for referencing question number becz first index start with 0 in array and we want to print our 1st question as question 1
			System.out.println(option); // print option accordingly
			
			System.out.println("give your answer (a, b, c, d)");
			String userAns = sc.nextLine().toLowerCase(); // checking the input of user
			
			// give logic to check and display result
			if(userAns.equals(answer)) {
				System.out.println("Correct ! you scored 1 points");
				score++; //increment +1 on each correct ans
			}else {
				System.out.println("wrong answer \n correct ans is :" + answer);
			}
			
			
		}
		System.out.println("your score is :" + score + "/10");
		
	}
	

}

