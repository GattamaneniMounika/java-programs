import java.util.*;
public class mapDemo {

	public static void main(String[] args) {
	
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"sweety");    
	      hm.put(2,"lakshmi");    
	      hm.put(3,"satya");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"sakku");  
	      ht.put(5,"pavani");  
	      ht.put(6,"bhargav");  
	      ht.put(7,"buggi");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	     
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"sunny");    
	      map.put(9,"kanna");    
	      map.put(10,"durga");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
