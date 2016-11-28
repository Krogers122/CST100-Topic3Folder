import java.util.Scanner;
 
 
public class financialApplication {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter investment amount:");
  double investmentAmount = input.nextDouble();
  System.out.print("Enter annual interest rate in percentage:");
  double monthlyInterestRate = input.nextDouble();
  monthlyInterestRate = monthlyInterestRate / 12;
 
  System.out.println("Years    Future Value");
   
  for (int i = 0; i < 30; i++) {
    
   System.out.printf("%3d%10.2f\n",i+1,futureInvestmentValue(investmentAmount,monthlyInterestRate,i+1) );
  }
 
 }
 
 public static double futureInvestmentValue(double investmentAmount,
   double monthlyInterestRate, int years) {
   
  return investmentAmount
    * Math.pow((1 + monthlyInterestRate / 100), (years * 12));
 
 }
 
}