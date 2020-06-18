package numberBasedPrograms;

public class Nums16 {
	public static void main(String[] args) {
		int c=0;
		for(int i=100;i<999;i++) {
			int v=i;
			int ld=v%10;
			int fd=v/100;
			if(fd==1||ld==7||fd==7||ld==1) {
				System.out.print(i+" ");
				c++;
			}
		}
		System.out.println();
		System.out.println("Total = "+c);
	}
}
