package javaFundamentals.flowControlStatements;

public class Ex15 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int c=0;
		for(int i=2;i*i<=a;i++) {
			if(a%i==0) {
				c++;
				break;
			}
		}
		if(c==0||a==1||a==2||a==3) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
	}
}
