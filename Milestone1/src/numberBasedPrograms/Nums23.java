package numberBasedPrograms;

public class Nums23 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		int f=0;
		int s=1;
		a[0]=0;
		int i=1;
		while(s<=n) {
			a[i]=s;
			int t=s;
			s+=f;
			f=t;
			i++;
		}
		for(int j=0;j<=n;j++) {
			int c=0;
			for(int k=0;k<i;k++) {
				if(j==a[k]) {
					c++;
				}
			}
			if(c==0) {
				System.out.print(j+" ");
			}
		}
	}
}
