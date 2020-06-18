package numberBasedPrograms;

public class Nums8 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a=n;
		int b=n;
		int l=0;
		while(n!=0) {
			l++;
			n/=10;
		}
		int s=0;
		while(a!=0) {
			int p=1;
			for(int i=0;i<l;i++) {
				p*=(a%10);
			}
			a/=10;
			s+=p;
		}
		if(s==b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
