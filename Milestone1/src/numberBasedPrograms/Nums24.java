package numberBasedPrograms;

public class Nums24 {
	int fibo(int n) {
		int f=0;
		int s=1;
		int c=2;
		while(c<n) {
			int t=s;
			s+=f;
			f=t;
			c++;
		}
		if(n==1) {
			return f;
		}
		else {
			return s;
		}
	}
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		Nums24 nu=new Nums24();
		System.out.println(nu.fibo(n));
	}
}
