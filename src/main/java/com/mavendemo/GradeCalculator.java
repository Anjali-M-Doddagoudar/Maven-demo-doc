package com.mavendemo;

public class GradeCalculator {

    public String calculateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }

        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();

        int[] testMarks = {95, 82, 76, 65, 54, 38};

        for (int marks : testMarks) {
            String grade = calculator.calculateGrade(marks);
            System.out.println("Marks: " + marks + " | Grade: " + grade);
        }
    }
}
