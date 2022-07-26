import java.util.*;

public class Queueclass 
{
public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
locationsQueue.add("bangalore");
        		locationsQueue.add("hyderabad");
        		locationsQueue.add("chennai");
        		locationsQueue.add("mumbai");
        		locationsQueue.add("pakistan");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}