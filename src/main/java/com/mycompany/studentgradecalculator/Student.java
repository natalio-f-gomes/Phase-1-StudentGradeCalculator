/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentgradecalculator;



public class Student {
    private String name;
    private String[] classes;
    private Double[] grades;
    private Double[] gradePoints;
    private Double[] creditHours;
    private Double[] qualityPoints;




    public Student(String name, String[] classes, Double[] grades, Double[] gradePoints, Double[] creditHours){
        this.name = name;
        this.classes = classes;
        this.grades = grades;
        this.gradePoints = gradePoints;
        this.creditHours = creditHours;
        this.qualityPoints = new Double[classes.length];
        for(int i=0; i < creditHours.length; i++){
            this.qualityPoints[i] = (creditHours[i] * gradePoints[i]);
        }
    }


    //getters
    public String getName(){return this.name;}
    public Double[] getGrades(){return this.grades;}
    public String[] getClasses(){return this.classes;}
    public Double[] getQualityPoints(){return this.qualityPoints;}
    //setters
    public void setName(String newName){ this.name = newName;}
    public void setGrades(Double[] newGrades){this.grades =  newGrades;}
    public void setClasses(String[] newClasses){this.classes = newClasses;}

    //validation
    public String getGrade(Double grade){
        if(grade <= 50){return "F";}

        if(grade >= 60 && grade <= 63){return "D-";}
        if(grade >= 64 && grade <= 66){return "D";}
        if(grade >= 67 && grade <= 69){return "D+";}

        if(grade >= 70 && grade <= 73){return "C-";}
        if(grade >= 74 && grade <= 76){return "C";}
        if(grade >= 77 && grade <= 79){return "C+";}

        if(grade >= 80 && grade <= 83){return "B-";}
        if(grade >= 84 && grade <=86){return "B";}
        if(grade >=87 && grade <=89){return "B+";}

        if(grade >= 90 && grade <= 93){return "A-";}
        if(grade >= 94 && grade <= 96){return "A";}
        if(grade >= 97){return "A+";}
        return null;
    }

    public Double getAvgGrade(){
        double total = 0;
        for(double grade: this.grades){
            total += grade;
        }
        return (total/this.grades.length);
    }

    public Double CalculateGPA(){
        double totalCreditHours = 0.0;
        double totalQualityPoints = 0.0;
        for(int i=0; i < creditHours.length; i++){
            totalQualityPoints += this.qualityPoints[i];
            totalCreditHours += this.creditHours[i];
        }

       return totalQualityPoints/totalCreditHours;
    }

    public void printTable(){
      

        System.out.println("=====================================================================================");
        System.out.println(this.name +" Curriculum:");
        for(int i=0;i<this.classes.length;i++){
            String letterGrade = getGrade(this.grades[i]);
            System.out.println("Course: "+ this.classes[i] 
                    + "\n\t Grade:" + this.grades[i] 
                    + "\n\t Letter Grade:" + letterGrade
                    + "\n\t Grade Points:"  + this.gradePoints[i]
                    + "\n\t Credit Hours:" + this.creditHours[i] 
                    + "\n\t Quality points :"+ this.qualityPoints[i]);
        }
        System.out.println("Average Grade " + getAvgGrade());
        System.out.println("Student GPA " + CalculateGPA());
        System.out.println("=====================================================================================");
    }

 

}
