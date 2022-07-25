import java.io.*; 
import java.util.*; 
        class Sender 
		{ 
		    public void send(String msg) 
		    { 
		        System.out.println("Sending\t"  + msg ); 
		        try
		        { 
		            Thread.sleep(1000); 
		        } 
		        catch (Exception e) 
		        { 
		            System.out.println("Thread  interruption has occured."); 
		        } 
		        System.out.println("\n" + msg + " Sent"); 
		    } 
		} 
		class ThreadedSend extends Thread 
		{ 
		    private String message; 
		    private Thread A; 
		    Sender  sender; 
		    ThreadedSend(String m,  Sender obj) 
		    { 
		        message = m; 
		        sender = obj; 
		    } 
		  
		    public void run() 
		    {  
		        synchronized(sender) 
		        { 
		            sender.send(message); 
		        } 
		    } 
		} 
		public class Threadsync {
				    public static void main(String args[]) 
		    { 
		        Sender snd = new Sender(); 
		        ThreadedSend S1 = 
		            new ThreadedSend( " hloo " , snd ); 
		        ThreadedSend S2 = 
		            new ThreadedSend( " bye " , snd ); 
		        S1.start(); 
		        S2.start(); 
		        try
		        { 
		            S1.join(); 
		            S2.join(); 
		        } 
		        catch(Exception e) 
		        { 
		            System.out.println("Interrupted"); 
		        } 
		    } 
		}