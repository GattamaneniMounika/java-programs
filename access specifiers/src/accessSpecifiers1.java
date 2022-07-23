class defaultAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

public class accessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defaultAccessSpecifier obj = new defaultAccessSpecifier(); 		  
        obj.display(); 

	}
}


//2. using private access specifiers
class privateaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

