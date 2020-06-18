package numberBasedPrograms;

public class Nums20 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int f=0;
		int s=1;
		int c=0;
		while(s<=n) {
			if(s==n) {
				c++;
				break;
			}
			else {
				int t=s;
				s+=f;
				f=t;
			}
		}
		if(c>0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
