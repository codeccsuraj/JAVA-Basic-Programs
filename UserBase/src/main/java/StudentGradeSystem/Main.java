package StudentGradeSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks in percentage");

        int marks = sc.nextInt();
        studentGrade(marks);

        sc.nextLine();

        System.out.println("Type 'mywork' to check your work update");
        String work = sc.nextLine();

        if (work.equals("mywork")) {
            toDoList();
        } else {
            System.out.println("No value");
        }
    }

    public static void studentGrade(int grade) {
        if (grade >= 90 && grade <= 100) {
            System.out.println("Congratulations! You got top rank with " + grade + "%" + " marks");
            if (grade >= 95) {
                System.out.println("You have done an excellent performance and secured the 1st position");
            } else {
                System.out.println("You have done an excellent performance and secured the 2nd Position");
            }
        } else {
            if (grade >= 70 && grade < 90) {
                System.out.println("You have passed with first division");
            } else if (grade >= 40 && grade < 70) {
                System.out.println("You have passed");
            } else {
                System.out.println("You have Failed");
            }
        }
    }

    public static void toDoList() {
        
    	 System.out.println("To-Do List:");
    	    
    	    // You can use a loop to print multiple tasks
    	    for (int i = 1; i <= 2; i++) {
    	        switch (i) {
    	            case 1:
    	                System.out.println("1. Check your outlook");
    	                break;
    	            case 2:
    	                System.out.println("2. Check your outlook");
    	                break;
    	            default:
    	                System.out.println("Unknown task");
    	        }
    }
}
