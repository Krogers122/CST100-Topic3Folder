import java.util.Scanner;
 
public class sortThreeNumbers {
 
 public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter three numbers:");
  double num1 = input.nextDouble();
  double num2 = input.nextDouble();
  double num3 = input.nextDouble();
 
  displaySortedNumbers(num1, num2, num3);
 
 }
 
 public static void displaySortedNumbers(double num1, double num2,
   double num3) {
 
  if (num3 > num2) {
   double temp = num2;
   num2 = num3;
   num3 = temp;
  }
 
  if (num2 > num1) {
   double temp = num1;
   num1 = num2;
   num2 = temp;
  }
 
  if (num3 > num2) {
   double temp = num2;
   num2 = num3;
   num3 = temp;
  }
 
  System.out.println("The numbers is increasing order is " + num3 + " "
    + num2 + " " + num1);
 
 }
 
}