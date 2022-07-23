package calculator;
import java.util.Scanner;
import java.lang.*;

public class Calculator {
	
	
   public static void main(String args[]) {
	char operator;
	double n1,n2,result;
	Scanner input = new Scanner(System.in);
	boolean a=true;
	while(a) {
	System.out.println("select one operator");
	System.out.println("+  add" );
	System.out.println("-  sub");
	System.out.println("*  mul");
	System.out.println("/  div");
	System.out.println("type 0 to exit Calculator");
	operator=input.next().charAt(0); 
	if (operator=='0'){
		//user defined input of arthmatic operators
	}
	
	System.out.println("Enter the n1"); 
	n1=input.nextDouble();                 //user defined input of number 1
	
	System.out.println("Enter the n2");
	n2=input.nextDouble();                //user defined input of number 1
	
	switch (operator) {
	
		case '+':                              
			result= n1 + n2;
			System.out.println("The result of " +n1+ " + " +n2 +" is  = "+result);
			break;
			
		case '-':
			result= n1 - n2;
			System.out.println("The result of "+n1 +" - "+n2 +" is = "+result);
			break;
			
		case '*':
			result= n1 * n2;
			System.out.println("The result of "+n1 +" * "+n2 +" is  = "+result);
			break;
		
			
		case '/':
			result= n1 / n2;
			System.out.println("The result of "+n1+" / "+n2+" is ="+result);
			break;
		
		default:
			System.out.println("Invalid operator ...Try again with a vaild operator ");
			
			break;
	}
	
	
	
			
	
	
	
   }
}
}