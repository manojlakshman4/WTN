package numberBasedPrograms;

public class Nums6 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a=0;
		while(n!=0) {
			a=(a*10)+(n%10);
			n/=10;
		}
		System.out.println(a);
	}
}
