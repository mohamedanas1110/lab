package lab1;

public class SwapTwoNumbers {
public static void main(String[] args) {
	int first = 120, second = 220;
	System.out.println("--Before Swap--");
	System.out.println("First Number : " + first);
	System.out.println("Second Number : " +  second);
	// Value of first is assigned to temporary
    float temporary = first;
    // Value of second is assigned to first
    first = second;
    // Value of temporary (which contains the initial value of first) is assigned to second
    second = (int) temporary;
    System.out.println("--After Swap");
    System.out.println("First Number :"+ first);
	System.out.println("Second Number :"+ second);
}
}
