package numberBasedPrograms;

public class Nums10 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a=0;
		while(n!=0) {
			a=(a*10)+(n%10);
			n/=10;
		}
		while(a!=0) {
			switch(a%10) {
			case 0: System.out.print("ZERO ");
			break;
			case 1: System.out.print("ONE ");
			break;
			case 2: System.out.print("TWO ");
			break;
			case 3: System.out.print("THREE ");
			break;
			case 4: System.out.print("FOUR ");
			break;
			case 5: System.out.print("FIVE ");
			break;
			case 6: System.out.print("SIX ");
			break;
			case 7: System.out.print("SEVEN ");
			break;
			case 8: System.out.print("EIGHT");
			break;
			case 9: System.out.print("NINE ");
			break;
			}
			a/=10;
		}
	}
}
