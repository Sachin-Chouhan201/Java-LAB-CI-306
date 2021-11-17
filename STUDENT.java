//  1.	Program to show the detail of students (name, contact no, address, academic performance\result) using concept of inheritance.

//program to get student details
import java.util.Scanner;
 

public class STUDENT
{
      public static void main(String args[])
      {
          String name,enroll;
          int DS, OOPS, DLC,EEE,MATHS;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter Name: ");
          name=SC.nextLine();
          System.out.print("Enter EN-Roll Number: ");
          enroll=SC.nextLine();
          System.out.print("Enter marks in Data Structure : ");
          DS=SC.nextInt();
          System.out.println("Enter marks in OPPS : ");
          OOPS=SC.nextInt();
          System.out.println("Enter marks in DIGITAL LOGIC : ");
          DLC=SC.nextInt();
          System.out.println("Enter marks in EEE : ");
          EEE=SC.nextInt();
          System.out.println("Enter marks in Maths : ");
          MATHS=SC.nextInt();
          int total=DS+DLC+OOPS+EEE+MATHS;
          float perc=(float)total/500*100;
           
          System.out.println("En-Roll Number:" + enroll +"\tName: "+name);
          System.out.println("Marks in Data Structure : " + DS );
          System.out.println("Marks in OOPS : "+ OOPS );
          System.out.println("Marks in DIGITAL LOGIC : " + DLC );
          System.out.println("Marks in EEE : " + EEE  );
          System.out.println("Marks in MATHS : " + MATHS );
          System.out.println("Total: "+total +"\tPercentage: "+perc);
            
      }
          
}





//2.	Program to demonstrating overloaded constructor for calculating box volume.
