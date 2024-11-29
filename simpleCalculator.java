import java.util.Scanner;

class Calculator1{
	double number1;
	double number2;
	
	public Calculator1(double number1, double number2) {
		this.number1=number1;
		this.number2=number2;
	}
	
	public double add() {
		return number1+number2;
	}
	public double sub() {
		return number1-number2;
	}
	
	public double multiply() {
		return number1*number2;
	}
	
	public double divide() {
		if(number2 != 0) {
			return number1/number2;
		}
		else {
			System.out.println("Cannot divide: ");
			return Double.NaN;
		}
	}	
	
}

public class simpleCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char choice;
		
		
		do {
			System.out.print("Enteer the first number: ");
			double number1 = scanner.nextDouble();
			
			System.out.print("Enter the second number : ");
			double number2 = scanner.nextDouble();
			
			Calculator1 calculatoR = new Calculator1(number1, number2);
			
			System.out.println("Enter a operation: (+,-,/,*) : ");
			char operation= scanner.next().charAt(0);
			
			double result=0;
			
			switch(operation) {
			
			case '+' : result = calculatoR.add();	break;	
			case '-' : result = calculatoR.sub();break;
			case '/' : result = calculatoR.divide();break;
			case '*' : result = calculatoR.multiply();break;
			
			default: System.out.println("Invalid Operaiton");
			break;
			}
			System.out.println(result);
			
			System.out.println("Do you want another calculation: (y/n)");
			choice = scanner.next().charAt(0);
			
		}while(choice == 'y' || choice == 'Y');
		
		System.out.println("Thank you: ");
		

	}

}
