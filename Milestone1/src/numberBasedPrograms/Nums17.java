package numberBasedPrograms;

public class Nums17 {
	public static void main(String[] args) {
		for(int n=1;n<=100;n++) {
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
