public class innerClassAssisted2 {

private String msg="Java Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	innerClassAssisted2  ob=new innerClassAssisted2 ();  
	ob.display();  
	}
}


//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


	