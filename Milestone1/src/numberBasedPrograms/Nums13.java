package numberBasedPrograms;

public class Nums13 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int c=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==0||n==1||n==2||n==3) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}
