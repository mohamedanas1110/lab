package lab1;
import java.util.Scanner;
class PrimeCheck {
public static void main(String[] args) {
	int temp;
	boolean isprime = true;
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter Any Number:");
	//Capture the input an integer
	int num=scan.nextInt();
	scan.close();
	for(int i= 2;i<=num/2;i++)
	{
		temp=num%i;
		if(temp==0)
		{
			isprime = false;
			
		}
		
	}
//If isprime is true then number is prime else not
	if(isprime)
		System.out.println(num +"is a Prime Number");
	else
		System.out.println(num+ "is not a prime Number");
}
}

