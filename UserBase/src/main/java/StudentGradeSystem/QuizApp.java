package StudentGradeSystem;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        String[][] que = new String[5][3];

        que[0][0] = "What is the capital of France?";
        que[0][1] = "c";
        que[0][2] = "a) London b) Madrid c) Paris d) Berlin";

        que[1][0] = "What is the largest planet in our solar system?";
        que[1][1] = "d";
        que[1][2] = "a) Earth b) Mars c) Saturn d) Jupiter";

        que[2][0] = "Who is the Father of our Nation?";
        que[2][1] = "a";
        que[2][2] = "a) Mahatma Gandhi b) Subhash Chandra Bose c) Pt. Jawahar Lal Nehru d) Bhagat Singh";

        que[3][0] = "Which of the following is the second largest artificial lake in Asia?";
        que[3][1] = "d";
        que[3][2] = "a) Chilika Lake in Odisha b) Chandubi Lake in Assam c) Kolleru Lake in Andhra Pradesh d) Dhebar Lake in Rajasthan";

        que[4][0] = "The National Game of Bhutan is?";
        que[4][1] = "c";
        que[4][2] = "a) shooting b) taekwondo c) archery d) wrestling";

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < que.length; i++) {
           String question = que[i][0];
           String answer = que[i][1];
           String option = que[i][2];
           System.out.println("Question " + (i + 1) + ": " + question);
           System.out.println(option);

           System.out.print("Give your answer (a, b, c, d): ");
           String userAns = scanner.nextLine().trim().toLowerCase();

           if (userAns.equals(answer.toLowerCase())) {
        	    System.out.println("Your answer is correct!");
        	    score++;
        	} else {
        	    System.out.println("Wrong answer, correct answer is: " + answer);
        	}
        }
        System.out.println("Your score is: " + score +"/5");

        scanner.close();
    }
}
