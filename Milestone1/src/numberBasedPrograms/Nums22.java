package numberBasedPrograms;

public class Nums22 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int f=0;
		int s=1;
		int c=1;
		System.out.print(f+" ");
		while(c<n) {
			System.out.print(s+" ");
			int t=s;
			s+=f;
			f=t;
			c++;
		}
	}
}
