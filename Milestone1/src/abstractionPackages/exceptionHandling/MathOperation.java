package abstractionPackages.exceptionHandling;

public class MathOperation {
	public static void main(String[] args) {
		int[] a=new int[5];
		try {
			for(int i=0;i<5;i++) {
				a[i]=Integer.parseInt(args[i]);
			}
			int sum=0;
			for(int i=0;i<5;i++) {
				sum+=a[i];
			}
			System.out.println("Sum is "+sum);
			double avg=sum/0;
			System.out.println("Average is "+avg);
		}
		catch(Exception A) {
			System.out.println(A);
		}
	}
}
