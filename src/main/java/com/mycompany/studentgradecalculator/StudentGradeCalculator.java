/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentgradecalculator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class StudentGradeCalculator 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to Bridgewater State University Student Portal" );
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the student name: ");
        String studentName = scanner.nextLine();
        System.out.println("Welcome " + studentName );

        System.out.println("How Many classes are you taking?");
        int classAmount = scanner.nextInt();
        scanner.nextLine();

        String[] courses = new String[classAmount];
        Double[] grades = new Double[classAmount];
        Double[] creditHours = new Double[classAmount];
        Double[] gradePoints = new Double[classAmount];

        for(int i=0;i< classAmount; i++){
            System.out.println("Please enter the Course title for the Course " + (i+1) + "\nA: ");
            String courseName = scanner.nextLine();
            courses[i] = courseName;
        }

        for(int i=0;i< classAmount; i++){
            System.out.println("Please enter the grade for the Course " + courses[i] + "\nA: ");
            double courseGrade = scanner.nextDouble();
            scanner.nextLine();
            grades[i] = courseGrade;

            System.out.println("Please enter the credit Hours for the Course " + courses[i] + "\nA: ");
            double hours = scanner.nextDouble();
            scanner.nextLine();
            creditHours[i] = hours;

            System.out.println("Please enter the Grade Points for the Course " + courses[i] + "\nA: ");
            double gradePoint = scanner.nextDouble();
            scanner.nextLine();
            gradePoints[i] = gradePoint;





        }
        Student studentOne = new Student(studentName, courses,grades, gradePoints,  creditHours);
        studentOne.printTable();
    }
}

