package numberBasedPrograms;

public class Nums4 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int c=0;
		while(n!=0) {
			c++;
			n/=10;
		}
		System.out.println(c);
	}
}
