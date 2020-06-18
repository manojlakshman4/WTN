package numberBasedPrograms;

public class Nums15 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int p=Integer.parseInt(args[1]);
		int v=1;
		for(int i=0;i<p;i++) {
			v*=n;
		}
		System.out.println(v);
	}
}
