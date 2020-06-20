
public class Calci {
	public static void main(String args[]) {
		System.out.println(Calculator.powerDouble(67.0,2));
		System.out.println(Calculator.powerInt(67,3));
		
	}

}
class Calculator{
	static double powerInt(int num1,int num2) {
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,double num2) {
		return Math.pow(num1,num2);
	}
	
}