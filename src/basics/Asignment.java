package basics;

public class Asignment {
	public static void main(String[] args) {
		System.out.println(sum(4));
	}
	public static int sum(int n) {
	    int sum=0;
	    for (int i = 1; i < n; i++) {
	        sum=sum+i;
	        System.out.println(i + " " + sum);    
	    }
	    return sum;
	}
}