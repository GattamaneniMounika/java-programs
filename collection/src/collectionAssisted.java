import java.util.*;

public class collectionAssisted {

	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("hyd");//
	      city.add("bangalore");    	   
	      System.out.println(city);  
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(20); 
	      vec.addElement(15); 
	      System.out.println(vec);
		
		
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("lakshmi");  
	      names.add("satya");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(105);  
	       set.add(106);  
	       set.add(107);
	       set.add(108);
	       System.out.println(set);
	       
	     
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(15);  
	       set2.add(16);  
	       set2.add(17);
	       set2.add(18);	       
	       System.out.println(set2);
	      	} 
	      }  
	}
