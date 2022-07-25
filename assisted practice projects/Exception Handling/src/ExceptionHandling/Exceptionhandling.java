package ExceptionHandling;
public class Exceptionhandling extends Exception{
   String str1;
   Exceptionhandling(String str2) {
	str1=str2;
   }
   public String toString(){ 
	return ("Exception Occurred: "+str1) ;
   }
}
class Example1{
   public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
		throw new Exceptionhandling("This is My error Message");
	}
	catch(Exceptionhandling exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
   }
}