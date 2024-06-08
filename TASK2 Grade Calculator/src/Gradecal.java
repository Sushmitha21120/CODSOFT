package com.codsoft.gradecal;

import java.util.Scanner;

public class Gradecal {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Welcome to the Student Grade Calculator");
		        System.out.println("Please enter the number of subjects:");
		        int numSubjects = scanner.nextInt();
		        
		        int totalMarks = 0;
		        for (int i = 1; i <= numSubjects; i++) {
		            System.out.println("Enter marks obtained in subject " + i + ":");
		            int marks = scanner.nextInt();
		            totalMarks += marks;
		        }
		        
		        double averagePercentage = (double) totalMarks / numSubjects;
		        String grade = calculateGrade(averagePercentage);
		        
		        System.out.println("Total Marks: " + totalMarks);
		        System.out.println("Average Percentage: " + averagePercentage + "%");
		        System.out.println("Grade: " + grade);
		        
		        scanner.close();
		    }

		    public static String calculateGrade(double averagePercentage) {
		        if (averagePercentage >= 90) {
		            return "A+";
		        } else if (averagePercentage >= 80) {
		            return "A";
		        } else if (averagePercentage >= 70) {
		            return "B";
		        } else if (averagePercentage >= 60) {
		            return "C";
		        } else if (averagePercentage >= 50) {
		            return "D";
		        } else 
		            return "F";
		    }

}
