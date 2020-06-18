package oopsInheritance.classesAndObjects;

class Calculator {
	 static int powerInt(int num1,int num2) {
		int power=1;
		for(int i=0;i<num2;i++) {
			power*=num1;
		}
		return power;
	}
	 static double powerDouble(double num1,int num2) {
		double power=Math.pow(num1, num2);
		return power;
	}
}
