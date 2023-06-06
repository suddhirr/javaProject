import java.util.Scanner;
public class Mark {
	public static void main(String[] args){
		 	Scanner input = new Scanner(System.in);
		    System.out.print("Enter the marks of the first subject: ");
		    int sub1 = input.nextInt();
		    
		    System.out.print("Enter the marks of the second subject: ");
		    int sub2 = input.nextInt();
		    
		    System.out.print("Enter the marks of the third subject: ");
		    int sub3 = input.nextInt();
		    
		    System.out.print("Enter the marks of the fourth subject: ");
		    int sub4 = input.nextInt();
		    
		    int totalMarks = sub1 + sub2 + sub3 + sub4;
		    double averageMarks = totalMarks / 4.0;
		    
		    System.out.println("Total marks: " + totalMarks);
		    System.out.println("Average marks: " + averageMarks);
		    
		    if (averageMarks > 90) {
		      System.out.println("Grade A");
		    } else if (averageMarks >= 80 && averageMarks <= 90) {
		      System.out.println("Grade B");
		    } else if (averageMarks >= 70 && averageMarks < 80) {
		      System.out.println("Grade C");
		    } else {
		      System.out.println("Fail");
		    }
		    
		    input.close();
	}
}