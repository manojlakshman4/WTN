package numberBasedPrograms;

public class Nums7 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a=0;
		int b=n;
		while(n!=0) {
			a=(a*10)+(n%10);
			n/=10;
		}
		int c=0;
		while(a%10!=0||b%10!=0) {
			if(a%10!=b%10) {
				c++;
			}
			a/=10;
			b/=10;
		}
		if(c==0) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
