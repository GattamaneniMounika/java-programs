package lesson2;
import java.util.Scanner;
public class emailArray {
	
    public static void main(String[] args) 
    { 
      String[] mailstrArray = new String[6];
      mailstrArray[0]= "bhargav@gmail.com";
      mailstrArray[1]= "lakshmi@gmail.com"; 
      mailstrArray[2]= "satya@gmail.com"; 
      mailstrArray[3]= "mouni@gmail.com"; 
      mailstrArray[4]= "pavani864@gmail.com";
      mailstrArray[5]= "prabhu567@gmail.com"; 
      
        boolean found = false;
        int index = 0;
        
        Scanner mail=new Scanner(System.in);
        System.out.println("Enter the Email ID:");
        String a= mail.nextLine(); 
       for (int i = 0; i <mailstrArray.length; i++) {
       if(a.equals(mailstrArray[i])) {
            index = i; found = true; 
            }
        }
       if(found)
          System.out.println("\n" +a +" found at the index value "+index);
        else
          System.out.println("\n" +a +" not found in the  array");
 
    }
}