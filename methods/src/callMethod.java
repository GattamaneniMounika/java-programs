public class callMethod {

int val=70;

int operation(int val) {
	val =val*1000/10000;
	return(val);
}

public static void main(String args[]) {
	callMethod d = new callMethod();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(100);
	System.out.println("After operation value of data is "+d.val);
	}
}
