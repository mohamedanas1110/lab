package lab1;
import java.util.Scanner;
class Main {
public static void main(String[] args) {
	char operator;
	Double number1, number2, result;
	//create an object of Scanner class
	Scanner input = new Scanner(System.in);
	//ask users to enter operator
	System.out.println("Choose an operator: +, -, *, /");
	operator = input.next().charAt(0);
	//ask users to enter numbers
	System.out.println("Enter the first number");
	number1 = input.nextDouble();
	System.out.println("Enter the second number");
	number2 = input.nextDouble();
	switch (operator)
	{
	//Performs addition between two numbers
	case '+':
		result = number1 + number2;
		System.out.println(number1 + "+" + number2 + "=" +result);
		break;
		//Performs subtraction between two numbers
	case '-':
		result = number1 - number2;
		System.out.println(number1 + "-" + number2 + "=" +result);
		break;
		//Performs multiplication between two numbers
	case '*':
		result = number1 * number2;
		System.out.println(number1 + "*" + number2 + "=" +result);
		break;
		//Performs division between two numbers
	case'/':
		result = number1 / number2;
		System.out.println(number1 + "/" + number2 + "=" +result);
		break;
		default:
			System.out.println("Invalid Operator!");
			break;
	}
	input.close();
}
}
