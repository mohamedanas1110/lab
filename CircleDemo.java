package lab1;
import java.util.Scanner;
class CircleDemo {
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the radius:");
	/*We are storing the entered radius in double
	 * because a user can enter radius in decimals
	 */
	double radius = sc.nextDouble();
	//Area = PI*radius*radius
	double area = Math.PI* (radius*radius);
	System.out.println("The area od Circle is :" +area);
	//Circumference = Math.PI*radius
	double circumference = Math.PI *2*radius;
	System.out.println("the Circumference of the circle is :" +circumference);
}
}
