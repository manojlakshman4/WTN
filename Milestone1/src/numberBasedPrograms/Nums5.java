package numberBasedPrograms;

public class Nums5 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
	}
}
