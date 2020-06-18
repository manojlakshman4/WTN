package numberBasedPrograms;

public class Nums9 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int c=0;
		while(n!=0) {
			if(n%10==d) {
				c++;
			}
			n/=10;
		}
		System.out.println(c+" times");
	}
}
