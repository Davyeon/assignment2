package week2;


import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	
	public void run() {
		
		println("This program lists the Fibonacci sequence.");
		
		/* I'll be listing the values of terms before I start my while loop*/

		int i=10000, fib1=0, fib2=1;
		
		/*This is where the max number for the sequence will be set */
		
		while (fib1 <= i) {
			
			println(fib1);
			
			int sum = (fib1 + fib2);
			fib1 = fib2;
			fib2 = sum;
			
			}
		}
		
	}