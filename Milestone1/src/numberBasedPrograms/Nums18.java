package numberBasedPrograms;

public class Nums18 {
	public static void main(String[] args) {
		int m=Integer.parseInt(args[0]);
		int o=Integer.parseInt(args[1]);
		for(int n=m;n<=o;n++) {
			int c=0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					c++;
				}
			}
			if(c==0||n==1||n==2||n==3) {
				System.out.print(n+" ");
			}
		}
	}
}
