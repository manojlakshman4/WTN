package numberBasedPrograms;

public class Nums27 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int n=Integer.parseInt(args[2]);
		for(int i=0;i<n;i++) {
			int v=a;
			for(int j=0;j<i;j++) {
				v*=d;
			}
			System.out.print(v+" ");
		}
	}
}
