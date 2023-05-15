package initialProject;

import java.util.Scanner;
public class studentsGrade{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first value.");
        double n1 = sc.nextDouble();

        System.out.println("Please enter the second value.");
        double n2 = sc.nextDouble();

        System.out.println("Please enter the third value.");
        double n3 = sc.nextDouble();

        double sum = n1 + n2 + n3;
        double avg = sum / 3;

        String grade;
        if(avg > 90){
           grade = "A";
        }

        else if(avg >= 80){
            grade = "B";
        }

        else if(avg >= 70){
            grade = "C";
        }

        else{
            grade = "D";
        }

        System.out.println(sum);
        System.out.println(Math.floor(avg));
        System.out.println(grade);
        sc.close();
    }
}