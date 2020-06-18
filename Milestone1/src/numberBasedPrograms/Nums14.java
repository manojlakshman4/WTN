package numberBasedPrograms;

public class Nums14 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int s=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				s+=i;
			}
		}
		if(s==n) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
	}
}
