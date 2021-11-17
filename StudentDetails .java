//  1.  Program to show the detail of students (name, contact no, address, academic performance\result) using concept of inheritance.

//program to get student details
  import java.util.Scanner;

 
class StudentDetails
{
  
String name, enroll;
  
int DS, OOPS, DLC, EEE, MATHS;
  
void input () 
  {
    
Scanner SC = new Scanner (System.in);
    
System.out.
      println
      ("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    
System.out.println ("Enter studentb Details ");
    
System.out.
      println
      ("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    
System.out.println ("Enter Name: ");
    
name = SC.nextLine ();
    
System.out.println ("Enter EN-Roll Number: ");
    
enroll = SC.nextLine ();
    
System.out.println ("Enter marks in Data Structure : ");
    
DS = SC.nextInt ();
    
System.out.println ("Enter marks in OPPS : ");
    
OOPS = SC.nextInt ();
    
System.out.println ("Enter marks in DIGITAL LOGIC : ");
    
DLC = SC.nextInt ();
    
System.out.println ("Enter marks in EEE : ");
    
EEE = SC.nextInt ();
    
System.out.println ("Enter marks in Maths : ");
    
MATHS = SC.nextInt ();
  
} 
 
void display () 
  {
    
System.out.
      println
      ("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    
System.out.println ("Student Details Are  ");
    
System.out.
      println
      ("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    
System.out.println ("En-Roll Number:" + enroll + "\tName: " + name);
    
System.out.println ("Marks in Data Structure : " + DS);
    
System.out.println ("Marks in OOPS : " + OOPS);
    
System.out.println ("Marks in DIGITAL LOGIC : " + DLC);
    
System.out.println ("Marks in EEE : " + EEE);
    
System.out.println ("Marks in MATHS : " + MATHS);

} 
} 
class Grade extends Student 

{
  
int total;
  
float perc;
  
void calc () 
  {
    
total = DS + DLC + OOPS + EEE + MATHS;
    
perc = (float) total / 350 * 100;
  
 
} 
void displaygrade () 
  {
    
System.out.println ("Total: " + total + "\tPercentage: " + perc);

} 
} 
class Main extends Grade 

{
  
public static void main (String args[]) 
  {
    
Grade g = new Grade ();
    
g.input ();
    
g.cal ();
    
g.display ();
    
g.displaygrade ();

} 
} 
 
 
 
 
 

//2.    Program to demonstrating overloaded constructor for calculating box volume.
