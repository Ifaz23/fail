package com.company;

public class Main {

    public static void main(String[] args) {
        int mk1 = 67;
        int mk2 = 88;
        int mk3 = 90;
        int total = mk1 + mk2 + mk3;
        double avg  = total/3F;
        String grade;

        if (avg >= 75)
            grade = "Distinction";
        else grade = "Pass";

        System.out.println("Marks 01 : "+mk1);
        System.out.println("Marks 02 : "+mk2);
        System.out.println("Marks 03 : "+mk3);
        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);
        System.out.println("Grade : "+grade);
        System.out.println("This is updated");
    }
}
